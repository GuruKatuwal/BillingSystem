package BillingSystem.persitence;

import BillingSystem.entity.Account;
import BillingSystem.persistence.GenericDao;
import BillingSystem.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AccountDaoTest {
    GenericDao genericDao;

    @BeforeEach
    void SetUp(){
        genericDao = new GenericDao(Account.class);
        Database database = Database.getInstance();
        database.runSQL("account.sql");

    }

    @Test
    void getAllSuccess() {
        List<Account> Account = genericDao.getAll();
        assertEquals(6, Account.size());
    }

    @Test
    void getByIdSuccess()
    {
        Account retriedAccount = (Account)genericDao.getById(1);
        assertEquals("Joe", retriedAccount.getName());
    }


    @Test
    void insertSuccessAccount() {

        Account newAccount = new Account("Guru Katuwal","999 Street st","1000007");
        int id = genericDao.insert(newAccount);
        assertNotEquals(0,id);
        Account insertedAccount = (Account)genericDao.getById(id);
        assertNotNull(insertedAccount);
        assertEquals("Guru Katuwal", insertedAccount.getName());
        assertEquals("1000007",insertedAccount.getReg_no());
    }
    @Test
    void updateSuccess() {
        String newName = "Joe";
        Account AccountToUpdate = (Account) genericDao.getById(1);
        AccountToUpdate.setName(newName);
        genericDao.saveOrUpdate(AccountToUpdate);
        Account AccountAfterUpdate = (Account)genericDao.getById(1);
        assertEquals(newName, AccountAfterUpdate.getName());
    }
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(17));
        assertNull(genericDao.getById(17));
    }

}
