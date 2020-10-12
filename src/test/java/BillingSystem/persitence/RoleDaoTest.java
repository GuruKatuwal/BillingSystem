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

/**
 * The type Role dao test.
 */
public class RoleDaoTest {

    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Set up.
     */
    @BeforeEach
    void SetUp(){
        genericDao = new GenericDao(Role.class);
        Database database = Database.getInstance();
        database.runSQL("role_test.sql");

    }


    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess()
    {
        Role retriedRole = (Role)genericDao.getById(1);
        assertEquals("jcoyne", retriedRole.getUserName());
    }


    /**
     * Insert success role.
     */
    @Test
    void insertSuccessRole() {

        Role newRole = new Role("Salman", "admin");
        int id = genericDao.insert(newRole);
        assertNotEquals(0,id);
        Role insertedRole = (Role)genericDao.getById(id);
        assertNotNull(insertedRole);
        assertEquals("Salman", insertedRole.getUserName());
        assertEquals("admin",insertedRole.getRole());
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newFirstName = "GuruK";
        Role RoleToUpdate = (Role)genericDao.getById(1);
        RoleToUpdate.setUserName(newFirstName);
        genericDao.saveOrUpdate(RoleToUpdate);
        Role RoleAfterUpdate = (Role)genericDao.getById(1);
        assertEquals(newFirstName, RoleAfterUpdate.getUserName());
    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(4));
        assertNull(genericDao.getById(4));
    }


}
