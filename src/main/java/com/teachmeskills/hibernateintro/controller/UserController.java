// не использовать!!!
/*package com.teachmeskills.hibernateintro.controller;

import com.teachmeskills.hibernateintro.model.User;
import com.teachmeskills.hibernateintro.repository.BaseRepository;
import com.teachmeskills.hibernateintro.service.BaseService;
import com.teachmeskills.hibernateintro.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class UserController extends HttpServlet {

    private BaseService<User> service = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lName = req.getParameter("lName");
        String address = req.getParameter("address");
        boolean isMarried = req.getParameter("isMarried").equals("true");
        User user = new User(name, lName, address, isMarried);
        service.create(user);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}*/
