<%@ page import="com.shey.entity.Warehouse" %>
<%@ page import="com.shey.service.impl.WarehouseService" %>
<%@ page import="com.shey.service.impl.WarehouseTypeService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content" id="warehouse_management" style="display: none;">
    <div class="operation">
        <div class="count">
            <div class="count-content">
                <div class="count-line">
                    <label>数量</label>
                    <span>(0)</span>
                </div>
                <a type="button" class="btn" href='warehouse_add.jsp'>新增</a>
            </div>
        </div>

        <div class="search">
            <input type="text" id="warehouseSearchInput" class="search-input" placeholder="搜索...">
            <button type="button" class="btn">搜索重置</button>
        </div>
    </div>

    <% for (Warehouse warehouse : new WarehouseService().getList()) {%>
    <div class="info-container item">
        <div class="info-content">
            <h2><%= warehouse.getWarehouse_name() %>
            </h2>
            <div class="info-row">
                <label>仓库ID</label>
                <span><%= warehouse.getWarehouse_id() %></span>
            </div>

            <div class="info-row">
                <label>仓库类型</label>
                <span><%= WarehouseTypeService.getName(warehouse.getWarehouse_type()) %></span>
            </div>

            <div class="info-row">
                <label>仓库地址</label>
                <span><%= warehouse.getWarehouse_location() %></span>
            </div>

            <div class="button-group">
                <button type="button"
                        onclick="location.href='warehouse?flag=detail_warehouse&warehouse_id=<%= warehouse.getWarehouse_id() %>'">
                    查看详情
                </button>
                <button type="button"
                        onclick="location.href='warehouse?flag=edit_warehouse_pre&warehouse_id=<%= warehouse.getWarehouse_id() %>'">
                    修改信息
                </button>
            </div>

        </div>
    </div>
    <%}%>
</div>