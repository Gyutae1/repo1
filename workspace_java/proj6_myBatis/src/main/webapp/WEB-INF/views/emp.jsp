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
<header>
	Logo
	<nav> emp > 회원 목록</nav>
</header>
<main>
	<a href="?cmd=join">회원가입</a>
	<section>
		<article>
			<form id="frm" method="get" action="emp0">
				<select name="searchType">
					<c:if test="${searchType == null}">
						<option value="1">이름</option>
						<option value="2">직책</option>
						<option value="3">이름+직책</option>
						<option value="4">연봉(이상)</option>
					</c:if>
					<c:if test="${searchType == '1'}">
						<option value="1" selected>이름</option>
						<option value="2">직책</option>
						<option value="3">이름+직책</option>
						<option value="4">연봉(이상)</option>
					</c:if>
					<c:if test="${searchType == '2'}">
						<option value="1">이름</option>
						<option value="2" selected>직책</option>
						<option value="3">이름+직책</option>
						<option value="4">연봉(이상)</option>
					</c:if>
					<c:if test="${searchType == '3'}">
						<option value="1">이름</option>
						<option value="2">직책</option>
						<option value="3" selected>이름+직책</option>
						<option value="4">연봉(이상)</option>
					</c:if>
					<c:if test="${searchType == '4'}">
						<option value="1">이름</option>
						<option value="2">직책</option>
						<option value="3">이름+직책</option>
						<option value="4" selected>연봉(이상)</option>
					</c:if>
					
				</select>
				<input type="text" name="keyword" placeholder="검색어를 입력하세요" value = "${keyword}">
				<input type="submit" value="검색" >
				
				
			<input type="hidden" name="orderType" value="${orderType}">
			<input type="hidden" name="nnj" value="${nnj}">
			<table border=1>
				<caption>회원 목록 표시</caption>
				<thead>
					<tr>
						<th>선택</th>
						<th id="empno">empno⇅</th>
						<th id="ename">ename</th>
						<th id="job">job</th>
						<th>sal</th>
						<th>hireDate</th>
						<th>수정</th>
<!-- 						<th>삭제</th> -->
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dto" items="${empList}">
						<tr>
							<input type="hidden" name="empno" value="${dto.empno }">
							<td>
								<input type="checkbox" name="check" value="${dto.empno}">
							</td>
							<td>${dto.empno }</td>
							<td>${dto.ename }</td>
							<td>${dto.job }</td>
							<td>${dto.sal }</td>
							<td>
								<fmt:formatDate value="${dto.hireDate}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>	
							</td>
							<td><a href="?cmd=edit&empno=${dto.empno}"><input type="button" value="수정하기"></a></td>
<!-- 							<td> -->
<!-- 								<form method="post" action="emp0"> -->
<!-- 									<input type="hidden" name="modify" value="delete"> -->
<%-- 									<input type="hidden" name="empno" value="${dto.empno}"> --%>
<!-- 									<input type="submit" value="삭제하기"> -->
<!-- 								</form> -->
<!-- 							</td> -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</form>
		</article>
	</section>
</main>
<footer>휴먼</footer>
<script>
	
	document.querySelector("#empno").addEventListener("click",function(){
		const orderType = document.querySelector("[name=orderType]");
		const nnj = document.querySelector("[name=nnj]");
		// '' > 'desc' > 'asc' 세개의 값을 순환하게 만들기
		console.log(orderType.value, orderType.value == '');
		if(orderType.value == ''){
			orderType.value = 'desc'
			nnj.value= 'empno'
		}else if(orderType.value == 'desc'){
			orderType.value = 'asc'
			nnj.value= 'empno'
		}else if(orderType.value == 'asc'){
			orderType.value = ''
			nnj.value= 'empno'
		}
		
		const frm = document.querySelector("#frm");
		frm.submit();
	})
	document.querySelector("#ename").addEventListener("click",function(){
		const orderType = document.querySelector("[name=orderType]");
		const nnj = document.querySelector("[name=nnj]");
		// '' > 'desc' > 'asc' 세개의 값을 순환하게 만들기
		console.log(orderType.value, orderType.value == '');
		if(orderType.value == ''){
			orderType.value = 'desc'
			nnj.value= 'ename'
		}else if(orderType.value == 'desc'){
			orderType.value = 'asc'
			nnj.value= 'ename'
		}else if(orderType.value == 'asc'){
			orderType.value = ''
			nnj.value= 'ename'
		}
		
		const frm = document.querySelector("#frm");
		frm.submit();
	})
	document.querySelector("#job").addEventListener("click",function(){
		const orderType = document.querySelector("[name=orderType]");
		const nnj = document.querySelector("[name=nnj]");
		// '' > 'desc' > 'asc' 세개의 값을 순환하게 만들기
		console.log(orderType.value, orderType.value == '');
		if(orderType.value == ''){
			orderType.value = 'desc'
			nnj.value= 'job'
		}else if(orderType.value == 'desc'){
			orderType.value = 'asc'
			nnj.value= 'job'
		}else if(orderType.value == 'asc'){
			orderType.value = ''
			nnj.value= 'job'
		}
		
		const frm = document.querySelector("#frm");
		frm.submit();
	})
	
</script>
</body>
</html>