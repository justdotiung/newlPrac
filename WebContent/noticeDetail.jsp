<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<dl>
		<dt>제목</dt>
		<dd>${user.title}</dd>
		<dt>작성일</dt>
		<dd>${user.regdate}</dd>
		<dt>작성자</dt>
		<dd>${user.writer}</dd>
		<dt>조회수</dt>
		<dd>${user.hit}</dd>
		<dt>점부파일</dt>
		<dd>Second explanation</dd>
	</dl>
	<div>${user.content}</div>
	
	<p>
		<a href="mo">목록</a>
		<a href="edit?id=${user.seq}">수정</a>
		<a href="del?id=${user.seq}">삭제</a>

</body>
</html>