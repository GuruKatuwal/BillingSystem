package BillingSystem.controller;

import BillingSystem.entity.User;
import BillingSystem.persistence.GenericDao;
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

        GenericDao genericDao = new GenericDao(User.class);

        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipcode = req.getParameter("zipcode");
        String phone = req.getParameter("phone");
        String description = req.getParameter("description");
        String dateOfBirth = req.getParameter("dateOfBirth");
        int id = Integer.valueOf(req.getParameter("id"));


        User userToUpdate = (User)genericDao.getById(id);

        userToUpdate.setName(name);
        userToUpdate.setAddress(address);
        userToUpdate.setCity(city);
        userToUpdate.setState(state);
        userToUpdate.setZipcode(zipcode);
        userToUpdate.setPhone(phone);
        userToUpdate.setDescription(description);
        userToUpdate.setDateOfBirth(LocalDate.parse(dateOfBirth));

        genericDao.saveOrUpdate(userToUpdate);

//        @Test
//        void updateSuccess() {
//            GenericDao genericDao = new GenericDao(User.class);
//            String newName = "Joe";
//            User UserToUpdate = (User) genericDao.getById(1);
//            UserToUpdate.setName(newName);
//            genericDao.saveOrUpdate(UserToUpdate);
//            User UserAfterUpdate = (User)genericDao.getById(1);
//            assertEquals(newName, UserAfterUpdate.getName());
//        }

//
//       if (req.getParameter("id").equals("")) {
//
//          User user = new User(req.getParameter("name"),req.getParameter("address"),req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"),req.getParameter("dateOfBirth"));
//           genericDao.insert(user);
//      }else {
//
//           User user = new User(Integer.valueOf(req.getParameter("id")),req.getParameter("name"),req.getParameter("address"),req.getParameter("city"),req.getParameter("state"),req.getParameter("zipcode"),req.getParameter("phone"),req.getParameter("description"),req.getParameter("dateOfBirth"));
//           genericDao.saveOrUpdate(user);
//       }
//       RequestDispatcher dispatcher = req.getRequestDispatcher("searchUser?searchTerm=submit=viewAll");
//       dispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao genericDao = new GenericDao(User.class);

        req.setAttribute("user", genericDao.getById(Integer.parseInt(req.getParameter("id"))));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req,resp);
    }
}
