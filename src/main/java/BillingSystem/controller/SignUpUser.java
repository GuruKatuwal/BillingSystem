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

@WebServlet(name = "SignUpUser", urlPatterns = {"/signUpUser"})

public class SignUpUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("name");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
//
//       GenericDao genericDao = new GenericDao(User.class);
//        User user = (User)genericDao.getById(Integer.parseInt("id"));
//
//
//        GenericDao dao = DaoFactory.createDao(Role.class);
//        dao.insert(role);
//        genericDao = new GenericDao(User.class);
//        User user = (User)genericDao.getById(1);
//        Role newRole = new Role("JCoyne","SuperSecret123","admin",user);
//        user.addRole(newRole)
//        Role role = new Role();
//        role.setUsername(req.getParameter("username"));
//        role.setPassword(req.getParameter("password"));
//        role.setRole(req.getParameter("role"));
//        logger.debug("Adding Roll " + role);

//        User user = new User();
//        role.setUser(user);

//
        GenericDao genericDao = new GenericDao(User.class);
//        User user = (User)genericDao.getById((id));
//        Role newRole = genericDao.getById(int id)
//        Role newRole = new Role(username,password,role,user);
//        genericDao.insert(role);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConformation.jsp");
        dispatcher.forward(req, resp);
    }
}
