//package BillingSystem.persitence;
//
//import BillingSystem.entity.Customer;
//import BillingSystem.persistence.CustomerDao;
//import BillingSystem.testUtils.Database;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//public class CustomerDaoTest {
//    CustomerDao dao;
//
//    @BeforeEach
//    void SetUp(){
////        Database database = Database.getInstance();
////        database.runSQL("customerTest.sql");
//        dao = new CustomerDao();
//    }
//
//    @Test
//    void getByIdSuccess()
//    {
//        Customer retriedCustomer = dao.getById(1);
//        assertEquals("larry king", retriedCustomer.getName());
//    }
//
//    @Test
//    void insertSuccessCustomer() {
//
//        Customer newCustomer = new Customer("salman","123 street","salman","man");
//        int id = dao.insert(newCustomer);
//        assertNotEquals(0,id);
//        Customer insertedCustomer = dao.getById(id);
//        assertNotNull(insertedCustomer);
//        assertEquals("salman", insertedCustomer.getName());
//        assertEquals("salman",insertedCustomer.getLogin());
//    }
//    @Test
//    void updateSuccess() {
//        String newName = "Dale Parker";
//        Customer customerToUpdate = dao.getById(3);
//        customerToUpdate.setName(newName);
//        dao.saveOrUpdate(customerToUpdate);
//        Customer customerAfterUpdate = dao.getById(3);
//        assertEquals(newName, customerAfterUpdate.getName());
//    }
//    @Test
//    void deleteSuccess() {
//        dao.delete(dao.getById(3));
//        assertNull(dao.getById(3));
//    }
//
//    @Test
//    void getAllSuccess() {
//        List<Customer> Customer = dao.getAll();
//        assertEquals(4, Customer.size());
//    }
//}
