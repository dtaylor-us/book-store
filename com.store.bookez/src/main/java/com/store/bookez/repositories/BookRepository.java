package com.store.bookez.repositories;

import com.store.bookez.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by deretayl1 on 5/2/2016.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {
}
