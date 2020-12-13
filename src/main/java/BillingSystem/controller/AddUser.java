package BillingSystem.controller;
import BillingSystem.entity.Role;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.util.DaoFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name ="AddUser",urlPatterns = { "/addUser"})

public class AddUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{

            GenericDao genericDao = new GenericDao();

            User newUser = new User(req.getParameter("name"),req.getParameter("username"),req.getParameter("password"),req.getParameter("address"),req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"),req.getParameter("dateOfBirth"));
            Role role = new Role(req.getParameter("username"),"user",newUser);

            newUser.addRole(role);
            logger.debug("Adding User: " + newUser);
            int id = genericDao.insert(newUser);
            System.out.print(newUser);
            System.out.print(role);

//        @Test
//        void insertWithRoleSuccess(){
//            User newUser = new User("Guru Katuwal","DParker","Parkersecret","789 madison st","Madison","WI","53711","6086925566","customer","01/01/1984");
//
//            Role role = new Role("Dparker","admin", newUser);
//
//            newUser.addRole(role);
//
//            int id = genericDao.insert(newUser);
//
//            assertNotEquals(0, id);
//            User insertedUser = (User) genericDao.getById(id);
//
//            assertEquals("Guru Katuwal", insertedUser.getName());
//        }

//        User user = new User();
//
//        user.setName(req.getParameter("name"));
//        user.setUsername(req.getParameter("username"));
//        user.setPassword(req.getParameter("password"));
//        user.setAddress(req.getParameter("address"));
//        user.setCity(req.getParameter("city"));
//        user.setState(req.getParameter("state"));
//        user.setZipcode(req.getParameter("zipcode"));
//        user.setPhone(req.getParameter("phone"));
//        user.setDescription(req.getParameter("description"));
//        user.setDescription(req.getParameter("Dateofbirth"));
//
//        Role role = new Role();
//        role.setUser(user);
//        role.setRole("user");
//        role.setUsername(req.getParameter("username"));
//        user.addRole(role);
//
//        logger.debug("Adding User " + user);
//
//
//        GenericDao genericDao = DaoFactory.createDao(User.class);
//        genericDao.insert(user);
//        int id = ((GenericDao)genericDao).insert(User.class);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req,resp);
    }
}
