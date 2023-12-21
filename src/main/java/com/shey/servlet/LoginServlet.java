package com.shey.servlet;

import com.shey.entity.Staff;
import com.shey.service.impl.StaffService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username + " " + password);
        boolean isValid = new StaffService().isValid(username, password);
        System.out.println(isValid);
        if (isValid) {
            Staff loginStaff = new StaffService().login(username, password);
            req.getSession().setAttribute("loginStaff", loginStaff);
            resp.sendRedirect(req.getContextPath() + "/dashboard");
        } else {
            req.getRequestDispatcher(req.getContextPath() + "/login.jsp?error=login_failure").forward(req, resp);
        }
    }
}