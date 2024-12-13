<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new staff</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new staff</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="staffs">Back to staff list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><input type="text" name="age" id="age"></td>
            </tr>
            <tr>
                <td>Position: </td>
                <td><input type="text" name="position" id="position"></td>
            </tr>
            <tr>
                <td>Department: </td>
                <td><input type="text" name="department" id="department"></td>
            </tr>
            <tr>
                <td>Salary: </td>
                <td><input type="text" name="salary" id="salary"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Add staff"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

