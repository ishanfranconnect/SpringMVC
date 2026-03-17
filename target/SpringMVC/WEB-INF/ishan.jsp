<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>MVC Design</title>
</head>
<body>
<h2>It's a view page</h2>
<% 
    String n=(String) request.getAttribute("name");

%>
<h2>Your name is:
    <%=n%>
</h2>
</body>
</html>