package BillingSystem.persitence;


import BillingSystem.entity.Role;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Billing dao test.
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
        database.runSQL("role.sql");

    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<Role> roles = genericDao.getAll();
        assertEquals(6, roles.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess()
    {
        Role retrievedRole = (Role)genericDao.getById(1);
        assertEquals("JCoyne", retrievedRole.getUsername());
     }

    /**
     * Insert success .
     */
    @Test
    void insertSuccess() {
//        User user = (User)genericDao.getById(1);
//        Role newRole = new Role("JCoyne", "SuperSecret1", "admin",user);
//        user.addRole(newRole);
//        int id = genericDao.insert(newRole);
//        assertNotEquals(0,id);
//        Role insertedUser = (Role)genericDao.getById(id);
//        assertEquals("Joe Coyne", insertedUser.getUser().getName());
//        assertEquals("Madison", insertedUser.getUser().getCity());

//        genericDao = new GenericDao(Role.class);
//        User user = (User)genericDao.getById(1);
//        Role newRole = new Role("JCoyne", "SuperSecret1", "admin",user);
//        user.addRole((newRole));
//        int id = genericDao.insert(newRole);
//        Role insertRole = (Role)genericDao.getById(id);
//        assertEquals("Joe Coyne", insertRole.getUser().getName());
//        assertEquals("Madison", insertRole.getUser().getCity());

    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String retrivedPassword = "SuperSecret";
        Role roleToUpdate = (Role)genericDao.getById(1);
        roleToUpdate.setPassword(retrivedPassword);
        genericDao.saveOrUpdate((roleToUpdate));
        Role passwordAfterUpdate = (Role)genericDao.getById(1);
        assertEquals(retrivedPassword,passwordAfterUpdate.getPassword());

    }

    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Role> roles = genericDao.getByPropertyEqual("role","admin");
        assertEquals(5,roles.size());
        assertEquals(1,roles.get(0).getId());
    }

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Role> roles = genericDao.getByPropertyLike("role", "a");
        assertEquals(5, roles.size());
    }
    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(6));
        assertNull(genericDao.getById(6));
    }


}
