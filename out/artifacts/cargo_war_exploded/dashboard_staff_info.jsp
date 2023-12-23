<%@ page import="com.shey.entity.Staff" %>
<%@ page import="com.shey.service.impl.RoleService" %>
<%@ page import="com.shey.util.RoleUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Staff loginStaff = (Staff) request.getSession().getAttribute("loginStaff"); %>
<div class="profile_info">
    <div class="profile_img">
        <img src="https://img.zcool.cn/community/01cfd95d145660a8012051cdb52093.png@1280w_1l_2o_100sh.png">
    </div>
    <div class="profile_data">
        <p class="name">
            <%= loginStaff.getStaff_name() %>
        </p>
        <span class="span-info">
            <%= loginStaff.getStaff_username() %>
        </span>
        <span class="span-info">
            <i class="fa-solid fa-user"></i>
            <%= RoleUtil.displayRoleName(loginStaff) %>
        </span>
    </div>
</div>
