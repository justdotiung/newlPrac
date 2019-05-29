<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach var="li" items="${list}" >
		<tr>
			<td>${li.seq}</td>
			<td><a href="mio?id=${li.seq}">${li.title}</a></td>
			<td>${li.writer}</td>
			<td>${li.regdate}</td>
			<td>${li.hit}</td>
		</tr>
	</c:forEach>
	</table>
		<a href="noticeReg.jsp">글쓰기</a>
</body>
</html>