package BillingSystem.controller;

import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
import BillingSystem.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(
        urlPatterns = {"/editUser"}
)

public class EditUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipcode = req.getParameter("zipcode");
        String phone = req.getParameter("phone");
        String description = req.getParameter("description");
        int id = Integer.valueOf(req.getParameter("id"));

        GenericDao genericDao = new GenericDao(User.class);
        User userToUpdate = (User)genericDao.getById(id);

        userToUpdate.setName(name);
        userToUpdate.setUsername(username);
        userToUpdate.setPassword(password);
        userToUpdate.setAddress(address);
        userToUpdate.setCity(city);
        userToUpdate.setState(state);
        userToUpdate.setZipcode(zipcode);
        userToUpdate.setPhone(phone);
        userToUpdate.setDescription(description);


        genericDao.saveOrUpdate(userToUpdate);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        req.setAttribute("user", genericDao.getById(Integer.parseInt(req.getParameter("id"))));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req,resp);
    }
}
