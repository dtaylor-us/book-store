//package services;
//
//import com.store.bookez.Application;
//import com.store.bookez.domain.Customer;
//import com.store.bookez.services.CustomerService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
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
//@SpringApplicationConfiguration(classes = {Application.class})
//@WebAppConfiguration
//public class CustomerServiceTest {
//
//    @Autowired
//    private CustomerService customerService;
//
//    @Test
//    public void testSaveCustomer() {
//        Customer customer = new Customer();
//        assertNull(customer.getId());
//        customerService.saveCustomer(customer);
//        assertNotNull(customer.getId());
//
//        Customer foundCustomer = customerService.getCustomerById(customer.getId());
//        assertNotNull(foundCustomer);
//        assertEquals(foundCustomer.getId(), customer.getId());
//
//    }
//
//    @Test
//    public void testSaveCustomerList() {
//        List<Customer> customers = new ArrayList<>();
//
//        customers.add(new Customer("Customer1"));
//        customers.add(new Customer("Customer2"));
//        customers.add(new Customer("Customer3"));
//        customers.add(new Customer("Customer4"));
//        customers.add(new Customer("Customer5"));
//
//        customerService.saveCustomerList(customers);
//
//        Iterable<Customer> foundCustomerList = customerService.CustomerListAll();
//        assertEquals("Customer1", customerService.getCustomerById(1).getName());
//        assertEquals("Customer2", customerService.getCustomerById(2).getName());
//        assertEquals("Customer3", customerService.getCustomerById(3).getName());
//        assertEquals("Customer4", customerService.getCustomerById(4).getName());
//
//        int i = 0;
//        for (Customer customer : customerService.CustomerListAll()) {
//            i++;
//        }
//        assertEquals(5, i);
//    }
//
//    @Test
//    public void testDeleteCustomer() {
//        Customer customer = new Customer();
//        customerService.saveCustomer(customer);
//
//        int i = 0;
//        for (Customer customers : customerService.CustomerListAll()) {
//            i++;
//        }
//        assertEquals(7, i);
//
//        customerService.deleteCustomer(customer.getId());
//
//        i = 0;
//        for (Customer customers : customerService.CustomerListAll()) {
//            i++;
//        }
//
//        assertEquals(6, i);
//        assertNull(customerService.getCustomerById(7));
//    }
//
//
//
//}
