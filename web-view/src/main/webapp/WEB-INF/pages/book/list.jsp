<%@ page contentType="text/html;charset=windows-1251" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <caption>������� ����</caption>
    <tr>
        <th>�����</th>
        <th>�������� �����</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td><a href="/author/edit.html">�������������</a></td>
            <td><a href="/author/delete.html">�������</a></td>
        </tr>
    </c:forEach>
</table>

</br>
<p><a href="/book/add/create.html">�������� �����!</a></p>

</body>
</html>
