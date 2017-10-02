<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cinemarating</title>
</head>
<body>
${user.login} <br />
<spring:url value="/cinemarating/users/${user.userId}/delete" var="deleteUrl" />
<spring:url value="/cinemarating/users/${user.userId}/update" var="updateUrl" />
<spring:url value="/cinemarating/main" var="homeUrl" />
<c:choose>
    <c:when test="${not empty user and (sessionScope.user.userId eq user.userId)}">
        <button onclick="location.href='${updateUrl}'">Update</button>
        <form:form name = "deleteUserForm" action="${deleteUrl}">
            <input type="submit" value="Delete" />
        </form:form>
    </c:when>
</c:choose>

<button onclick="location.href='${homeUrl}'">Home</button>
</body>
</html>
