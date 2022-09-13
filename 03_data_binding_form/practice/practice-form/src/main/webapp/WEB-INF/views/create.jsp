<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/9/2022
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter the employee details</h3>
<form:form modelAttribute="employee" action="addEmployee" method="post">
<table>
    <tr>
        <td><form:label path="id">Employee Id: </form:label></td>
        <td><form:input path="id"/></td>
    </tr>
    <tr>
        <td><form:label path="name">Employee Name: </form:label></td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td><form:label path="contactNumber">Contact's Number: </form:label></td>
        <td><form:input path="contactNumber"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="Submit"/></td>
    </tr>
</table>
</form:form>
</body>
</html>
