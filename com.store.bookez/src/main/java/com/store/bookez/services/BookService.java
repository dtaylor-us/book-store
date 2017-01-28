package com.store.bookez.services;

import com.store.bookez.domain.Book;
import com.store.bookez.domain.BookOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
public interface BookService {


    public Page<Book> getBookPages(Integer pageNumber);


    Iterable<Book> BookListAll();
    Book getBookById(Integer id);
    Book saveBook(Book book);
    Iterable<Book> saveBookList(Iterable<Book> bookIterable);
    void deleteBook(Integer id);
}
