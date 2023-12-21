<%@ page import="com.shey.service.impl.RoleService" %>
<%@ page import="com.shey.service.impl.WarehouseService" %>
<%@ page import="com.shey.entity.Staff" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Staff staff = (Staff) request.getAttribute("staff"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户详情</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://kit.fontawesome.com/3b6cde5636.js"></script>
    <script src="assets/js/style.js"></script>
</head>
<body>
<div class="form-container">
    <div class="form-content">
        <h1>用户详情</h1>
        <p>用户详情</p>
        <form class="input-form" action="staff?flag=detail_back" method="post">
            <input type="text" name="staff_id" value="<%= staff.getStaff_id() %>" placeholder="员工ID" readonly>
            <input type="text" name="staff_name" value="<%= staff.getStaff_name() %>" placeholder="姓名" readonly>
            <input type="text" name="staff_username" value="<%= staff.getStaff_username() %>" placeholder="用户名"
                   readonly>
            <select name="role_id">
                <option value="<%= staff.getRole_id() %>" disabled selected>
                    <%= new RoleService().getById(staff.getRole_id()).getRole_name() %>
                </option>
            </select>
            <select name="warehouse_id">
                <option value="<%= staff.getWarehouse_id() %>" disabled selected>
                    <%= new WarehouseService().getById(staff.getRole_id()).getWarehouse_name() %>
                </option>
            </select>
            <textarea name="staff_description" id="description"></textarea>
            <button type="submit">返回</button>
        </form>
    </div>
</div>
<script>
    var textarea = document.getElementById('description');
    textarea.innerHTML = '<%= staff.getStaff_description() %>';
    textarea.readOnly = true;
</script>
</body>
</html>
