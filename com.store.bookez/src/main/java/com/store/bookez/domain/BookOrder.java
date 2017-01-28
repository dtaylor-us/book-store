package com.store.bookez.domain;

import com.store.bookez.common.BookHelper;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Entity
public class BookOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderId")
    private Integer id;

    @Version
    private Integer version;

    private String orderDate;
    private String shipDate;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Customer customer;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Book> books;

    private String orderStatus;
    private String totalPrice;
    private String totalBooks;

    public BookOrder() {}

    public BookOrder(String orderDate, String shipDate, String orderStatus) {
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.orderStatus = orderStatus;
    }

    // region GET & SET
    public String getTotalBooks() {
        String totalBooks = BookHelper.NumberOfBooks(books);
        return totalBooks;
    }


    public String getTotalPrice() {
        String totalPrice = calcTotalOrderPrice(this);
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    //endregion


    @Override
    public String toString() {
        return "BookOrder{" +
                "id=" + id +
                ", version=" + version +
                ", orderDate='" + orderDate + '\'' +
                ", shipDate='" + shipDate + '\'' +
                ", customer=" + customer +
                ", books=" + books +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

    public static String calcTotalOrderPrice(BookOrder bookOrder) {
        //get the list of books
        List<Book> bookList = bookOrder.books;
        //get the price from the books


        Double total = new Double(0);
        for (Book i : bookList) {
            total += Double.parseDouble(i.getPrice());
        }
        BigDecimal bigTotal = new BigDecimal(total).setScale(2, BigDecimal.ROUND_HALF_UP);
        return bigTotal.toString();
    }


}

