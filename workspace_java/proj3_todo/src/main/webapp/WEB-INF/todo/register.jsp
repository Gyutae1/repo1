<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 작성 | 할일 관리</title>
</head>
<body>
	
<form method="post" action="register">
	<input type="button" value="목록으로" onclick="location=href='/proj3_todo/todo/list'"><br>
	title : <input type="text" name="title"><br>
	duedate : <input type="date" name="dueDate"><br>
	finished : 
		<input type="radio" name="finished" value="N" checked="checked"> 미완 
		<input type="radio" name="finished" value="Y"> 완료<br>
	<input type="submit" value="등록">
</form>	
</body>
</html>