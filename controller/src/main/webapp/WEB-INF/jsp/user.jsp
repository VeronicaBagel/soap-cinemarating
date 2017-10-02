<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user.login} <br />
<spring:url value="/cinemarating/users/${user.userId}/delete" var="deleteUrl" />
<spring:url value="/cinemarating/users/${user.userId}/update" var="updateUrl" />
<button onclick="location.href='${updateUrl}'">Update</button>
<form:form name = "deleteUserForm" action="${deleteUrl}">
    <input type="submit" value="Delete" />
</form:form>
</body>
</html>
