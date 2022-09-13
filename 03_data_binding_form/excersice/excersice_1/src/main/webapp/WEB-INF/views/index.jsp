<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/9/2022
  Time: 8:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="/create" method="post" modelAttribute="email">
    <table>
        <tr>
            <td style="font-weight: bold">Languages:
                <form:select path="language" items="${languageList}"></form:select>
            </td>
        </tr>
        <tr>
            <td style="font-weight: bold">Page Size:
                Show <form:select path="pageSize" items="${pageSizeList}">
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td style="font-weight: bold">Spam filter:
                <form:checkbox path="spamFilter" value="Yes"></form:checkbox> Enable spams filter
            </td>
        </tr>
        <tr>
            <td style="font-weight: bold">Signature:
                <form:textarea path="signature"></form:textarea>
            </td>
        </tr>
        <tr>
            <button type="submit">Update</button>
        </tr>
    </table>
</form:form>
</body>
</html>
