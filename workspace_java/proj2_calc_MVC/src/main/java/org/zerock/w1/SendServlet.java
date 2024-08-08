package org.zerock.w1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 내용의 한글깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		//응답내용의 한글깨짐 방지
		response.setContentType("text/html; charset=UTF-8;");
		
		System.out.println("Sendservlet doGet실행");

		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("Anotherservlet");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sendservlet doPost실행");
		
		// 요청 내용의 한글깨짐 방지
		request.setCharacterEncoding("UTF-8");

		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("Anotherservlet");

	}

}