<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>新增使用者</title>
</head>
<body>
<h1>新增使用者</h1>
<form action="/users" method="post">
    <label>姓名：<input type="text" name="name" value="${user.name}"/></label><br/>
    <label>Email：<input type="email" name="email" value="${user.email}"/></label><br/>
    <button type="submit">送出</button>
</form>
<a href="/users">回列表</a>
</body>
</html>
