package BillingSystem.persitence;

import BillingSystem.entity.Role;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.persistence.RoleDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDaoTest {
    RoleDao dao;
    GenericDao genericDao;

    @BeforeEach
    void SetUp(){
        dao = new RoleDao();
        Database database = Database.getInstance();
        database.runSQL("role_test.sql");

    }


    @Test
    void getByIdSuccess()
    {
//        Role retriedRole = (Role)genericDao.getById(1);
        Role retriedRole = dao.getById(1);
        assertEquals("jcoyne", retriedRole.getUserName());
    }


    @Test
    void insertSuccessRole() {

        Role newRole = new Role("Salman", "Admin");
        int id = dao.insert(newRole);
        assertNotEquals(0,id);
        Role insertedRole = dao.getById(id);
        assertNotNull(insertedRole);
        assertEquals("Salman", insertedRole.getUserName());
        assertEquals("Admin",insertedRole.getRole());
    }
    @Test
    void updateSuccess() {
        String newFirstName = "GuruK";
        Role RoleToUpdate = dao.getById(1);
        RoleToUpdate.setUserName(newFirstName);
        dao.saveOrUpdate(RoleToUpdate);
        Role RoleAfterUpdate = dao.getById(1);
        assertEquals(newFirstName, RoleAfterUpdate.getUserName());
    }
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }


}
