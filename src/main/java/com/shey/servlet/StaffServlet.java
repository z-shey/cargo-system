package com.shey.servlet;

import com.shey.entity.Staff;
import com.shey.service.impl.StaffService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "StaffServlet", value = "/staff")
public class StaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");


        String data = (String) req.getAttribute("data");
        System.out.println(data);

/*

        String flag = req.getParameter("flag");

        switch (flag) {
            case "add_staff" -> {
                new StaffService().add(getStaff(req));
                resp.sendRedirect(req.getContextPath() + "/dashboard");
            }
            case "edit_staff_pre" -> {
                String staffId = req.getParameter("staff_id");
                req.setAttribute("staff", new StaffService().getById(Integer.valueOf(staffId)));
                req.getRequestDispatcher("/edit_staff.jsp").forward(req, resp);
            }
            case "edit_staff" -> {
                new StaffService().update(getStaffHaveId(req));
                resp.sendRedirect(req.getContextPath() + "/dashboard");
            }
            case "delete_staff" -> {
                new StaffService().delete(Integer.valueOf(req.getParameter("staff_id")));
                resp.sendRedirect(req.getContextPath() + "/dashboard");
            }
            case "detail_staff" -> {
                String staffId = req.getParameter("staff_id");
                req.setAttribute("staff", new StaffService().getById(Integer.valueOf(staffId)));
                req.getRequestDispatcher("/detail_staff.jsp").forward(req, resp);
            }
            case "detail_back" -> resp.sendRedirect(req.getContextPath() + "/dashboard");
        }
        */
    }

    private static Staff getStaff(HttpServletRequest req) {
        String staff_name = req.getParameter("staff_name");
        String staff_username = req.getParameter("staff_username");
        String staff_password = req.getParameter("staff_password");
        String role_id = req.getParameter("role_id");
        String warehouse_id = req.getParameter("warehouse_id");
        String staff_description = req.getParameter("staff_description");

        Staff staff = new Staff();
        staff.setStaff_name(staff_name);
        staff.setStaff_username(staff_username);
        staff.setStaff_password(staff_password);
        staff.setRole_id(Integer.valueOf(role_id));
        staff.setWarehouse_id(Integer.valueOf(warehouse_id));
        staff.setStaff_description(staff_description);
        return staff;
    }

    private static Staff getStaffHaveId(HttpServletRequest req) {
        String staff_id = req.getParameter("staff_id");
        String staff_name = req.getParameter("staff_name");
        String staff_username = req.getParameter("staff_username");
        String staff_password = req.getParameter("staff_password");
        String role_id = req.getParameter("role_id");
        String warehouse_id = req.getParameter("warehouse_id");
        String staff_description = req.getParameter("staff_description");


        Staff staff = new Staff();
        staff.setStaff_id(Integer.valueOf(staff_id));
        staff.setStaff_name(staff_name);
        staff.setStaff_username(staff_username);
        staff.setStaff_password(staff_password);
        staff.setRole_id(Integer.valueOf(role_id));
        staff.setWarehouse_id(Integer.valueOf(warehouse_id));
        staff.setStaff_description(staff_description);
        return staff;
    }
}
