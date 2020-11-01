package BillingSystem.persitence;
import BillingSystem.entity.Billing;
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
        database.runSQL("role_test.sql");

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
        assertEquals("Joe", retriedUser.getUserName());
    }


    /**
     * Insert success user.
     */
    @Test
    void insertSuccessUser() {

        User newUser = new User("Dawn","DTilman","Dawn Tilman","123 Street st","Madison","WI","53711","6086925566","admin","customer",LocalDate.parse("1163-01-01"));
        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        assertNotNull(insertedUser);
        assertEquals("Dawn Tilman", insertedUser.getName());
        assertEquals("Dawn",insertedUser.getUserName());
    }

    /**
     * Insert with account success.
     */
    @Test
    void insertWithAccountSuccess(){
        User newUser = new User("Dawn","DTilman","Dawn Tilman","123 Street st","Madison","WI","53711","6086925566","admin","user",LocalDate.parse("1163-01-01"));

        Billing billing = new Billing("2020-10-10","140","40","2020-10-10","100","50","100008",newUser);

        newUser.addBilling(billing);

        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User) genericDao.getById(id);

        assertEquals("Dawn", insertedUser.getUserName());
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newName = "Joe";
        User UserToUpdate = (User) genericDao.getById(1);
        UserToUpdate.setUserName(newName);
        genericDao.saveOrUpdate(UserToUpdate);
        User UserAfterUpdate = (User)genericDao.getById(1);
        assertEquals(newName, UserAfterUpdate.getUserName());
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
