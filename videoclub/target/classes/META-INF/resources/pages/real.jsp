<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body class="container">
	
	
	<table class="table">
		<tr>
			<th><spring:message code="realisateur.list.header.id" /></th>
			<th><spring:message code="realisateur.list.header.nom" /></th>
			<th><spring:message code="realisateur.list.header.prenom" /></th>
			<th><spring:message code="realisateur.list.header.listfilm" /></th>
			<th>film</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="realisateur" items="${listeRealisateur}">
			<tr>
				<td>${realisateur.id}</td>
				<td>${realisateur.nom}</td>
				<td>${realisateur.prenom}</td>
				<td>${realisateur.listFilm}</td>
			
			
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>