<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Deleting staff</title>
</head>
<body>
<h1>Delete staff</h1>
<p>
    <a href="staffs">Back to staff list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["staff"].getName()}</td>
            </tr>
            <tr>
                <td>Age:</td>
                <td>${requestScope["staff"].getAge()}</td>
            </tr>
            <tr>
                <td>Position:</td>
                <td>${requestScope["staff"].getPosition()}</td>
            </tr>
            <tr>
                <td>Department:</td>
                <td>${requestScope["staff"].getDepartment()}</td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td>${requestScope["staff"].getSalary()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete staff"></td>
            </tr>
        </table>
    </fieldset>
    <br>
    <td><a href="staffs">Back to staff list</a></td>
</form>
</body>
</html>


