<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>User List</title>
</head>
<body>
  <h1>使用者列表</h1>
  <a href="${pageContext.request.contextPath}/users/new">建立新使用者</a>
  <table border="1">
    <tr><th>ID</th><th>Name</th><th>Email</th></tr>
    <c:forEach var="u" items="${users}">
      <tr>
        <td>${u.id}</td>
        <td>${u.name}</td>
        <td>${u.email}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
