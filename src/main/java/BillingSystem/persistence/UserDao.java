//package BillingSystem.persistence;
//
//import BillingSystem.entity.User;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Expression;
//import javax.persistence.criteria.Root;
//import java.util.List;
//
//public class UserDao {
//    private final Logger logger = LogManager.getLogger(this.getClass());
//    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
//
//    /**
//     * Get UserDao by id
//     */
//    public User getById(int id) {
//        Session session = sessionFactory.openSession();
//        User User = session.get( BillingSystem.entity.User.class, id );
//        session.close();
//        return User;
//    }
//
//    /**
//     * update UserDao
//     * @param User  UserDao to be inserted or updated
//     */
//    public void saveOrUpdate(User User) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.saveOrUpdate(User);
//        transaction.commit();
//        session.close();
//    }
//
//    /**
//     * insert UserDao
//     * @param User  UserDao to be inserted
//     */
//    public int insert(User User) {
//        int id = 0;
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        id = (int)session.save(User);
//        transaction.commit();
//        session.close();
//        return id;
//    }
//
//    /**
//     * Delete a UserDao
//     * @param User UserDao to be deleted
//     */
//    public void delete(User User) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(User);
//        transaction.commit();
//        session.close();
//    }
//    public List<User> getUsersByLastName(String lastName) {
//
//        logger.debug("Searching for: {}", lastName);
//
//        Session session = sessionFactory.openSession();
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery(User.class);
//        Root<User> root = query.from(User.class);
//        Expression<String> propertyPath = root.get("lastName");
//        query.where(builder.like(propertyPath, "%" + lastName + "%"));
//        List<User> users = session.createQuery(query).getResultList();
//        session.close();
//        return users;
//    }
//
//
//    /** Return a list of all Employees
//     *
//     * @return All Employees
//     */
//    public List<User> getAll() {
//
//        Session session = sessionFactory.openSession();
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery( User.class );
//        Root<User> root = query.from( User.class );
//        List<User> users = session.createQuery( query ).getResultList();
//
//        logger.debug("The list of users " + users);
//        session.close();
//
//        return users;
//    }
//
//}
