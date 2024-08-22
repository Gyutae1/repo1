<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.util.List"
	import="emp2.dto.EmpDTO"
    %>
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
	<h1>emp2</h1>
	<form method="get" action="Emp">
		empno:<input type="text" name="empno">
		<input type="submit" value="검색">
	</form>
	<form method="get" action="Emp">
		ename:<input type="text" name="ename">
		<input type="submit" value="검색">
	</form>
	<table border=1>
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>hireDate</th>
		<th>mgr</th>
		<th>comm</th>
		<th>sal</th>
		<th>deptno</th>
		<th>수정</th>
	</tr>
	<c:forEach var="emp" items = "${list}">
		<tr>
			<td>${emp.empno }</td>
			<td>${emp.ename }</td>
			<td>${emp.job }</td>
			<td>${emp.hireDate}</td>
			<td>${emp.mgr }</td>
			<td>${emp.comm}</td>
			<td>${emp.sal }</td>
			<td>${emp.deptno }</td>
			<td><a href="/proj4_emp2/UpDate?empno=${ emp.empno }"><input type="button" value="수정하기"></a></td>
		</tr>
	</c:forEach>
</table>
<input type="button" value="추가하기" onclick="location=href='/proj4_emp2/join'">


<!-- <table border=1> -->
<!-- 	<tr> -->
<!-- 		<th>empno</th> -->
<!-- 		<th>ename</th> -->
<!-- 		<th>job</th> -->
<!-- 		<th>hireDate</th> -->
<!-- 	</tr> -->
<%-- <% --%>
<!-- // 		List<EmpDTO> list = (List)request.getAttribute("list"); -->
<!-- // 		for(int i = 0; i<list.size(); i++){ -->
<!-- // 			EmpDTO dto = (EmpDTO)list.get(i); -->
			
<!-- // 			int empno = dto.getEmpno(); -->
<!-- // 			out.println(empno + ","); -->
<!-- // 		}	 -->
<!-- // 		for( EmpDTO dto : list ){ -->
<!-- // 			int empno = dto.getEmpno(); -->
<!-- // 			out.println(empno + ","); -->
<!-- // 		} -->
	
<!-- 	%> -->
	
</table>
</body>
</html>