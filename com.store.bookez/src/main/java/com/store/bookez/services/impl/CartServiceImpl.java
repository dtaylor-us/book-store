package com.store.bookez.services.impl;

import com.store.bookez.domain.Cart;
import com.store.bookez.domain.Customer;
import com.store.bookez.repositories.CartRepository;
import com.store.bookez.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/10/2016.
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Iterable<Cart> CartListAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCartById(Integer id) {
        return cartRepository.findOne(id);
    }

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Iterable<Cart> saveCartList(Iterable<Cart> cartIterable) {
        return cartRepository.save(cartIterable);
    }

    @Override
    public void deleteCart(Integer id) {
        cartRepository.delete(id);
    }

    @Override
    public Cart findByCustomer(Customer customer) {
        return cartRepository.findByCustomer(customer);
    }
}
