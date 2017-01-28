package com.store.bookez.controllers;

import com.store.bookez.services.BookOrderService;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deretayl1 on 5/6/2016.
 */
@Controller
public class AdminController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookOrderService bookOrderService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/admin")
    public String getAdminHome() {
        return "admin/adminHome";
    }

    @RequestMapping(value = "/admin/books")
    public String getAdminBooks(Model model){
        model.addAttribute("bookInventory", bookService.BookListAll());
        return "admin/admin_books";
    }

    @RequestMapping(value = "/admin/orders")
    public String getAdminOrders(Model model){
        model.addAttribute("orderList", bookOrderService.BookOrderListAll());
        return "admin/admin_orders";
    }

    @RequestMapping(value = "/admin/customers")
    public String getAdminCustomers(Model model){
        model.addAttribute("customerList", customerService.CustomerListAll());
        return "admin/admin_customers";
    }

//    @RequestMapping(value = "/admin/customers")
//    public String getAdminCustomers(Model model){
//        model.addAttribute("customerList", customerService.CustomerListAll());
//        return "admin/admin_customers";
//    }
}
