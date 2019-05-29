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
	<form action="joinProc" method="post">
		<dl>
			<dt>아이디</dt>
			<dd>
				<input type="text" name="uid" placeholder="id" /> 
				<input type="button" value="중복확인" />
			</dd>
		</dl>
		<dl>
			<dt>pw</dt>
			<dd>
				<input type="password" name="pwd" /> 
			</dd>
		</dl>
		<dl>
			<dt>pw확인</dt>
			<dd>
				<input type="password" name="pwd2" />
			</dd>
		</dl>
				<c:forEach var="er" items="error">
					<span>${er}</span> 
				</c:forEach>
		<dl>
			<dt>이름</dt>
			<dd>
				<input type="text" name="name" /> 
			</dd>
		</dl>
		<dl>
			<dt>성별</dt>
			<dd>
				<select name="gender">
					<option value="남성">남성</option>
					<option value="여성">여성</option>
				</select>
			</dd>
		</dl>
		<dl>
			<dt>생년월일</dt>
			<dd>
				<span>
					<input type="text" name="year" />년
					<input type="text" name="month" />월
					<input type="text" name="day" />일
				</span>
				<span>
					<input type="radio" name="isLunar" value="Solar" checked="checked">양력
					<input type="radio" name="isLunar" value="Lunar" >음력
				</span>
			</dd>
		</dl>
		<dl>
			<dt>핸드폰</dt>
			<dd>
				<input type="text" name="phone" /><span>-포함</span>
			</dd>
		</dl>
		<dl>
			<dt>email</dt>
			<dd>
				<input type="text" name="email" /> 
			</dd>
		</dl>
		<dl>
			<dt>취미</dt>
			<dd>
				<input type="checkbox" name="habit" value="music" /><label> 음악</label> 
				<input type="checkbox" name="habit" value="movie"/><label> 영화</label> 
				<input type="checkbox" name="habit" value="trip"/><label> 여행</label> 
			</dd>
		</dl>
		<div>
			<input type="submit" value="가입">
		</div>
	</form>
</body>
</html>