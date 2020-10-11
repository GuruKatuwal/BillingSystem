package BillingSystem.persitence;

import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.persistence.UserDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDaoTest {
    UserDao dao;
    GenericDao genericDao;

    @BeforeEach
    void SetUp(){
        dao = new UserDao();
        Database database = Database.getInstance();
        database.runSQL("dump.sql");

    }

    @Test
    void getAllSuccess() {
        List<User> User = dao.getAll();
        assertEquals(6, User.size());
    }

    @Test
    void getByIdSuccess()
    {
//        User retriedUser = (User)genericDao.getById(1);
        User retriedUser = dao.getById(1);
        assertEquals("Joe", retriedUser.getFirstName());
    }


    @Test
    void insertSuccessUser() {

        User newUser = new User("Salman","Khan","salman","khan", LocalDate.parse("1163-01-01"));
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertNotNull(insertedUser);
        assertEquals("Salman", insertedUser.getFirstName());
        assertEquals("salman",insertedUser.getUserName());
    }
    @Test
    void updateSuccess() {
        String newFirstName = "Dale";
        User UserToUpdate = dao.getById(1);
        UserToUpdate.setFirstName(newFirstName);
        dao.saveOrUpdate(UserToUpdate);
        User UserAfterUpdate = dao.getById(1);
        assertEquals(newFirstName, UserAfterUpdate.getFirstName());
    }
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(6));
        assertNull(dao.getById(6));
    }


}
