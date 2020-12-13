package BillingSystem.persitence;
import BillingSystem.entity.Billing;
import BillingSystem.entity.Role;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type User dao test.
 */
public class UserDaoTest {
    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Set up.
     */
    @BeforeEach
    void SetUp(){
        genericDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL("user.sql");

    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<User> User = genericDao.getAll();
        assertEquals(6, User.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess()
    {
        User retriedUser = (User)genericDao.getById(1);
        assertEquals("Joe Coyne", retriedUser.getName());
    }


    /**
     * Insert success user.
     */
    @Test
    void insertSuccessUser() {

        User newUser = new User("Guru Katuwal","gkatuwal","Madison","123 Street st","Madison","WI","53711","6086925566","customer","01/01/1984");
        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        assertNotNull(insertedUser);
        assertEquals("Guru Katuwal", insertedUser.getName());
        assertEquals("6086925566",insertedUser.getPhone());
    }

    /**
     * Insert with account success.
     */
    @Test
    void insertWithBillingSuccess(){
        User newUser = new User("Guru Katuwal","gkatuwal","Madison","456 Street st","Madison","WI","53711","6086925566","customer","01/01/1984");

        Billing billing = new Billing("2020-10-10",140.00,40.00,200.00,"2020-10-10",90.00,75.00, newUser);

        newUser.addBilling(billing);

        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User) genericDao.getById(id);

        assertEquals("Guru Katuwal", insertedUser.getName());

    }
    @Test
    void insertWithRoleSuccess(){
        User newUser = new User("Guru Katuwal","DParker","Parkersecret","789 madison st","Madison","WI","53711","6086925566","customer","01/01/1984");

        Role role = new Role("Dparker","admin", newUser);

        newUser.addRole(role);

        int id = genericDao.insert(newUser);

        assertNotEquals(0, id);
        User insertedUser = (User) genericDao.getById(id);

        assertEquals("Guru Katuwal", insertedUser.getName());
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newName = "Joe";
        User UserToUpdate = (User) genericDao.getById(1);
        UserToUpdate.setName(newName);
        genericDao.saveOrUpdate(UserToUpdate);
        User UserAfterUpdate = (User)genericDao.getById(1);
        assertEquals(newName, UserAfterUpdate.getName());
    }

    /**
     * Delete success.
     */
//    @Test
//    void deleteSuccess() {
//        genericDao.delete(genericDao.getById(81));
//        assertNull(genericDao.getById(81));
//    }


}
