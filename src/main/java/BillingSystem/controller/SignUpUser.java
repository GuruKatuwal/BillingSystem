package BillingSystem.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BillingSystem.entity.Role;
import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.util.DaoFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;

@WebServlet( urlPatterns = {"/signUpUser"})

public class SignUpUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String address = req.getParameter("address");
//        String city = req.getParameter("city");
//        String state = req.getParameter("state");
//        String zipcode = req.getParameter("zipcode");
//        String phone = req.getParameter("phone");
//        String description = req.getParameter("description");
//        String dateOfBirth = req.getParameter("dateOfBirth");
//
//        GenericDao genericDao = new GenericDao(User.class);
//        User newUser = new User(name,username,password,address,city,state,zipcode,phone,description,dateOfBirth);
//
//        String userRole = "user";
//        Role role = new Role(username, userRole, newUser);
//
//        newUser.addRole(role);
//
//        req.setAttribute("users", genericDao.insert(newUser));
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
//        dispatcher.forward(req,resp);




//            User user = new User();
//            user.setName(req.getParameter("name"));
//            user.setUsername(req.getParameter("username"));
//            user.setPassword(req.getParameter("password"));
//            user.setAddress(req.getParameter("address"));
//            user.setCity(req.getParameter("city"));
//            user.setZipcode(req.getParameter("zipcode"));
//            user.setPhone(req.getParameter("phone"));
//            user.setDescription(req.getParameter("description"));
//            user.setDescription(req.getParameter("Dateofbirth"));
//
//            logger.debug("Adding User " + user);
//
//            Role role = new Role();
//            role.setUser(user);
//            role.setRole("user");
//            user.addRole(role);
//
//            GenericDao genericDao = DaoFactory.createDao(User.class);
//            genericDao.insert(user);
//
//            req.setAttribute("users",genericDao.insert(user));
//            RequestDispatcher dispatcher = req.getRequestDispatcher("searchUser?searchTerm=&submit=viewAll");
//            dispatcher.forward(req,resp);

//            GenericDao<User> genericDao = DaoFactory.createDao(User.class);
//            User newUser = new User(req.getParameter("name"),req.getParameter("username"),req.getParameter("password"),req.getParameter("address"),
//                    req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"),req.getParameter("Dateofbirth"));
//
//            String userRoleName = "user";
//            String userName = req.getParameter("username");
//            Role userRole = new Role(userName,userRoleName,newUser);
//            newUser.addRole(userRole);
//            int id = genericDao.insert(newUser);

//             User insertedUser = (User)genericDao.getById(id);
        GenericDao genericDao = new GenericDao();

        User newUser = new User(req.getParameter("name"),req.getParameter("username"),req.getParameter("password"),req.getParameter("address"),req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"),req.getParameter("dateOfBirth"));
        Role role = new Role(req.getParameter("username"),"user",newUser);

        newUser.addRole(role);
        logger.debug("Adding User: " + newUser);
        logger.debug("Adding User: " + newUser);
//        int id = genericDao.insert(newUser);
        logger.warn(newUser);
        logger.info(role);
//
    }
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                RequestDispatcher dispatcher = req.getRequestDispatcher("searchUser?searchTerm=&submit=viewall");
                dispatcher.forward(req, resp);
        }

}

