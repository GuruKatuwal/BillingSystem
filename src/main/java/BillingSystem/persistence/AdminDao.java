package BillingSystem.persistence;

import BillingSystem.entity.Admin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class AdminDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get AdminDao by id
     */
    public BillingSystem.entity.Admin getById(int id) {
        Session session = sessionFactory.openSession();
        BillingSystem.entity.Admin Admin = session.get( BillingSystem.entity.Admin.class, id );
        session.close();
        return Admin;
    }

    /**
     * update AdminDao
     * @param Admin  AdminDao to be inserted or updated
     */
    public void saveOrUpdate(BillingSystem.entity.Admin Admin) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Admin);
        transaction.commit();
        session.close();
    }

    /**
     * insert AdminDao
     * @param Admin  AdminDao to be inserted
     */
    public int insert(BillingSystem.entity.Admin Admin) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Admin);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a AdminDao
     * @param Admin AdminDao to be deleted
     */
    public void delete(BillingSystem.entity.Admin Admin) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(Admin);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Employees
     *
     * @return All Employees
     */
    public List<BillingSystem.entity.Admin> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<BillingSystem.entity.Admin> query = builder.createQuery( BillingSystem.entity.Admin.class );
        Root<BillingSystem.entity.Admin> root = query.from( BillingSystem.entity.Admin.class );
        List<BillingSystem.entity.Admin> admins = session.createQuery( query ).getResultList();

        logger.debug("The list of admins " + admins);
        session.close();

        return admins;
    }

}
