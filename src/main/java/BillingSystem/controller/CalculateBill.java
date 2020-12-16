//package BillingSystem.controller;
//import BillingSystem.entity.Billing;
//import BillingSystem.entity.Role;
//import BillingSystem.entity.User;
//import BillingSystem.persistence.GenericDao;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.Date;
//
//@WebServlet(name ="calculateBill",urlPatterns = { "/calculateBill"})
//
//public class CalculateBill extends HttpServlet {
//    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException{
//
////        String name = req.getParameter("name");
////        String username = req.getParameter("username");
////        String password = req.getParameter("password");
////        String address = req.getParameter("address");
////        String city = req.getParameter("city");
////        String state = req.getParameter("state");
////        String zipcode = req.getParameter("zipcode");
////        String phone = req.getParameter("phone");
////        String description = req.getParameter("description");
////        int id = Integer.valueOf(req.getParameter("id"));
////
////        GenericDao genericDao = new GenericDao(User.class);
////        User userToUpdate = (User)genericDao.getById(id);
////
////        userToUpdate.setName(name);
////        userToUpdate.setUsername(username);
////        userToUpdate.setPassword(password);
////        userToUpdate.setAddress(address);
////        userToUpdate.setCity(city);
////        userToUpdate.setState(state);
////        userToUpdate.setZipcode(zipcode);
////        userToUpdate.setPhone(phone);
////        userToUpdate.setDescription(description);
////        genericDao.saveOrUpdate(userToUpdate);
////
////        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
////        dispatcher.forward(req,resp);
//        double billAmount = Double.parseDouble(req.getParameter("billAmount"));
//        double presentreading = Double.parseDouble(req.getParameter("presentreading"));
//        double previousBalance = Double.parseDouble(req.getParameter("previousBalance"));
//        int id = Integer.valueOf(req.getParameter("id"));
//
//
//        GenericDao genericDao = new GenericDao(Billing.class);
//        Billing userToUpdate = (Billing) genericDao.getById(id);
//
//        //set values
//        userToUpdate.setBillAmount(billAmount);
//        userToUpdate.setPresentreading(presentreading);
//        userToUpdate.setPreviousBalance(previousBalance);
//
//        genericDao.saveOrUpdate(userToUpdate);
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculateBill.jsp");
//        dispatcher.forward(req,resp);
//
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        GenericDao genericDao = new GenericDao(User.class);
//        req.setAttribute("users", genericDao.getById(Integer.parseInt(req.getParameter("id"))));
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculateBill.jsp");
//        dispatcher.forward(req,resp);
//    }
//
//
//}
