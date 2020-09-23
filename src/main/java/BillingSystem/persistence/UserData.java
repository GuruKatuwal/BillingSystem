package BillingSystem.persistence;



import BillingSystem.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {
    public List<User> getAllUsers(){
        String sql = "SELECT * FROM user";
        return executeQuery(sql);
    }
    public List<User> getUsersByLastName(String lastname){
        String sql = "SELECT * FROM user WHERE last_name like '%" + lastname + "%'";
        return executeQuery(sql);
    }
    public List<User> executeQuery(String sql) {
        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchUser.getAllUsers()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchUser.getAllUsers()...Exception: " + e);
        }
        return users;
    }


    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        user.setLastName(results.getString("last_name"));
        user.setFirstName(results.getString("first_name"));
        user.setUserName(results.getString("user_name"));
        user.setDateOfBirth(results.getDate("date_of_birth").toLocalDate());
        user.setId(results.getInt("id"));

        return user;
    }

}