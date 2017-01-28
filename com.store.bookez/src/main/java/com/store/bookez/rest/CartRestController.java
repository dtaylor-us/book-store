package com.store.bookez.rest;

import com.store.bookez.common.LoginHelper;
import com.store.bookez.domain.Book;
import com.store.bookez.domain.Cart;
import com.store.bookez.domain.Customer;
import com.store.bookez.services.BookOrderService;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CartService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deretayl1 on 5/11/2016.
 */
@RestController
public class CartRestController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CartService cartService;
    @Autowired
    private BookService bookService;
    @Autowired
    private BookOrderService bookOrderService;

    @RequestMapping(value = "cart/add/{id}")
    public Cart addToCart(@PathVariable Integer id, Model model) {
        //LOOKUP CART BY CUSTOMER
        String username = LoginHelper.getUserName();
        Cart cart = cartService.findByCustomer(customerService.findByUserName(username));
        //IF CART IS NOT EQUAL TO NULL
        if (cart != null) {
            //ADD THE BOOK TO THE CART BY GETTING BOOK BY ID AND ADDING IT TO CART
            Book selectedBook = bookService.getBookById(id);
            cart.getBooks().add(selectedBook);
            cartService.saveCart(cart);

            return cart;
        } else {
            Cart newCart = new Cart();

            List<Book> cartList = new ArrayList<>();
            Book cartBook = bookService.getBookById(id);
            cartList.add(cartBook);

            Customer cartCustomer = customerService.findByUserName(username);
            newCart.setCustomer(cartCustomer);
            newCart.setBooks(cartList);

            cartService.saveCart(newCart);
            return cartService.getCartById(newCart.getId());
        }
        //ELSE CREATE A NEW CART AND ADD THE BOOK

    }

}
