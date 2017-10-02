<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update user</title>
</head>
<body>
<spring:url value="/cinemarating/users" var="userActionUrl" />
<c:choose>
<c:when test="${not empty user and (user.userId eq userUpdateForm.userId)}">
    <form:form method="post" modelAttribute="userUpdateForm" action="${userActionUrl}">

    <form:hidden path="userId" />

    <spring:bind path="login">
        <div>
            <label>Login</label>
            <div>
                <form:input path="login" type="text" id="login" placeholder="Login" />
                <form:errors path="login" />
            </div>
        </div>
    </spring:bind>

    <spring:bind path="password">
        <div>
            <label>Password</label>
            <div>
                <form:password path="password" id="password" placeholder="password" />
                <form:errors path="password" />
            </div>
        </div>
    </spring:bind>

    <spring:bind path="email">
        <div>
            <label>Email</label>
            <div>
                <form:input path="email" id="email" placeholder="Email" />
                <form:errors path="email" />
            </div>
        </div>
    </spring:bind>

    <spring:bind path="firstName">
        <div>
            <label>First name</label>
            <div>
                <form:input path="firstName" id="firstName" placeholder="First name" />
                <form:errors path="firstName" />
            </div>
        </div>
    </spring:bind>

    <spring:bind path="lastName">
        <div>
            <label>Last name</label>
            <div>
                <form:input path="lastName" id="lastName" placeholder="Last name" />
                <form:errors path="lastName" />
            </div>
        </div>
    </spring:bind>

    <btr />
    <button type="submit">Update</button>
    <br />

</form:form>
</c:when>
<c:otherwise>
    You're not allowed to perform this operation
</c:otherwise>
</c:choose>
</body>
</html>
