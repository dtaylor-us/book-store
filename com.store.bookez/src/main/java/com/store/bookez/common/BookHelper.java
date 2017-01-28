package com.store.bookez.common;

import com.store.bookez.domain.Book;
import com.store.bookez.domain.BookOrder;
import com.store.bookez.domain.Cart;
import com.store.bookez.repositories.BookRepository;
import com.store.bookez.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by deretayl1 on 5/10/2016.
 */
public class BookHelper {

    public static String NumberOfBooks(List<Book> books) {
        List<Book> bookList = books;
        Integer i = 0;
        for (Book book : bookList){
            i++;
        }
        return Integer.toString(i);
    }
}
