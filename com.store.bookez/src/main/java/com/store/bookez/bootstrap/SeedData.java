package com.store.bookez.bootstrap;

import com.store.bookez.domain.Book;
import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Customer;
import com.store.bookez.domain.enums.BookRating;
import com.store.bookez.services.BookOrderService;
import com.store.bookez.services.BookService;
import com.store.bookez.services.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {
    private Logger log = Logger.getLogger(SeedData.class);

    @Autowired
    private BookOrderService bookOrderService;

    @Autowired
    private BookService bookService;

    @Autowired
    private CustomerService customerService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        generateBookOrders();
//        BookOrder bo = bookOrderService.getBookOrderById(21);
//        bo.calcTotalPrice();
//        System.out.println(bo.calcTotalPrice());


    }

//    public void generateBookOrders() {
//        BookOrder bookOrder = new BookOrder("April 20, 2016", "May 5, 2016", "FULFILLED");
//
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(bookService.getBookById(8));
//        bookList.add(bookService.getBookById(22));
//
//        Customer customer = customerService.getCustomerById(1);
//
//        bookOrder.setBooks(bookList);
//        bookOrder.setCustomer(customer);
//
//        bookOrderService.saveBookOrder(bookOrder);
//
//        log.info(bookOrder.toString());
//    }

}