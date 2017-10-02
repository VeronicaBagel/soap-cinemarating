<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Cinemarating</title>
</head>
<body>
<c:forEach var="user" items="${users}">
    ${user.login}
    <br/>

    <spring:url value="/cinemarating/users/${user.userId}" var="userUrl" />

    <button onclick="location.href='${userUrl}'">See details</button>

    <br />

</c:forEach>

</body>
</html>
