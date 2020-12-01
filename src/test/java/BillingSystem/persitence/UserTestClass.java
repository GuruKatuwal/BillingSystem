//package BillingSystem.persitence;
//
//import BillingSystem.entity.Billing;
//import BillingSystem.entity.User;
//import BillingSystem.persistence.GenericDao;
//import BillingSystem.testUtils.Database;
//import org.junit.Before;
//import org.junit.Test;
//
//import javax.management.relation.Role;
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class UserTestClass {
//
//    /**
//     * The Dao.
//     */
//    GenericDao dao;
//    /**
//     * The Database utility.
//     */
//    Database database;
//    /**
//     * The Users.
//     */
//    List<User> users;
//
//    /**
//     * Sets up.
//     *
//     * @throws Exception the exception
//     */
//    @Before
//    public void setUp() throws Exception {
//        dao = new GenericDao(User.class);
//        database = new Database();
//        database.runSQL("user.sql");
//        users = dao.getAll();
//    }
//
//
//    /**
//     * Test get all users.
//     *
//     * @throws Exception the exception
//     */
//    @Test
//    public void testGetAllUsers() throws Exception {
//        assertTrue(users.size() > 0);
//        assertFalse(users.get(0).getUserName().equals(""));
//    }
//
//    /**
//     * Test update user.
//     *
//     * @throws Exception the exception
//     */
//    @Test
//    public void testUpdateUser() throws Exception {
//        User user = users.get(0);
//        int id = user.getId();
//        String updateValue = LocalDate.now().toString();
//        String emailBeforeUpdate = user.getUserName();
//        // it would be a good idea to test each value like this
//
//        user.setUserName(user.getUserName() + updateValue);
//
//        dao.saveOrUpdate(user);
//
//        User updatedUser = (User) dao.getById(id);
//
//        assertEquals(user, updatedUser);
//
//    }
//
//    /**
//     * Test delete user.
//     *
//     * @throws Exception the exception
//     */
//    @Test
//    public void testDeleteUser() throws Exception {
//        int sizeBeforeDelete = users.size();
//        User userToDelete = users.get(0);
//        int id = userToDelete.getId();
//        dao.delete(userToDelete);
//        int sizeAfterDelete = dao.getAll().size();
//
//        User deletedUser = (User) dao.getById(id);
//
//        assertEquals(sizeBeforeDelete - 1, sizeAfterDelete);
//        assertNull(deletedUser);
//
//    }
//
//
//    /**
//     * Test add user.
//     *
//     * @throws Exception the exception
//     */
//    @Test
//    public void testAddUser() throws Exception {
//
//        int insertedUserId = 0;
//
//        User user = new User();
//        user.setUserName("Unit");
//        user.setPassword("supersecret");
//        user.setName("Test");
//        user.setAddress("6851 Park st");
//        user.setCity("Madison");
//        user.setState("Wi");
//        user.setZipcode("53703");
//        user.setPhone("608-111-1234");
//        user.setDescription("Employee");
//        user.setDateOfBirth(LocalDate.parse("1990-01-01"));
//
//        Billing billing = new Billing();
//        billing.setPaymentDate("2020-10-10");
//        billing.setBillAmount("140");
//        billing.setPaidAmount("40");
//        billing.setPreviousBalance("50");
//        billing.setRegistration("100008");
//        billing.setUser(user);
//
//        user.addBilling(billing);
//
//        insertedUserId = dao.insert(user);
//        User retrievedUser = (User) dao.getById(insertedUserId);
//
//        assertTrue(insertedUserId > 0);
//        assertEquals(user, retrievedUser);
//        assertEquals(1, retrievedUser.getBillings().size());
//        assertTrue(retrievedUser.getBillings().contains(billing));
//
//    }
//    @Test
//    void insertWithRoleSuccess(){
//
//    }
//
//
//    /**
//     * Test get all users with last name exact.
//     *
//     * @throws Exception the exception
//     */
//    @Test
//    public void testGetAllUsersWithLastNameExact() throws Exception {
//        users = dao.getByPropertyEqual("userName", "Unit");
//        assertTrue(users.size() > 0);
//        assertTrue(users.get(0).getUserName().equals("Unit"));
//    }
//
//}