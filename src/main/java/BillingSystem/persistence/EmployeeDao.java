package BillingSystem.persistence;

import BillingSystem.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get Employee by id
     */
    public Employee getById(int id) {
        Session session = sessionFactory.openSession();
        Employee Employee = session.get( Employee.class, id );
        session.close();
        return Employee;
    }

    /**
     * update Employee
     * @param Employee  Employee to be inserted or updated
     */
    public void saveOrUpdate(Employee Employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Employee);
        transaction.commit();
        session.close();
    }

    /**
     * insert Employee
     * @param Employee  Employee to be inserted
     */
    public int insert(Employee Employee) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Employee);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a Employee
     * @param Employee Employee to be deleted
     */
    public void delete(Employee Employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(Employee);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Employees
     *
     * @return All Employees
     */
    public List<Employee> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> query = builder.createQuery( Employee.class );
        Root<Employee> root = query.from( Employee.class );
        List<Employee> Employees = session.createQuery( query ).getResultList();

        logger.debug("The list of Employees " + Employees);
        session.close();

        return Employees;
    }

}
