package com.store.bookez.services;

import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public interface BookOrderService {
    List<BookOrder> findByCustomer(Customer customer);


    Iterable<BookOrder> BookOrderListAll();
    BookOrder getBookOrderById(Integer id);
    BookOrder saveBookOrder(BookOrder bookOrder);
    Iterable<BookOrder> saveBookOrderList(Iterable<BookOrder> bookOrderIterable);
    void deleteBookOrder(Integer id);
}
