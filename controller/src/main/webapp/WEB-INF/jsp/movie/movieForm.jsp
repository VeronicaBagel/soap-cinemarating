<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Cinemarating</title>
</head>
<body>
<spring:url value="/cinemarating/movies" var="movieActionUrl" />
<c:choose>
    <c:when test="${not empty user}">
        <form:form method="post" modelAttribute="movieForm" action="${movieActionUrl}">

            <form:hidden path="movieId" />

            <spring:bind path="title">
                <div>
                    <label>Title</label>
                    <div>
                        <form:input path="title" type="text" id="title" placeholder="Title" />
                        <form:errors path="title" />
                    </div>
                </div>
            </spring:bind>


            <spring:bind path="runningTime">
                <div>
                    <label>Running time</label>
                    <div>
                        <form:input path="runningTime" type="text" id="runningTime" />
                        <form:errors path="runningTime" />
                    </div>
                </div>
            </spring:bind>

            <spring:bind path="budget">
                <div>
                    <label>Budget</label>
                    <div>
                        <form:input path="budget" type="text" id="budget" />
                        <form:errors path="budget" />
                    </div>
                </div>
            </spring:bind>

            <br />
            <button type="submit">Save</button>

        </form:form>
    </c:when>
    <c:otherwise>
        You're not allowed to perform this operation
    </c:otherwise>
</c:choose>


</body>
</html>
