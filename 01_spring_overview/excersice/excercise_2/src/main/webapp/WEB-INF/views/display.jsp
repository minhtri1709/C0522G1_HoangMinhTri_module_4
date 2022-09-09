<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/9/2022
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="translate" method="get">
    <table>
        <tr>
            <th>DICTIONARY</th>
        </tr>
        <tr>
            <td>
                <input type="text" name="english">
            </td>
            <td>
                <button>TRANSLATE</button>
            </td>
        </tr>
        <c:if test="${vietnamese.size()!=0}">
            <tr>
                 <c:forEach var="word" items="${vietnamese}">
                     <p>
                         ${word.vietnamese}
                     </p>
                 </c:forEach>
            </tr>
        </c:if>

    </table>
</form>
</body>
</html>
