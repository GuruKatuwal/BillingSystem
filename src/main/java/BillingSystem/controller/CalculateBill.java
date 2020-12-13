package BillingSystem.controller;
import BillingSystem.entity.Billing;
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

@WebServlet(name ="calculateBill",urlPatterns = { "/calculateBill"})

public class CalculateBill extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException{
//
////        @Test
////        void insertWithBillingSuccess(){
////            User newUser = new User("Guru Katuwal","gkatuwal","Madison","456 Street st","Madison","WI","53711","6086925566","customer","01/01/1984");
////
////            Billing billing = new Billing("2020-10-10",140.00,40.00,200.00,"2020-10-10",90.00,75.00, newUser);
////
////            newUser.addBilling(billing);
////
////            int id = genericDao.insert(newUser);
////            assertNotEquals(0, id);
////            User insertedUser = (User) genericDao.getById(id);
////
////            assertEquals("Guru Katuwal", insertedUser.getName());
////
////        }
//         GenericDao genericDao = new GenericDao(User.class);
//        User user = (User)genericDao.getById(1);
//        Billing newBilling = new Billing("2020-11-01",140.00,40.00,200.00,"2020-10-10",90.00,75.00, user);
//        user.addBilling(newBilling);
//        int id = genericDao.insert(newBilling);
//
//        assertNotEquals(0,id);
//        assertEquals("Joe Coyne", newBilling.getUser().getName());
//        assertNotNull(newBilling.getUser().getName());
//        assertEquals("2020-11-01", newBilling.getPaymentDate());
//
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao<User> genericDao = new GenericDao(User.class);
        User calculateBill = genericDao.getById(Integer.parseInt(req.getParameter("id")));

//        double unit = req.getParameter(Double.parseDouble(unit));
//        double previousBalance = req.getParameter(Double.parseDouble(previousBalance));
//
//
//        Billing newBill = new Billing("today's date",calculateBill(unit),0,0,"2020-10-10",presentReading,0, user)
//

        req.setAttribute("user", calculateBill);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculateBill.jsp");
        dispatcher.forward(req,resp);
        }
//        public static double calculateBill(double units)
//        {
//
//                // Condition to find the charges
//                // bar in which the units consumed
//                // is fall
//                if (units <= 100) {
//                        return units * 10;
//                }
//                else if (units <= 200) {
//                        return (100 * 10)
//                                + (units - 100)
//                                * 15;
//                }
//                else if (units <= 300) {
//                        return (100 * 10)
//                                + (100 * 15)
//                                + (units - 200)
//                                * 20;
//                }
//                else if (units > 300) {
//                        return (100 * 10)
//                                + (100 * 15)
//                                + (100 * 20)
//                                + (units - 300)
//                                * 25;
//                }
//                return 0;
//        }
////
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConformation.jsp");
//        dispatcher.forward(req,resp);
//    }
}
