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
<style>
	table {
		border: 1px solid red;
/* 		display: inline-block; */
		margin: 3px 3px;
	}
	table td {
		border: 1px solid red;
	}
</style>
</head>
<body>
<h1>List Page</h1>

<div style="text-align: right;">
	<a href="register">글쓰기</a>
</div>
<table>
	<tr>
	<c:forEach var="i" begin="0" end="${list1.size() - 1}"  varStatus="loop">
<%-- 	${list1[i] }<br> --%>
	<td>${loop.count }</td>
		<c:choose>
			<c:when test="${list1[i].finished }">
				<td><input type="checkbox" checked></td>
			</c:when>
		<c:otherwise>
			<td><input type="checkbox"></td>
		</c:otherwise>
		</c:choose>
			<td><a href="/proj3_todo/todo/read?tno=${ list1[i].tno }">${list1[i].title }</a></td>
			<td>${list1[i].dueDate }</td>
			<td>${list1[i].finished }</td>
			<td><a href="/proj3_todo/todo/update?tno=${ list1[i].tno }">수정하기</a></td>
			
	</tr>
	</c:forEach>
	
</table>
	
<%-- 	${ list1 }; --%>
<!-- 	<hr> -->
<%-- 	${ list1[0] }; --%>
<!-- 	<hr> -->
<%-- 	${ list1[0].title }; --%>
<!-- 	<hr> -->
<%-- 	123${ null }456; --%>



	
</body>
</html>