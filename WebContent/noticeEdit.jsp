<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="edit" method="post">
		<dl>
			<dt>제목</dt>
			<dd><input name="title" value="${user.title}"></dd>
			<dt>작성일</dt>
			<dd>${user.regdate}</dd>
			<dt>작성자</dt>
			<dd>${user.writer}</dd>
			<dt>조회수</dt>
			<dd>${user.hit}</dd>
			<dt>점부파일</dt>
			<dd>Second explanation</dd>
		</dl>
		<div><textarea name="content">${user.content}</textarea></div>
		
		<p>
			<input type="hidden" name="id" value="${user.seq}">
			<input type="submit" value="수정">
			<a href="mio?id=${user.seq}">취소</a>
		</p>
	</form>
</body>
</html>