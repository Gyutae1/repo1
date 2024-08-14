<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>${dto.tno }</div>
	<div>${dto.title }</div>
	<div>${dto.dueDate }</div>
	<div>${dto.finished }</div>
	<input type="button" value="home" onclick="location=href='/proj3_todo/todo/list'">
</body>
</html>