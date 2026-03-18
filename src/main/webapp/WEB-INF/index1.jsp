<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Emp SignUp</title>
</head>
<body>
<h2>Registration Form</h2>
<form method="post" action="${pageContext.request.contextPath}/showresult">
         <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" placeholder="Enter your name" required><br><br>

        <label for="email">Email ID:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>

        <label for="name">Mobile:</label><br>
        <input type="number" id="name" name="mobile" placeholder="Enter your mobile number" required><br><br>

        <label for="name">Date of Birth:</label><br>
        <input type="date" id="name" name="dob" placeholder="Enter your date of birth" required><br><br>


        <label for="name">Skills:</label><br>
        <select id="name" name="skills" multiple>
            <option value="Java">Java</option>
            <option value="Angular">Angular</option>
            <option value="Spring">Spring</option>
             <option value="PHP">PHP</option>
        </select>

         <label for="name">City:</label><br>
        <input type="text" id="name" name="a.city" placeholder="Enter city" required><br><br>

         <label for="name">State:</label><br>
        <input type="text" id="name" name="a.state" placeholder="Enter State" required><br><br>

        <label for="name">Pin:</label><br>
        <input type="number" id="name" name="a.pin" placeholder="Enter Pin" required><br><br>

        <input type="submit" value="Submit">

    </form>
</body>
</html>