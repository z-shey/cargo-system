<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String error = request.getParameter("error");
%>

<%
    if (error == null) {
%>
<p>请输入用户名和密码进行登录</p>
<%
    }
%>

<%
    if (error != null && error.equals("login_failure")) {
%>
<p style="color: red;">登录失败，请检查用户名和密码！</p>
<%
    }
%>

<%
    if (error != null && error.equals("log_in_first")) {
%>
<p style="color: #0022ff;">请先登录！</p>
<%
    }
%>

<%
    if (error != null && error.equals("welcome_back")) {
%>
<p style="color: #ff9900;">欢迎再回来！</p>
<%
    }
%>