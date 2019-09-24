<%--
  Created by IntelliJ IDEA.
  User: 李冠凯
  Date: 2019/9/21
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<table border="1">

    <tr>
        <th>图书id</th>
        <th>图书名称</th>
        <th>图书库存</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.name}</td>
            <td>${book.number}</td>
            <td><a href="${book.bookId}/detail">详情</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
