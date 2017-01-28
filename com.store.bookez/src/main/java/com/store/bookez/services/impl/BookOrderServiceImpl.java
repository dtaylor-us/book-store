package com.store.bookez.services.impl;

import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Customer;
import com.store.bookez.repositories.BookOrderRepository;
import com.store.bookez.services.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public class BookOrderServiceImpl implements BookOrderService {
    @Autowired
    private BookOrderRepository bookOrderRepository;

    @Override
    public Iterable<BookOrder> BookOrderListAll() {
        return bookOrderRepository.findAll();
    }

    @Override
    public BookOrder getBookOrderById(Integer id) {
        return bookOrderRepository.findOne(id);
    }

    @Override
    public List<BookOrder> findByCustomer(Customer customer) {
        return bookOrderRepository.findByCustomer(customer);
    }



    @Override
    public BookOrder saveBookOrder(BookOrder bookOrder) {
        return bookOrderRepository.save(bookOrder);
    }

    @Override
    public Iterable<BookOrder> saveBookOrderList(Iterable<BookOrder> bookOrderIterable) {
        return bookOrderRepository.save(bookOrderIterable);
    }

    @Override
    public void deleteBookOrder(Integer id) {
        bookOrderRepository.delete(id);
    }


}
