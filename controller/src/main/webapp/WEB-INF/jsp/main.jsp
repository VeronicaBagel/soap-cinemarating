<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Main page
Hello, ${user.login}
<spring:url value="/cinemarating/users" var="allUsers" />
<spring:url value="/cinemarating/users/add" var="addUser" />
<spring:url value="/cinemarating/login" var="login" />
<spring:url value="/cinemarating/logout" var="logout" />
<button onclick="location.href='${login}'">Log in</button>
<button onclick="location.href='${allUsers}'">See all users</button>
<button onclick="location.href='${addUser}'">Register</button>

<form:form name = "logoutForm" action="${logout}">
    <input type="submit" value="Log out" />
</form:form>
<br />

</body>
</html>
