<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:url value="/cinemarating/users" var="userActionUrl" />
<form:form method="post" modelAttribute="userAddForm" action="${userActionUrl}">

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



    <btr />
    <button type="submit">Add</button>
    <br />

</form:form>

</body>
</html>
