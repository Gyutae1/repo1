<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${ 10 + 1 } : ${ 10 + 1 }<br>
	\${ "10"" + 1 } : ${ "10" + 1 } : el은 계산할때 문자를 숫자로 바꿔서 계산한다
	<br>	
<%-- 	\${ "a" + 1 } : ${ "a" + 1 } --%>
	\${ null + 1 } : ${ null + 1 }<br>
	\${ 10 / 3 } : ${ 10 / 3 }<br>
	\${ 10 div 3 } : ${ 10 div 3 }<br>
	\${ 10 % 3 } : ${ 10 % 3 }<br>
	\${ 10 mod 3 } : ${ 10 mod 3 }<br>
	<hr>
	\${ 10 == 10 } : ${ 10 == 10 }<br>
	\${ "10" == "10" } : ${ "10" == "10" }<br>
	\${ "10" eq "10" } : ${ "10" eq "10" }<br>
	\${ 10 != 10 } : ${ 10 != 10 }<br>
	\${ 10 ne 10 } : ${ 10 ne 10 }<br>
	
	\${ 100 > 10 } : ${ 100 > 10 }<br>
	\${ 100 gt 10 } : ${ 100 gt 10 }<br>
	
	\${ 100 < 10 } : ${ 100 < 10 }<br>
	\${ 100 lt 10 } : ${ 100 lt 10 }<br>
	
	\${ 100 >= 10 } : ${ 100 >= 10 }<br>
	\${ 100 ge 10 } : ${ 100 ge 10 }<br>
	
	\${ 100 <= 10 } : ${ 100 <= 10 }<br>
	\${ 100 le 10 } : ${ 100 le 10 }<br>
</body>
</html>