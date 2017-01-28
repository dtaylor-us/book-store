package com.store.bookez.domain;

import com.store.bookez.common.BookHelper;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by deretayl1 on 5/10/2016.
 */
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CartId")
    private Integer id;

    @Version
    private Integer version;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Customer customer;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Book> books;

    private String totalBooks;
    private String totalPrice;


    // region GET & SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getTotalBooks() {
        String totalBooks = BookHelper.NumberOfBooks(books);
        return totalBooks;    }
    public String getTotalPrice() {
        String totalPrice = calcTotalCartPrice(this);
        return totalPrice;
    }

    // endregion

    public static String calcTotalCartPrice(Cart cart) {
        //get the list of books
        List<Book> bookList = cart.books;
        //get the price from the books


        Double total = new Double(0);
        for (Book i : bookList) {
            total += Double.parseDouble(i.getPrice());
        }
        BigDecimal bigTotal = new BigDecimal(total).setScale(2, BigDecimal.ROUND_HALF_UP);
        return bigTotal.toString();
    }

}
