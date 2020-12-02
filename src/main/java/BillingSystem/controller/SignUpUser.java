package BillingSystem.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BillingSystem.entity.Role;
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
        Role role = new Role();
        role.setUsername(req.getParameter("username"));
        role.setPassword(req.getParameter("password"));
        role.setRole(req.getParameter("role"));

        GenericDao dao = DaoFactory.createDao(Role.class);
        dao.insert(role);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConformation.jsp");
    }
}
