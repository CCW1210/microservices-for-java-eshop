<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <title>使用者列表</title>
</head>
<body>
<h1>使用者列表</h1>
<a href="users/new">新增使用者</a>
<table border="1" style="padding: 5px;">
    <tr><th>ID</th><th>姓名</th><th>Email</th></tr>
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
