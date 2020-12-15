//package BillingSystem.persistence;
//
//
//
//import BillingSystem.entity.User;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import java.sql.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Access users in the user table.
// *
// * @author pwaite
// */
//public class UserData {
//
//    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    /**
//     * Gets all users.
//     *
//     * @return the all users
//     */
//    public List<User> getAllUsers() {
//
//        String sql = "SELECT * FROM user";
//        logger.info("Here's the select sql " + sql);
//        return executeQuery(sql);
//    }
//
//    /**
//     * Gets users by last name.
//     *
//     * @param lastName the last name
//     * @return the users by last name
//     */
//    public List<User> getUsersByLastName(String lastName) {
//
//        String sql = "SELECT * FROM user WHERE last_name like '%" + lastName + "%'";
//        return executeQuery(sql);
//    }
//
//    /**
//     * Executes the query passed in and returns the list of users
//     *
//     * @param sql
//     * @return list of users
//     */
//    private List<User> executeQuery(String sql) {
//
//
//        List<User> users = new ArrayList<User>();
//        Database database = Database.getInstance();
//        Connection connection = null;
//        try {
//            database.connect();
//            connection = database.getConnection();
//            Statement selectStatement = connection.createStatement();
//            ResultSet results = selectStatement.executeQuery(sql);
//            while (results.next()) {
//                User employee = createUserFromResults(results);
//                users.add(employee);
//            }
//            database.disconnect();
//        } catch (SQLException sqle) {
//            logger.error("UserData.getAllUsers()...SQLException: ", sqle);
//        } catch (Exception e) {
//            logger.error("UserData.getAllUsers()...Exception: ", e);
//        }
//        return users;
//    }
//
//    /**
//     * Create and return a user from the resultset
//     *
//     * @param results
//     * @return
//     * @throws SQLException
//     */
//    private User createUserFromResults(ResultSet results) throws SQLException {
//        User user = new User();
//        user.setName(results.getString("name"));
//        user.setUsername(results.getString("username"));
//        user.setPassword(results.getString("password"));
//        user.setAddress(results.getString("address"));
//        user.setCity(results.getString("city"));
//        user.setState(results.getString("state"));
//        user.setZipcode(results.getString("zip_code"));
//        user.setPhone(results.getString("phone"));
//        user.setDescription(results.getString("description"));
//        //dates are correct in db, but when retrieved as localdate, they were one day early...
//        LocalDate dob = results.getDate("date_of_birth").toLocalDate().plusDays(1);
//        user.setDateOfBirth(dob);
//        user.setId(results.getInt("id"));
//
//        return user;
//    }
//
//    /**
//     * Insert user.
//     *
//     * @param user the user
//     * @return the number of records inserted
//     */
//    public Integer insert(User user) {
//        int recordsUpdated = 0;
//        logger.info("Inserting " + user);
//        Database database = Database.getInstance();
//        Connection connection = null;
//        String sql = "INSERT INTO user ("
//                + " name,"
//                + " username,"
//                + " password,"
//                + " address,"
//                + " city,"
//                + " state,"
//                + " zip_code,"
//                + " phone,"
//                + " description,"
//                + " date_of_birth,"
//                + " id) VALUES ("
//                + " ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
//
//        return executeSql(user, sql);
//    }
//
//
//    /**
//     * Update user.
//     *
//     * @param user the user
//     * @return the number of records updated
//     */
//    public Integer update(User user) {
//        logger.info("Updating " + user);
//
//        Connection connection = null;
//        String sql = "UPDATE user SET name = ?, username = ?, password = ?, address = ?, city = ? state = ?,zipcode = ?,phone = ?,description = ?,date_of_birth = ? WHERE id = ?";
//
//        return executeSql(user, sql);
//    }
//
//
//
//    private Integer executeSql(User user, String sql) {
//        Connection connection;
//        Database database = Database.getInstance();
//        int recordsUpdated = 0;
//        try {
//            database.connect();
//            connection = database.getConnection();
//
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, user.getName());
//            st.setString(2, user.getUsername());
//            st.setString(3, user.getPassword());
//            st.setString(4, user.getAddress());
//            st.setString(5, user.getCity());
//            st.setString(6, user.getState());
//            st.setString(7, user.getZipcode());
//            st.setString(8, user.getPhone());
//            st.setString(9, user.getDescription());
//            st.setDate(10, Date.valueOf(user.getDateOfBirth()));
//            st.setInt(11, user.getId());
//
//            recordsUpdated = st.executeUpdate();
//            st.close();
//        } catch (SQLException sqle) {
//            logger.error("UserData.executeSQL...SQLException: ", sqle);
//        } catch (Exception e) {
//            logger.error("UserData.executeSQL()...Exception: ", e);
//        }
//        return recordsUpdated;
//    }
//
//    /**
//     * Gets the user by id.
//     *
//     * @param id the id
//     * @return the by id
//     */
//    public User getById(String id) {
//        String sql = "SELECT * FROM user WHERE id = " + id;
//        logger.info("Here's the select sql " + sql);
//        return executeQuery(sql).get(0);
//    }
//
//    /**
//     * Delete user
//     *
//     * @param id the id of the user to delete
//     * @return the number of records deleted
//     */
//    public Integer delete(Integer id) {
//        logger.info("Deleting user with id " + id);
//
//        Connection connection = null;
//        String sql = "delete from user WHERE id = ?";
//
//        Database database = Database.getInstance();
//        int recordsUpdated = 0;
//        try {
//            database.connect();
//            connection = database.getConnection();
//
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, id);
//
//            recordsUpdated = st.executeUpdate();
//            st.close();
//        } catch (SQLException sqle) {
//            logger.error("UserData.deleteUser...SQLException: ", sqle);
//        } catch (Exception e) {
//            logger.error("UserData.deleteUser()...Exception: ", e);
//        }
//        return recordsUpdated;
//    }
//}
//
