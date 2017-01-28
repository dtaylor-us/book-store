package com.store.bookez.services;

import com.store.bookez.domain.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public interface CustomerService {
    Iterable<Customer> CustomerListAll();
    Customer getCustomerById(Integer id);
    Customer saveCustomer(Customer customer);
    Iterable<Customer> saveCustomerList(Iterable<Customer> customerIterable);
    void deleteCustomer(Integer id);
    Customer findByUserName(String userName);
}
