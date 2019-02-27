<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/27 0027
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <form action="/login">
        <label>请输入用户名</label>
        <input name="user" id="user" type="text">
        <hr>
        <label>请输入密码</label>
        <input type="password" name="password" id="password">
        <input type="submit" value="提交">
    </form>
</body>
</html>
