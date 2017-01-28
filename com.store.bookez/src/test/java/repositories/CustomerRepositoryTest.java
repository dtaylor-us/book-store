//package repositories;
//
//import com.store.bookez.configuration.RepositoryConfiguration;
//import com.store.bookez.domain.Customer;
//import com.store.bookez.repositories.CustomerRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//
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
//
//@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
//public class CustomerRepositoryTest {
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Test
//    public void testSaveCustomer() {
//        Customer customer = new Customer();
//        assertNull(customer.getId());
//        customerRepository.save(customer);
//        assertNotNull(customer.getId());
//
//        Customer foundCustomer = customerRepository.findOne(customer.getId());
//        assertNotNull(foundCustomer);
//        assertEquals(foundCustomer.getId(), customer.getId());
//
//        foundCustomer.setLastName("Taylor");
//        customerRepository.save(foundCustomer);
//
//        Customer updatedCustomer = customerRepository.findOne(foundCustomer.getId());
//        assertEquals("Taylor", updatedCustomer.getLastName());
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
//        customerRepository.save(customers);
//
//        Iterable<Customer> foundCustomerList = customerRepository.findAll();
//        assertEquals("Customer1", customerRepository.findOne(1).getName());
//        assertEquals("Customer2", customerRepository.findOne(2).getName());
//        assertEquals("Customer3", customerRepository.findOne(3).getName());
//        assertEquals("Customer4", customerRepository.findOne(4).getName());
//
//        int i = 0;
//        for (Customer customer : customerRepository.findAll()) {
//            i++;
//        }
//        assertEquals(5, i);
//    }
//
//    @Test
//    public void testDeleteCustomer() {
//        Customer customer = new Customer();
//        customerRepository.save(customer);
//
//        int i = 0;
//        for (Customer customers : customerRepository.findAll()) {
//            i++;
//        }
//        assertEquals(7, i);
//
//        customerRepository.delete(customer);
//
//        i = 0;
//        for (Customer customers : customerRepository.findAll()) {
//            i++;
//        }
//
//        assertEquals(6, i);
//        assertNull(customerRepository.findOne(7));
//    }
//
//}
