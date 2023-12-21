<%@ page import="com.shey.entity.Role" %>
<%@ page import="com.shey.service.impl.RoleService" %>
<%@ page import="com.shey.service.impl.WarehouseService" %>
<%@ page import="com.shey.entity.Warehouse" %>
<%@ page import="com.shey.entity.Staff" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Staff loginStaff = (Staff) session.getAttribute("loginStaff");
    Staff staff = (Staff) request.getAttribute("staff");
%>
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
        <h1>修改用户</h1>
        <p>请填写以下信息以修改用户信息</p>
        <form class="input-form" action="staff?flag=edit_staff" method="post">
            <input type="text" name="staff_id" value="<%= staff.getStaff_id() %>" placeholder="员工ID" readonly>
            <input type="text" name="staff_name" value="<%= staff.getStaff_name() %>" placeholder="姓名">
            <input type="text" name="staff_username" value="<%= staff.getStaff_username() %>" placeholder="用户名">
            <input type="password" name="staff_password" value="<%= staff.getStaff_password() %>" placeholder="密码">

            <select name="role_id">
                <option value="<%= staff.getRole_id() %>">
                    <%= new RoleService().getById(staff.getRole_id()).getRole_name() %>
                </option>
                <% for (Role role : new RoleService().getRolesWithPermissionLessThan(loginStaff)) {
                    if (!Objects.equals(role.getRole_id(), loginStaff.getRole_id())) {%>
                <option value="<%= role.getRole_id() %>">
                    <%= role.getRole_name() %>
                </option>
                <% }
                } %>
            </select>

            <select name="warehouse_id">
                <option value="<%= staff.getWarehouse_id() %>">
                    <%= new WarehouseService().getById(staff.getRole_id()).getWarehouse_name() %>
                </option>
                <% for
                (Warehouse warehouse : new WarehouseService().getList()) {
                    if (!Objects.equals(warehouse.getWarehouse_id(), loginStaff.getWarehouse_id())) {%>
                <option value="<%= warehouse.getWarehouse_id() %>">
                    <%= warehouse.getWarehouse_name() %>
                </option>
                <% }
                } %>
            </select>

            <textarea name="staff_description" id="description" placeholder="请输入描述"></textarea>
            <div class="button-group">
                <button type="submit">修改信息</button>
                <button type="button"
                        onclick="confirmDelete('staff?flag=delete_staff&staff_id=<%= staff.getStaff_id() %>')">删除
                </button>
            </div>
        </form>
    </div>
</div>
<script>
    var textarea = document.getElementById('description');
    textarea.innerHTML = '<%= staff.getStaff_description() %>';

    function confirmDelete(src) {
        if (confirm("确定要删除吗？")) {
            location.href = src;
        }
    }
</script>
</body>
</html>
