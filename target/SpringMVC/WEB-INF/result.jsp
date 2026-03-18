<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Emp SignUp</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Mobile</th>
        <th>Date of birth</th>
        <th>Skills</th>
        <th>City</th>
        <th>State</th>
           <th>Pin</th>
    </tr>
    <tr>
        <td>${e1.name}</td>
    </tr>
    <tr>
        <td>${e1.email}</td>
    </tr>
    <tr>
        <td>${e1.password}</td>
    </tr>
    <tr>
        <td>${e1.mobile}</td>
    </tr>
    <tr>
        <td>${e1.dob}</td>
    </tr>
    <tr>
        <td>${e1.skills}</td>
    </tr>
    <tr>
        <td>${e1.a.city}</td>
    </tr>
    <tr>
        <td>${e1.a.state}</td>
    </tr>
    <tr>
        <td>${e1.a.pin}</td>
    </tr>

</table>
</body>
</html>