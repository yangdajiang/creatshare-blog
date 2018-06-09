<%--
  Created by IntelliJ IDEA.
  User: 15114
  Date: 2017/7/17
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
    <h1>请登录</h1>
    <form action="LoginServlet" method="post">
      用户名<input type="text" name="name" ><br/>
      密码<input type="password" name="pass"><br/><br/>
      <input type="submit" value="submit">
      <a href="logon.jsp">注册</a>
    </form>
  </body>
</html>
