package com.store.bookez.services.impl;

import com.store.bookez.domain.Customer;
import com.store.bookez.repositories.CustomerRepository;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> CustomerListAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Iterable<Customer> saveCustomerList(Iterable<Customer> customerIterable) {
        return customerRepository.save(customerIterable);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.delete(id);
    }

    @Override
    public Customer findByUserName(String userName) {
        return customerRepository.findByUserName(userName);
    }
}
