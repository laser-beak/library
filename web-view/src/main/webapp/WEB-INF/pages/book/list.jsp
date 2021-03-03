<%@ page contentType="text/html;charset=windows-1251" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <caption>Таблица книг</caption>
    <tr>
        <th>Номер</th>
        <th>Название книги</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td><a href="/author/edit.html">Редактировать</a></td>
            <td><a href="/author/delete.html">Удалить</a></td>
        </tr>
    </c:forEach>
</table>

</br>
<p><a href="/book/add/create.html">Добавить книгу!</a></p>

</body>
</html>
