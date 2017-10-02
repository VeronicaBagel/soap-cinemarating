<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${movie.title}; ${movie.rating}<br />
<spring:url value="/cinemarating/movies/${movie.movieId}/delete" var="deleteUrl" />
<spring:url value="/cinemarating/movies/${movie.movieId}/update" var="updateUrl" />
<spring:url value="/cinemarating/movies/${movie.movieId}/rate" var="rateUrl" />
<spring:url value="/cinemarating/main" var="homeUrl" />

<button onclick="location.href='${updateUrl}'">Update movie info</button>

<form:form name = "deleteMovieForm" action="${deleteUrl}">
    <input type="submit" value="Delete" />
</form:form>

<button onclick="location.href='${homeUrl}'">Home</button>

<form:form modelAttribute="rateMovieForm" name = "rateMovieForm" action="${rateUrl}">
    <form:hidden path="userId" value="${user.userId}"/>
    <form:hidden path="movieId" value="${movie.movieId}"/>
    <form:radiobutton path="ratingValue" value="1" label="1" />
    <form:radiobutton path="ratingValue" value="2" label="2" />
    <form:radiobutton path="ratingValue" value="3" label="3" />
    <form:radiobutton path="ratingValue" value="4" label="4" />
    <form:radiobutton path="ratingValue" value="5" label="5" />
    <button type="submit">Rate!</button>
</form:form>

</body>
</html>
