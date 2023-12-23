package com.shey.servlet;

import com.shey.entity.Role;
import com.shey.entity.Staff;
import com.shey.service.impl.RoleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DashboardServlet", value = "/dashboard")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String data = (String) req.getAttribute("data");
        System.out.println(data);
/*
        Staff loginStaff = (Staff) req.getSession().getAttribute("loginStaff");

        if (loginStaff == null) {
            req.getRequestDispatcher(req.getContextPath() + "/login.jsp?error=log_in_first").forward(req, resp); // 如果用户没有登录，则重定向到登录页面
        } else {
            req.getSession().setAttribute("loginStaff", loginStaff);
            req.getRequestDispatcher("/dashboard.jsp").forward(req, resp); // 如果用户已经登录，则进行页面的渲染
        }


        */
    }
}
