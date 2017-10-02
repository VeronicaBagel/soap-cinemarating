<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form id="loginForm" commandName="login" action="loginProcess" method="post">
    <form:label path="username">Login: </form:label>
    <form:input path="username" name="username" id="username" />

    <form:label path="password">Password:</form:label>
    <form:password path="password" name="password" id="password" />

    <form:button id="loginButton" name="loginButton">Login</form:button>
</form:form>
</body>
</html>
