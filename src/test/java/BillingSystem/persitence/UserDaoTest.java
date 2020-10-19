package BillingSystem.persitence;

import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDaoTest {
    GenericDao genericDao;

    @BeforeEach
    void SetUp(){
        genericDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL("role_test.sql");

    }

    @Test
    void getAllSuccess() {
        List<User> User = genericDao.getAll();
        assertEquals(6, User.size());
    }

    @Test
    void getByIdSuccess()
    {
        User retriedUser = (User)genericDao.getById(1);
        assertEquals("Joe", retriedUser.getUserName());
    }


    @Test
    void insertSuccessUser() {

            User newUser = new User("Dawn","DTilman","Dawn Tilman","123 Street st","Madison","WI","53711","6086925566","admin","user",LocalDate.parse("1163-01-01"));
        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        assertNotNull(insertedUser);
        assertEquals("Jose Lopez", insertedUser.getName());
        assertEquals("Jose",insertedUser.getUserName());
    }
    @Test
    void updateSuccess() {
        String newName = "JCoyne";
        User UserToUpdate = (User) genericDao.getById(1);
        UserToUpdate.setUserName(newName);
        genericDao.saveOrUpdate(UserToUpdate);
        User UserAfterUpdate = (User)genericDao.getById(1);
        assertEquals(newName, UserAfterUpdate.getUserName());
    }
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(7));
        assertNull(genericDao.getById(7));
    }


}
