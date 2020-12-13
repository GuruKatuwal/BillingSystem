package BillingSystem.controller;


import BillingSystem.entity.Billing;
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

//        GenericDao<Billing> genericDao = DaoFactory.createDao(Billing.class);
//
//        req.setAttribute("billings", genericDao.getAll());
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/generateBill.jsp");
//        dispatcher.forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req, resp);
        GenericDao<Billing> genericDao = DaoFactory.createDao(Billing.class);
        List<Billing> billings = genericDao.getAll();
        req.setAttribute("billings", billings);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/generateBill.jsp");
        dispatcher.forward(req, resp);

    }
}