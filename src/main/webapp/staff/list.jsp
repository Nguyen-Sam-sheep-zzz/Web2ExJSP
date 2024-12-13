<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Staff List</title>
</head>
<body>
<h1>Staff</h1>
<p>
    <a href="staffs?action=add">Create new customer</a>
</p>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Position</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach items='${requestScope["staffs"]}' var="staff">
        <tr>
            <td><a href="staffs?action=view&id=${staff.getId()}">${staff.getName()}</a></td>
            <td>${staff.getAge()}</td>
            <td>${staff.getPosition()}</td>
            <td>${staff.getDepartment()}</td>
            <td>${staff.getSalary()}</td>
            <td><a href="staffs?action=update&id=${staff.getId()}">update</a></td>
            <td><a href="staffs?action=delete&id=${staff.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


