package org.zerock.w1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Anotherservlet")
public class AnotherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AnotherservletdoGet실행");
		// 요청 내용의 한글깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		//응답내용의 한글깨짐 방지
		response.setContentType("text/html; charset=UTF-8;");
		String text = request.getParameter("text");
		System.out.println("text :" +text);
		
		response.getWriter( ).println("한글깨지나?");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AnotherservletdoPost실행");
		
		String text = request.getParameter("text");
		System.out.println("text : " +text);
	
	
	}

}