package com.store.bookez.repositories;

import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
public interface BookOrderRepository extends CrudRepository<BookOrder, Integer> {

    List<BookOrder> findByCustomer(Customer customer);
}
