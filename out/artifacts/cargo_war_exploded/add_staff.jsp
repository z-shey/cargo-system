<%@ page import="com.shey.entity.Role" %>
<%@ page import="com.shey.service.impl.RoleService" %>
<%@ page import="com.shey.service.impl.WarehouseService" %>
<%@ page import="com.shey.entity.Warehouse" %>
<%@ page import="com.shey.entity.Staff" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Staff loginStaff = (Staff) session.getAttribute("loginStaff"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户信息</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://kit.fontawesome.com/3b6cde5636.js"></script>
    <script src="assets/js/style.js"></script>
</head>
<body>
<div class="form-container">
    <div class="form-content">
        <h1>新增用户</h1>
        <p>请填写以下信息以创建新用户</p>
        <form class="input-form" action="staff?flag=add_staff" method="post">
            <input type="text" name="staff_name" placeholder="姓名">
            <input type="text" name="staff_username" placeholder="用户名">
            <input type="password" name="staff_password" placeholder="密码">

            <select name="role_id">
                <option value="" disabled selected>角色权限</option>
                <% for (Role role : new RoleService().getRolesWithPermissionLessThan(loginStaff)) { %>
                <option value="<%= role.getRole_id() %>">
                    <%= role.getRole_name() %>
                </option>
                <% } %>
            </select>

            <select name="warehouse_id">
                <option value="" disabled selected>仓库</option>
                <% for (Warehouse warehouse : new WarehouseService().getList()) { %>
                <option value="<%= warehouse.getWarehouse_id() %>">
                    <%= warehouse.getWarehouse_name() %>
                </option>
                <% } %>
            </select>

            <textarea name="staff_description" placeholder="请输入描述"></textarea>
            <button type="submit">新增</button>
        </form>
    </div>
</div>
</body>
</html>

