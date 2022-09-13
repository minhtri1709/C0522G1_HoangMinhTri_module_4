<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/9/2022
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Thông tin khai báo</h1>
<table class="table">
    <tr>
        <th hidden>ID</th>
        <th>Họ tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Số CMND(Căn cước)/Hộ chiếu</th>
        <th>Thông tin đi lại</th>
        <th>Số hiệu phương tiện</th>
        <th>Số ghế</th>
        <th>Ngày khởi hành</th>
        <th>Ngày Kết thúc</th>
        <th>Lịch sử đi lại</th>
        <th></th>
    </tr>
    <c:forEach items="${personList}" var="person">
        <tr>
            <td hidden>${person.id}</td>
            <td>${person.name}</td>
            <td>${person.yearOfBirth}</td>
            <td>${person.gender}</td>
            <td>${person.nationality}</td>
            <td>${person.id}</td>
            <td>${person.vehicle}</td>
            <td>${person.vehicleNumber}</td>
            <td>${person.seatOfVehicle}</td>
            <td>${person.dayOfBegin}</td>
            <td>${person.dayOfEnd}</td>
            <td>${person.city}</td>
            <td>
                <a href="/edit?id=${person.id}">Sửa thông tin</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
