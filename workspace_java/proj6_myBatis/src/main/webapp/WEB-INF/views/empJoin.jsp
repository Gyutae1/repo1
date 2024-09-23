<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${cmd == 'join'}">
	<h1>회원가입</h1>
	<form method="post" action="emp0">
		<input type="hidden" name="modify" value="join">
		empno : <input type="text" name="empno"><br>
		ename : <input type="text" name="ename"><br>
		hireDate : <input type="date" name="hireDate"><br>
		<input type="submit" value="가입">
	</form>
</c:if>
<c:if test="${cmd == 'edit'}">
	<h1>회원수정</h1>
		<form method="post" action="emp0">
		<input type="hidden" name="modify" value="edit">
		empno : <input type="hidden" name="empno" value="${dto.empno}">${dto.empno}<br>
		ename : <input type="text" name="ename" value="${dto.ename}"><br>
		hireDate : <input type="date" name="hireDate" value="${dto.hireDate}"><br>
		<input type="submit" value="수정">
	</form>
</c:if>

</body>
</html>