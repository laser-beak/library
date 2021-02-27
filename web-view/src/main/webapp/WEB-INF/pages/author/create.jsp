<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Страница добавления данных по авторам!</title>
</head>
<body>
<h3>Добро пожаловать, введите данные Автора</h3>
<%--@elvariable id="author" type="jt.library.model.entity.Author"--%>

<spring:url value="/create" var="userActionUrl" />

<form:form method="POST"
           action="${userActionUrl}" modelAttribute="author">
    <table>
        <caption>Форма заполнения - данных по автору</caption>
        <tr>
            <td><form:label path="firstName">Имя</form:label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Фамилия</form:label></td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
