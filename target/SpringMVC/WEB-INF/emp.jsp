<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/ishan1">
    <label for="name">Email:</label><br>
    <input type="email" id="name" name="email" placeholder="Enter your email" required><br><br>


    <label for="name">password:</label><br>
    <input type="password" id="name" name="password" placeholder="Enter your password" required><br><br>
</form>
</body>
</html>