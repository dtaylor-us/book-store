package com.store.bookez.repositories;

import com.store.bookez.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by deretayl1 on 5/2/2016.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findByUserName(String username);
}
