<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Cinemarating</title>
</head>
<body>
<c:forEach var="movie" items="${movies}">
    ${movie.title}
    <br/>

    <spring:url value="/cinemarating/movies/${movie.movieId}" var="movieUrl" />

    <button onclick="location.href='${movieUrl}'">See movie info</button>

    <br />

</c:forEach>
</body>
</html>
