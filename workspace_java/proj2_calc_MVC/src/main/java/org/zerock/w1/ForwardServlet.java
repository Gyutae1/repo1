package org.zerock.w1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwordservletdoGet실행");

		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		
		
		String url = "Anotherservlet";
	     request.getRequestDispatcher(url).forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("ForwordservletdoPost실행");

		String text = request.getParameter("text");
		System.out.println("text : " + text);

		String url = "Anotherservlet";
	      request.getRequestDispatcher(url).forward(request, response);
	}

}