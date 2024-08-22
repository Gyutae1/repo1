<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="update">
	<input type="button" value="목록으로" onclick="location=href='/proj3_todo/todo/list'"><br>
	tno : <input type="hidden" name="tno" value="${dto.tno }"><br>
	title : <input type="text" name="title" value="${dto.title }"><br>
	duedate : <input type="date" name="dueDate" value="${dto.dueDate}"><br>
	finished :
		<input type="radio" name="finished" value="N" checked="checked"> 미완 
		<input type="radio" name="finished" value="Y"> 완료<br>
	<a><input type="submit" value="수정"></a>
</form>
<form method="post" action="delete">
	<input type="hidden" name="tno" value="${dto.tno }"><br>
	<input type="submit" value="삭제">
</form>
</body>
</html>