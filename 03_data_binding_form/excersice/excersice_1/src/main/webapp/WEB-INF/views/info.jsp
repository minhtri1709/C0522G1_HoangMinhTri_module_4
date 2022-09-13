<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/9/2022
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Submitted Email Information</h2>
<table>
    <tr>
        <td>Language:</td>
        <td>${language}</td>
    </tr>
    <tr>
        <td>Page Size:</td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>Spam filter:</td>
        <td>${spamFilter}</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td>${singnature}</td>
    </tr>
</table>
</body>
</html>
