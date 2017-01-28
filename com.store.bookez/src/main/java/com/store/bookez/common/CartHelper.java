package com.store.bookez.common;

import com.store.bookez.domain.Cart;
import com.store.bookez.repositories.CartRepository;
import com.store.bookez.repositories.CustomerRepository;
import com.store.bookez.services.CartService;
import com.store.bookez.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by deretayl1 on 5/11/2016.
 */
@Controller
public class CartHelper {
    @Autowired
    private static CustomerService customerService;

    @Autowired
    private static CartService cartService;


}
