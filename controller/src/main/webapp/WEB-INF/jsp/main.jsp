<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Main page

<spring:url value="/cinemarating/users" var="allUsers" />
<spring:url value="/cinemarating/users/add" var="addUser" />
<button onclick="location.href='${allUsers}'">See all users</button>
<button onclick="location.href='${addUser}'">Add user</button>
<br />

</body>
</html>
