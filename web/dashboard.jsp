<%@ page import="com.shey.entity.Staff" %>
<%@ page import="com.shey.util.RoleUtil" %>
<%@ page import="com.shey.entity.RoleEnum" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Staff loginStaff = (Staff) session.getAttribute("loginStaff"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>仪表盘</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://kit.fontawesome.com/3b6cde5636.js"></script>
    <script src="https://registry.npmmirror.com/echarts/5.4.3/files/dist/echarts.min.js"></script>
    <script src="assets/js/style.js"></script>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <div class="bg_shadow"></div>
        <div class="sidebar_inner">
            <div class="close">
                <i class="fa-solid fa-xmark"></i>
            </div>
            <jsp:include page="dashboard_staff_info.jsp"/>
            <jsp:include page="dashboard_sidebar_menu.jsp"/>
            <div class="logout_btn">
                <a href="logout">登出</a>
            </div>
        </div>
    </div>

    <div class="main_container">
        <div class="navbar">
            <div class="hamburger"><i class="fa-solid fa-bars"></i></div>
            <div class="logo">
                <a href="#">货物管理系统</a>
                <small class="version">Beta ver 1.0.0</small>
            </div>
        </div>

        <jsp:include page="dashboard_index.jsp"/>

        <% if (RoleUtil.display(loginStaff,
                RoleEnum.NATIONAL_MANAGER,
                RoleEnum.DISTRICT_MANAGER,
                RoleEnum.WAREHOUSE_MANAGER,
                RoleEnum.STAFF_MANAGER)) {%>
        <jsp:include page="dashboard_staff.jsp"/>
        <% } %>

        <% if (RoleUtil.display(loginStaff,
                RoleEnum.NATIONAL_MANAGER,
                RoleEnum.DISTRICT_MANAGER,
                RoleEnum.WAREHOUSE_MANAGER)) {%>
        <jsp:include page="dashboard_cargo.jsp"/>
        <% } %>

        <% if (RoleUtil.display(loginStaff,
                RoleEnum.NATIONAL_MANAGER,
                RoleEnum.DISTRICT_MANAGER,
                RoleEnum.WAREHOUSE_MANAGER)) {%>
        <jsp:include page="dashboard_warehouse.jsp"/>
        <% } %>

        <% if (RoleUtil.display(loginStaff,
                RoleEnum.NATIONAL_MANAGER,
                RoleEnum.DISTRICT_MANAGER)) {%>
        <jsp:include page="dashboard_district.jsp"/>
        <% } %>
    </div>
</div>
</body>
</html>
