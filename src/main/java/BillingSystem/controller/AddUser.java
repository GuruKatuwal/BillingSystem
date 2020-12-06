//package BillingSystem.controller;
//import BillingSystem.entity.Role;
//import BillingSystem.entity.User;
//import BillingSystem.persistence.GenericDao;
//import BillingSystem.util.DaoFactory;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//@WebServlet(name ="AddUser",urlPatterns = { "/addUser"})
//
//public class AddUser extends HttpServlet {
//    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException{
//        User user = new User();
//        user.setName(req.getParameter("name"));
//        user.setAddress(req.getParameter("address"));
//        user.setCity(req.getParameter("city"));
//        user.setZipcode(req.getParameter("zipcode"));
//        user.setPhone(req.getParameter("phone"));
//        user.setDescription(req.getParameter("description"));
//        user.setDescription(req.getParameter("Dateofbirth"));
//
//        Role role = new Role();
//        role.setUser(user);
//        role.setRole("user");
//        user.addRole(role);
//
//        logger.debug("Adding User " + user);
//
//
//        GenericDao genericDao = DaoFactory.createDao(User.class);
//        int id = ((GenericDao)genericDao).insert(User.class);
//
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConformation.jsp");
//        dispatcher.forward(req,resp);
//    }
//}
