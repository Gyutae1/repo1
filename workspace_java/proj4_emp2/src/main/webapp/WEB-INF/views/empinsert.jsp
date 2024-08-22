<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>emp2 사원추가</h1>
<form method="post" action="join">
	<input type="button" value="목록으로" onclick="location=href='/proj4_emp2/Emp'"><br>
	empno : <input type="text" name="empno"><br>
	ename : <input type="text" name="ename"><br>
	sal : <input type="text" name="sal"><br>
	deptno : <input type="text" name="deptno"><br>
	<a><input type="submit" value="추가"></a>
</form>
</body>
</html>