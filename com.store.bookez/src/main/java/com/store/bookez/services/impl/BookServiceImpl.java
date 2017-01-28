package com.store.bookez.services.impl;

import com.store.bookez.domain.Book;
import com.store.bookez.repositories.BookRepository;
import com.store.bookez.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Service
@Transactional
public class  BookServiceImpl implements BookService {
    private static final int PAGE_SIZE = 8;

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getBookPages(Integer pageNumber){
        PageRequest request = new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "rating");
        return bookRepository.findAll(request);
    }

    @Override
    public Iterable<Book> BookListAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Iterable<Book> saveBookList(Iterable<Book> bookIterable) {
        return bookRepository.save(bookIterable);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.delete(id);
    }
}
