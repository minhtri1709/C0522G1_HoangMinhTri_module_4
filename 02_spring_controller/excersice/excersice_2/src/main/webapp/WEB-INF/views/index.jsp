<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/9/2022
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Calculator</h2>

<form action="calculate">
    <span><input type="number" name="numberFirst"></span>
    <span><input type="number" name="numberSecond"></span><br>
    <span><button type="submit" value="addition" name="operation">Addition(+)</button></span>
    <span><button type="submit" value="subtraction" name="operation">Subtraction(-)</button></span>
    <span><button type="submit" value="multiplication" name="operation">Multiplication(*)</button></span>
    <span><button type="submit" value="division" name="operation">Division(/)</button></span>
</form>
<h3>Result: ${result}</h3>
</body>
</html>
