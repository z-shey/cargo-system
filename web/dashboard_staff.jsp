<%@ page import="com.shey.service.impl.StaffService" %>
<%@ page import="com.shey.entity.Staff" %>
<%@ page import="com.shey.service.impl.RoleService" %>
<%@ page import="com.shey.service.impl.WarehouseService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content" id="staff_management" style="display: none;">
    <div class="operation">
        <div class="count">
            <div class="count-content">
                <div class="count-line">
                    <label>数量</label>
                    <span>(0)</span>
                </div>
                <a type="button" class="btn" href='add_staff.jsp'>新增</a>
            </div>
        </div>
        <div class="search">
            <input type="text" id="staffSearchInput" class="search-input" placeholder="搜索...">
            <button type="button" class="btn">搜索重置</button>
        </div>
    </div>


    <% for (Staff staff : new StaffService().getList()) { %>
    <div class="info-container item">
        <div class="info-content">
            <h2><%= staff.getStaff_name() %>
            </h2>

            <div class="info-row">
                <label>用户ID</label>
                <span><%= staff.getStaff_id() %></span>
            </div>

            <div class="info-row">
                <label>用户名</label>
                <span><%= staff.getStaff_username() %></span>
            </div>

            <div class="info-row">
                <label>用户权限</label>
                <span><%= RoleService.getName(staff.getRole_id()) %></span>
            </div>

            <div class="info-row">
                <label>所在仓库</label>
                <span><%= WarehouseService.getName(staff.getWarehouse_id()) %></span>
            </div>

            <div class="button-group">
                <button type="button"
                        onclick="location.href='staff?flag=detail_staff&staff_id=<%= staff.getStaff_id() %>'">查看详情
                </button>
                <button type="button"
                        onclick="location.href='staff?flag=edit_staff_pre&staff_id=<%= staff.getStaff_id() %>'">修改信息
                </button>
            </div>

        </div>
    </div>
    <% } %>

</div>