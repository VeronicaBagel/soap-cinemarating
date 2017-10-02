<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:url value="/cinemarating/users" var="allUsers" />
<spring:url value="/cinemarating/movies" var="allMovies" />
<spring:url value="/cinemarating/users/add" var="addUser" />
<spring:url value="/cinemarating/login" var="login" />
<spring:url value="/cinemarating/logout" var="logout" />


Main page <br />
Hello, ${user.login} <br />

<button onclick="location.href='${login}'">Log in</button> <br />
<button onclick="location.href='${addUser}'">Register</button> <br />
<form:form name = "logoutForm" action="${logout}">
    <input type="submit" value="Log out" />
</form:form>
<br /><br />

<button onclick="location.href='${allUsers}'">See all users</button>
<button onclick="location.href='${allMovies}'">See all movies</button>
<br />

</body>
</html>
