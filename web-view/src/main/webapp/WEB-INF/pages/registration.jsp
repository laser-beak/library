<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Registration</title></head>
<body>
<%--@elvariable id="dto" type="jt.library.model.dto.RegistrationDto"--%>
<form:form commandName="dto">
    <form:input path="username"/>
    <form:password path="password"/>
    <form:select path="country">
        <form:options items="${countries}"/>
    </form:select>
    <input type="submit">
</form:form>
</body>
</html>
