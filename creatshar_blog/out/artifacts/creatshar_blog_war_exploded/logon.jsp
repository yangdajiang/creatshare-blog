<%--
  Created by IntelliJ IDEA.
  User: 15114
  Date: 2017/7/22
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <h1>注册(内部成员开放页面)</h1>
    <form action="LogonServlet" method="post">
        用户名<input type="text" name="name" ><br/>
        密码<input type="text" name="pass"><br/><br/>
        <input type="submit" value="submit">
    </form>
</body>
</html>
