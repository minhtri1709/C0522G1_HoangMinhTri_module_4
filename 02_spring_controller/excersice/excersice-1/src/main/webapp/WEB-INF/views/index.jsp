<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/9/2022
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<h1>Sandwich Condiments</h1><br>

<form action="/save">
    <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <br>
    <input type="submit" value="Save">
</form>

<h3>
    <c:forEach var="ingredient" items="${condiment}">
        ${ingredient}<br>
    </c:forEach>
</h3>
<h3>
    ${mess}
</h3>

</body>
</html>
