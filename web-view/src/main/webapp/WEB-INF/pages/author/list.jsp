<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<br>

<h1>Страница для таблицы Автор!</h1>

<h2>${msg}</h2>

</br>

<table border="1">
    <caption>Таблица авторов</caption>
    <tr>
        <th>Номер</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th> </th>
        <th> </th>
    </tr>
    <c:forEach var="author" items="${authors}">
        <tr>
            <td>${author.id}</td>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td><a href="/author/edit.html">Редактировать</a></td>
            <td><a href="/author/delete.html">Удалить</a></td>
        </tr>
    </c:forEach>
</table>


<p><a href="/author/create.html">Добавить автора!</a></p>
</br>
<p><a href="/pages/welcome.html">Добро пожаловать!</a></p>

</body>
</html>