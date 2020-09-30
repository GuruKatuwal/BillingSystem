package BillingSystem.persistence;

import BillingSystem.entity.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CustomerDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get Customer by id
     */
    public Customer getById(int id) {
        Session session = sessionFactory.openSession();
        Customer Customer = session.get( Customer.class, id );
        session.close();
        return Customer;
    }

    /**
     * update Customer
     * @param Customer  Customer to be inserted or updated
     */
    public void saveOrUpdate(Customer Customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Customer);
        transaction.commit();
        session.close();
    }

    /**
     * insert Customer
     * @param Customer  Customer to be inserted
     */
    public int insert(Customer Customer) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Customer);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a Customer
     * @param Customer Customer to be deleted
     */
    public void delete(Customer Customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(Customer);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Customers
     *
     * @return All Customers
     */
    public List<Customer> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Customer> query = builder.createQuery( Customer.class );
        Root<Customer> root = query.from( Customer.class );
        List<Customer> Customers = session.createQuery( query ).getResultList();

        logger.debug("The list of Customers " + Customers);
        session.close();

        return Customers;
    }

}
