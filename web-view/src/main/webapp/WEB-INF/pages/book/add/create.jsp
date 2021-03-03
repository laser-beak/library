<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Страница добавления данных по книгам!</title>
</head>
<body>
<h3>Добро пожаловать, введите данные Книги</h3>

<%--@elvariable id="book" type="jt.library.model.entity.Book"--%>
<form:form method="POST" commandName="book">
    <table>
        <caption>Форма заполнения - данных по книге</caption>
        <tr>
            <td><form:label path="title">Название книги</form:label></td>
            <td><form:input path="title"/></td>
        </tr>
        <td><input type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
