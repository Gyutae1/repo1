<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<div>
	    <h1>구구단 결과</h1>
		<ul>
		<% 
		    String[] gugudanResults = (String[]) request.getAttribute("gugudanResults");
		    if (gugudanResults != null) {
		        for(String result : gugudanResults) {
		            out.println("<li>" + result + "</li>");
		        }
		    }
	    %>
		</ul>
    </div>

</body>
</html>