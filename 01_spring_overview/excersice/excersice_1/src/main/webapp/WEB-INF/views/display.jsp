<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/9/2022
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate" method="post">
    <table>
        <tr>
            <th colspan="2">ỨNG DỤNG CHUYỂN ĐỔI TIỀN TỆ</th>
        </tr>
        <tr>
            <td>
                <input type="number" name="money" placeholder="VNĐ">
            </td>
            <td>
                <button type="submit" name="calculate">
                    Nhấn vào để chuyển đổi
                </button>
            </td>
        <tr>
            <td>
                USD: ${result}
            </td>
        </tr>
    </table>
</form>
</body>
</html>
