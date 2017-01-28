//package repositories;
//
//import com.store.bookez.configuration.RepositoryConfiguration;
//import com.store.bookez.domain.Book;
//import com.store.bookez.domain.enums.BookRating;
//import com.store.bookez.repositories.BookRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
///**
// * Created by deretayl1 on 5/2/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//
//@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
//public class BookRepositoryTest {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//
////    @Test
////    public void testSaveBook() {
////        Book bk = new Book("Gone With The Wind", "111-1-1111-1111-1", "Fiction", 15,
////                "Philmon", "this is a summary", BookRating.NO_RATING.toString(), "link");
////        assertNull(bk.getId());
////        bookRepository.save(bk);
////        assertNotNull(bk.getId());
////
////        Book foundBook = bookRepository.findOne(bk.getId());
////        assertNotNull(foundBook);
////        assertEquals(foundBook.getId(), bk.getId());
////
////        foundBook.setAuthor("Taylor");
////        bookRepository.save(foundBook);
////
////        Book updatedBook = bookRepository.findOne(foundBook.getId());
////        assertEquals("Taylor", updatedBook.getAuthor());
////    }
//
//    @Test
//    public void testSaveBookList() {
//        List<Book> books = new ArrayList<>();
//
//        books.add(new Book("Book1"));
//        books.add(new Book("Book2"));
//        books.add(new Book("Book3"));
//        books.add(new Book("Book4"));
//        books.add(new Book("Book5"));
//
//        bookRepository.save(books);
//
//        Iterable<Book> foundBookList = bookRepository.findAll();
//        assertEquals("Book1", bookRepository.findOne(2).getTitle());
//        assertEquals("Book2", bookRepository.findOne(3).getTitle());
//
//        int i = 0;
//        for (Book book : bookRepository.findAll()) {
//            i++;
//        }
//        assertEquals(6, i);
//    }
//
//    @Test
//    public void testDeleteBook() {
//        Book book = new Book();
//        bookRepository.save(book);
//
//        int i = 0;
//        for (Book books : bookRepository.findAll()) {
//            i++;
//        }
//        assertEquals(7, i);
//
//        bookRepository.delete(book);
//
//        i = 0;
//        for (Book books : bookRepository.findAll()) {
//            i++;
//        }
//
//        assertEquals(6, i);
//        assertNull(bookRepository.findOne(7));
//    }
//}
