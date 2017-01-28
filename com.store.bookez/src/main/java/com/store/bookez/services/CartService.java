package com.store.bookez.services;

import com.store.bookez.domain.Cart;
import com.store.bookez.domain.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/10/2016.
 */
@Service
public interface CartService {
    Cart findByCustomer(Customer customer);

    Iterable<Cart> CartListAll();
    Cart getCartById(Integer id);
    Cart saveCart(Cart cart);
    Iterable<Cart> saveCartList(Iterable<Cart> cartIterable);
    void deleteCart(Integer id);
}
