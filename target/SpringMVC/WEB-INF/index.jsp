<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>MVC Design</title>
</head>
<body>
<h2>It's a view page</h2>
<%-- <h2>This page called by EmployeeController!!</h2> --%>
<% 
    String n=(String) request.getAttribute("name");
    Integer i=(Integer) request.getAttribute("Id");
    List<String> c=(List<String>) request.getAttribute("cities");
%>
<h2>Your name is:
    <%=n%>
</h2>
<h2>Your id is:
    <%=i%>
</h2>

<h3>List of cities:</h3>

<%
for(String s : c){
    out.println(s + "<br>");
}
%>

</body>
</html>