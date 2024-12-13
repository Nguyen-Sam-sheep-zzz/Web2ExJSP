<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Update Staff</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Update staff</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/staffs">Back to staff list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["staff"].getName()}"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><input type="text" name="age" id="age" value="${requestScope["staff"].getAge()}"></td>
            </tr>
            <tr>
                <td>Position: </td>
                <td><input type="text" name="position" id="position" value="${requestScope["staff"].getPosition()}"></td>
            </tr>
            <tr>
                <td>Department: </td>
                <td><input type="text" name="department" id="department" value="${requestScope["staff"].getDepartment()}"></td>
            </tr>
            <tr>
                <td>Salary: </td>
                <td><input type="text" name="salary" id="salary" value="${requestScope["staff"].getSalary()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update staff"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

