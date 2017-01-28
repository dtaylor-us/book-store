package com.store.bookez.repositories;

import com.store.bookez.domain.Cart;
import com.store.bookez.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by deretayl1 on 5/10/2016.
 */
public interface CartRepository extends CrudRepository<Cart, Integer> {
    Cart findByCustomer(Customer customer);
}
