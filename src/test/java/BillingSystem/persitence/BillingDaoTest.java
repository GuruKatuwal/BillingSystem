package BillingSystem.persitence;
import BillingSystem.entity.Billing;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(4, Billing.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess()
    {
        Billing retriedBilling = (Billing)genericDao.getById(1);
        assertEquals(LocalDate.parse("2020-10-22"), retriedBilling.getPaymentDate());
    }


    /**
     * Insert success billing.
     */
//    @Test
//    void insertSuccess() {
//        genericDao = new GenericDao(Billing.class);
//        User user = (User)genericDao.getById(1);
//        Billing newBilling = new Billing(LocalDate.parse("2020-11-01"),140.00,40.00,200.00,LocalDate.parse("2020-10-10"),90.00,75.00, user);
//        user.addBilling((newBilling));
//
//        int id = genericDao.insert(newBilling);
//
//        Billing insertedBilling = (Billing)genericDao.getById(id);
//        assertEquals("joe Coyne", insertedBilling.getUser().getName());
//        assertEquals("2010-10-22",insertedBilling.getPaymentDate());
//    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        Double paymentUpdate = 50.0;
        Billing BillingToUpdate = (Billing) genericDao.getById(1);
        BillingToUpdate.setPaidAmount(paymentUpdate);
        genericDao.saveOrUpdate(BillingToUpdate);
        Billing BillingAfterUpdate = (Billing)genericDao.getById(1);
        assertEquals(paymentUpdate, BillingAfterUpdate.getPaidAmount());
    }

    /**
     * Delete success.
     */
//    @Test
//    void deleteSuccess() {
//        genericDao.delete(genericDao.getById(43));
//        assertNull(genericDao.getById(43));
//    }


}
