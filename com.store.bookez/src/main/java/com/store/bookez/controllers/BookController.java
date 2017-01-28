package com.store.bookez.controllers;

import com.store.bookez.common.LoginHelper;
import com.store.bookez.domain.Book;
import com.store.bookez.domain.Cart;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CartService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/customer")
    public String getCustomerHome(Model model) {
        model.addAttribute("bookList", bookService.BookListAll());
        getCartTotal(model);
        LoginHelper.displayUserName(model);

        return "customer/customerHome";
    }

    @RequestMapping(value = "/customer/books")
    public String getCustomerBooks(Model model) {
        model.addAttribute("bookList", bookService.BookListAll());
        getCartTotal(model);

        LoginHelper.displayUserName(model);


        return "customer/customer_books";
    }

    @RequestMapping(value = "/customer/pages/{pageNumber}", method = RequestMethod.GET)
    public String getRunbookPage(@PathVariable Integer pageNumber, Model model) {
        getCartTotal(model);

        LoginHelper.displayUserName(model);
        setUpPagination(pageNumber, model);


        return "customer/customer_books";
    }

    // region CONTROLLER METHODS
    public void setUpPagination(@PathVariable Integer pageNumber, Model model) {
        Page<Book> page = bookService.getBookPages(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("bookList", page.getContent());
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
    }


    // JSON Controllers
    // returns JSON of Cart by cartId  -- not currently used
    @RequestMapping(value = "/cart/{cartId}")
    public @ResponseBody Cart getCartTotalService(@PathVariable Integer cartId) {
        String username = LoginHelper.getUserName();
        Cart cart = cartService.findByCustomer(customerService.findByUserName(username));
        return cart;
    }


    public void getCartTotal(Model model) {
        String username = LoginHelper.getUserName();
        Cart cart = cartService.findByCustomer(customerService.findByUserName(username));
        model.addAttribute("cartTotal", cart.getTotalBooks());
    }

    // endregion

}
