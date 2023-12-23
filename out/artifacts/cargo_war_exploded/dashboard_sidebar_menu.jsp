<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="sidebar_menu">
    <li class="active">
        <a onclick="changeContent('dashboard_index')">
            <div class="icon"><i class="fa-solid fa-table-columns"></i></div>
            <div class="title">工作区</div>
        </a>
    </li>
    <li>
        <a onclick="changeContent('staff_management')">
            <div class="icon"><i class="fa-solid fa-users"></i></div>
            <div class="title">用户管理</div>
        </a>
    </li>
    <li>
        <a onclick="changeContent('cargo_management')">
            <div class="icon"><i class="fa-solid fa-box-open"></i></div>
            <div class="title">货物管理</div>
        </a>
    </li>
    <li>
        <a onclick="changeContent('warehouse_management')">
            <div class="icon"><i class="fa-solid fa-house-flag"></i></div>
            <div class="title">仓库管理</div>
        </a>
    </li>
    <li>
        <a onclick="changeContent('district_management')">
            <div class="icon"><i class="fa-solid fa-map"></i></div>
            <div class="title">片区</div>
        </a>
    </li>
</ul>