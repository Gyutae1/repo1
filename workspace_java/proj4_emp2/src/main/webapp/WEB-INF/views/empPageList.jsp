<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="emp2.dto.EmpDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="emp2.dto.EmpDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp2</h1>
	<form method="get" action="Emp">
		empno:<input type="text" name="empno"> <input type="submit"
			value="검색">
	</form>
	<form method="get" action="Emp">
		ename:<input type="text" name="ename"> <input type="submit"
			value="검색">
	</form>
	<input type="button" value="추가하기"
		onclick="location=href='/proj4_emp2/join'">
	<table border=1>
		<tr>
			<th>rnum</th>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>hireDate</th>
			<th>mgr</th>
			<th>comm</th>
			<th>sal</th>
			<th>deptno</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="emp" items="${map.list}">
			<tr>
				<td>${emp.rnum }</td>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.hireDate}</td>
				<td>${emp.mgr }</td>
				<td>${emp.comm}</td>
				<td>${emp.sal }</td>
				<td>${emp.deptno }</td>
				<td><a href="/proj4_emp2/UpDate?empno=${ emp.empno }"><input
						type="button" value="수정하기"></a></td>
			</tr>
		</c:forEach>
	</table>
	<%
	Map map = (Map) request.getAttribute("map");
	int totalCount = (int) map.get("totalCount");

	String str_countPerPage = (String) request.getAttribute("countPerPage");
	int countPerPage = Integer.parseInt(str_countPerPage);

	String str_pageNo = (String) request.getAttribute("page");
	int pageNo = Integer.parseInt(str_pageNo);

	int lastPage = (int) Math.ceil((double) totalCount / countPerPage);
	%>
	<c:set var="lastPage2" value="<%=lastPage%>" scope="page" />

	이전

<c:forEach var="i" begin="1" end="${lastPage2 }">
	[<a href="page?page=${i }">${i }</a>] 
</c:forEach>

	다음

</body>
</html>