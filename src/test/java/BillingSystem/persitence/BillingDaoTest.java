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

/**
 * The type Billing dao test.
 */
public class BillingDaoTest {
    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Set up.
     */
    @BeforeEach
    void SetUp(){
        genericDao = new GenericDao(Billing.class);
        Database database = Database.getInstance();
        database.runSQL("billing.sql");

    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<Billing> Billing = genericDao.getAll();
        assertEquals(6, Billing.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess()
    {
        Billing retriedBilling = (Billing)genericDao.getById(1);
        assertEquals(Double.valueOf(140.0), retriedBilling.getBillAmount());
    }


    /**
     * Insert success billing.
     */
    @Test
    void insertSuccessWithUser() {
        genericDao = new GenericDao(User.class);
        User user = (User)genericDao.getById(1);
        Billing newBilling = new Billing(140.00,40.00,200.00, user);
        user.addBilling(newBilling);
        int id = genericDao.insert(newBilling);

        assertNotEquals(0,id);
        assertEquals("Joe Coyne", newBilling.getUser().getName());
        assertNotNull(newBilling.getUser().getName());
        assertEquals(Double.valueOf(140.0), newBilling.getBillAmount());

    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        Double previousBalance = 50.0;
        Billing BillingToUpdate = (Billing) genericDao.getById(1);
        BillingToUpdate.setPreviousBalance(previousBalance);
        genericDao.saveOrUpdate(BillingToUpdate);
        Billing BillingAfterUpdate = (Billing)genericDao.getById(1);
        assertEquals(previousBalance, BillingAfterUpdate.getPreviousBalance());
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
