<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Create User</title>
</head>
<body>
  <h1>建立使用者</h1>
  <form action="${pageContext.request.contextPath}/users" method="post">
    Name: <input type="text" name="name"/><br/>
    Email: <input type="text" name="email"/><br/>
    <button type="submit">Submit</button>
  </form>
  <a href="${pageContext.request.contextPath}/users">返回列表</a>
</body>
</html>
