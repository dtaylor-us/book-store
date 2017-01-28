package com.store.bookez.rest;

import com.store.bookez.domain.Book;
import com.store.bookez.domain.Customer;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by deretayl1 on 5/4/2016.
 */
@RestController
public class CustomerRestController {

    private BookService bookService;

    @Autowired
    public CustomerService customerService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/book/info/{id}")
    public Book getBookInfo(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/customer/get/{customerId}")
    public Customer getCustomer (@PathVariable Integer customerId){
        return customerService.getCustomerById(customerId);
    }

    @RequestMapping(value = "/customer/edit")
    public Customer editCustomer(@ModelAttribute ("editCustomer") Customer customer){
        return customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/customer/add")
    public Customer addCustomer(@ModelAttribute ("addCustomer") Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/customer/delete/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId){
        customerService.deleteCustomer(customerId);
    }
}
