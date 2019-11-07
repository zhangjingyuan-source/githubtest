<%--
  Created by IntelliJ IDEA.
  User: Mr.Zhang
  Date: 2019/11/7
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <title>登陆</title>
</head>
<body>
<form action="student/save.do" method="get">
    学生姓名：<input type="text" name="name"/><br>
    学生年龄：<input type="text" name="age"/><br>
    <input type="submit" value="登陆"><br>

    <a href="student/turnTo.do">跳转页面</a>
</form>

</body>
</html>
