//package repositories;
//
//import com.store.bookez.configuration.RepositoryConfiguration;
//import com.store.bookez.domain.BookOrder;
//import com.store.bookez.domain.enums.OrderStatus;
//import com.store.bookez.repositories.BookOrderRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
///**
// * Created by deretayl1 on 5/2/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
//
//public class BookOrderRepositoryTest {
//
//    @Autowired
//    private BookOrderRepository bookOrderRepository;
//
//    @Test
//    public void testSaveOrder() {
//        BookOrder bookOrder = new BookOrder();
//        assertNull(bookOrder.getId());
//        bookOrderRepository.save(bookOrder);
//        assertNotNull(bookOrder.getId());
//
//        BookOrder foundOrder = bookOrderRepository.findOne(bookOrder.getId());
//        assertNotNull(foundOrder);
//        assertEquals(foundOrder.getId(), bookOrder.getId());
//
//        foundOrder.setOrderStatus(OrderStatus.CONFIRMED.toString());
//        bookOrderRepository.save(foundOrder);
//
//        BookOrder updatedOrder = bookOrderRepository.findOne(foundOrder.getId());
//        assertEquals("CONFIRMED", OrderStatus.CONFIRMED.toString());
//    }
//
//    @Test
//    public void testSaveBookList() {
//        List<BookOrder> books = new ArrayList<>();
//
//        books.add(new BookOrder());
//        books.add(new BookOrder());
//
//        bookOrderRepository.save(books);
//
//        Iterable<BookOrder> foundBookList = bookOrderRepository.findAll();
//
//        int i = 0;
//        for (BookOrder bookOrder : bookOrderRepository.findAll()) {
//            i++;
//        }
//        assertEquals(2, i);
//    }
//
//    @Test
//    public void testDeleteBookOrder() {
//        BookOrder bookOrder = new BookOrder();
//        bookOrderRepository.save(bookOrder);
//
//        int i = 0;
//        for (BookOrder bookOrders : bookOrderRepository.findAll()) {
//            i++;
//        }
//        assertEquals(1, i);
//
//        bookOrderRepository.delete(bookOrder);
//
//        i = 0;
//        for (BookOrder books : bookOrderRepository.findAll()) {
//            i++;
//        }
//
//        assertEquals(0, i);
//        assertNull(bookOrderRepository.findOne(7));
//    }
//
//
//}