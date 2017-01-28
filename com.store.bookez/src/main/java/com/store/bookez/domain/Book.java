package com.store.bookez.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BookId")
    private Integer id;

    @Version
    private Integer version;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<BookOrder> bookOrders;

    private String ISBN;
    private String title;
    private String author;
    private String price;
    private String rating;
    private String imageURL;
    private String imageURLFull;
    private String publDate;
    private int ebook = 0;

    public Book() {}
    public Book(String title){
        this.title = title;
    }
    public Book(String ISBN, String title, String author, String price, String rating, String imageURL) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
        this.imageURL = imageURL;
    }

    // region GET & SET

    public String getImageURLFull() {
        return imageURLFull;
    }

    public void setImageURLFull(String imageURLFull) {
        this.imageURLFull = imageURLFull;
    }

    public int getEbook() {
        return ebook;
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

    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(List<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int isEbook() {
        return ebook;
    }

    public void setEbook(int ebook) {
        this.ebook = ebook;
    }
    // endregion

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", version=" + version +
                ", bookOrders=" + bookOrders +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", rating='" + rating + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", ebook=" + ebook +
                '}';
    }
}
