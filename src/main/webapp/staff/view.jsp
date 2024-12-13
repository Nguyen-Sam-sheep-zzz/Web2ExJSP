<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View staff</title>
</head>
<body>
<h1>Staff details</h1>
<p>
    <a href="staffs">Back to staff list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["staff"].getName()}</td>
    </tr>
    <tr>
        <td>Age: </td>
        <td>${requestScope["staff"].getAge()}</td>
    </tr>
    <tr>
        <td>Position: </td>
        <td>${requestScope["staff"].getPosition()}</td>
    </tr>
    <tr>
        <td>Department: </td>
        <td>${requestScope["staff"].getDepartment()}</td>
    </tr>
    <tr>
        <td>Salary: </td>
        <td>${requestScope["staff"].getSalary()}</td>
    </tr>
</table>
</body>
</html>

