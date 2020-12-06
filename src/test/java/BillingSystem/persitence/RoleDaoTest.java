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
    void SetUp() {
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
    void getByIdSuccess() {
        Role retrievedRole = (Role) genericDao.getById(1);
        assertEquals("JCoyne", retrievedRole.getUsername());
    }


    /**
     * Insert with role success.
     */
    @Test
    void insertWithRoleSuccess() {
        genericDao = new GenericDao(User.class);
        User user = (User)genericDao.getById(1);
        Role newRole = new Role("JCoyne","admin",user);
        user.addRole(newRole);

        int id = genericDao.insert(newRole);
        assertNotEquals(0,id);
        assertEquals("JCoyne", newRole.getUsername());
        assertNotNull(newRole.getUsername());
        assertEquals("Madison", newRole.getUser().getCity());

    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String retrievedUserName = "SuperSecret";
        Role roleToUpdate = (Role)genericDao.getById(1);
        roleToUpdate.setUsername(retrievedUserName);
        genericDao.saveOrUpdate((roleToUpdate));
        Role passwordAfterUpdate = (Role)genericDao.getById(1);
        assertEquals(retrievedUserName,passwordAfterUpdate.getUsername());

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
