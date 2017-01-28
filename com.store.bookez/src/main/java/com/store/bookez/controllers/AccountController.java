package com.store.bookez.controllers;

import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Customer;
import com.store.bookez.services.BookOrderService;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AccountController {
    private Logger log = Logger.getLogger(AccountController.class);

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BookOrderService bookOrderService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/customer/account/", method = RequestMethod.GET)
    public String printUser(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("userName", auth.getName());
        model.addAttribute("customerList", customerService.CustomerListAll());
        customerAccountDetails(name, model);
        bookOrderDetails(name, model);
        return "customer/customer_account";
    }

    public void customerAccountDetails(String name, ModelMap model) {
        Customer customer = customerService.findByUserName(name);
        model.addAttribute("fullName", customer.getName());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("phoneNumber", customer.getPhoneNumber());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("bookList", bookService.BookListAll());

    }
    public void bookOrderDetails(String name, ModelMap model) {
        Customer customer = customerService.findByUserName(name);
        List<BookOrder> bookOrder = bookOrderService.findByCustomer(customer);

        for(BookOrder order : bookOrder){
            order.setTotalPrice(BookOrder.calcTotalOrderPrice(order));
        }
        log.info(bookOrder);
        log.info(customer);
        model.addAttribute("bookOrderList", bookOrder);



    }


}