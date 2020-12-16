package BillingSystem.controller;


import BillingSystem.entity.Billing;
import BillingSystem.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import BillingSystem.persistence.GenericDao;
import BillingSystem.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/generateBill"}
)

public class GenerateBill extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(Billing.class);
        List<Billing> billing = genericDao.getAll();
        req.setAttribute("billing", billing);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/generateBill.jsp");
        dispatcher.forward(req,resp);

    }

}