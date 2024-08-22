<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="UpDate">
	<input type="button" value="목록으로" onclick="location=href='/proj4_emp2/Emp'"><br>
	empno : <input type="text" name="empno" value="${dto.empno }"><br>
	ename : <input type="text" name="ename" value="${dto.ename }"><br>
	job : <input type="text" name="job" value="${dto.job }"><br>
	hireDate: <input type="date" name="hireDate" value="${dto.hireDate}"><br>
	mgr : <input type="text" name="mgr" value="${dto.mgr }"><br>
	comm : <input type="text" name="comm" value="${dto.comm }"><br>
	sal : <input type="text" name="sal" value="${dto.sal }"><br>
	deptno : <input type="text" name="deptno" value="${dto.deptno }"><br>

	<a><input type="submit" value="수정"></a>
</form>
<form method="post" action="Delete">
	<input type="hidden" name="empno" value="${dto.empno }"><br>
	<input type="submit" value="삭제">
</form>
</body>
</html>