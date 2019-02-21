<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>
</head>
<body class="container">

	<h1>
		<spring:message code="film.list.title"></spring:message>
	</h1>

	<table class="table">
		<tr>
			<th><spring:message code="film.list.header.id"></spring:message>
			</th>
			<th><spring:message code="film.list.header.name"></spring:message>
			</th>
			<th><spring:message code="film.list.header.name"></spring:message>
			</th>

			<th><spring:message code="film.list.header.birthday"></spring:message>
			</th>

			<th><spring:message code="film.list.header.position"></spring:message>
			</th>
		</tr>

		<c:forEach var="film" items="${listefilm}">
			<tr>
				<td>${film.id}</td>
				<td>${film.titre}</td>
	
				<td><fmt:formatDate value="${film.date}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
				<td><a href="edit?id=${film.id}" class="btn btn-info"><spring:message
							code="film.list.edit"></spring:message></a></td>
				<td><sec:authorize access="hasRole('ROLE_ADMIN')">
					<a href="delete?id=${film.id}" class="btn btn-danger"><spring:message
								code="film.list.delete"></spring:message></a></sec:authorize></td>
					<td></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>