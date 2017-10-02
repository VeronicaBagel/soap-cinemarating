<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${movie.title} <br />
<spring:url value="/cinemarating/movies/${movie.movieId}/delete" var="deleteUrl" />
<spring:url value="/cinemarating/movies/${movie.movieId}/update" var="updateUrl" />
<spring:url value="/cinemarating/main" var="homeUrl" />

<button onclick="location.href='${updateUrl}'">Update movie info</button>

<form:form name = "deleteMovieForm" action="${deleteUrl}">
    <input type="submit" value="Delete" />
</form:form>

<button onclick="location.href='${homeUrl}'">Home</button>
</body>
</html>
