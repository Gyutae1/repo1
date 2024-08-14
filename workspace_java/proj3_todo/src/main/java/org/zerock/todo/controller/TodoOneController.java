package org.zerock.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.dto.TodoDTO;

/**
 * Servlet implementation class TodoOneController
 */
@WebServlet("/one")
public class TodoOneController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<h1>h");
		out.print("e");
		out.append("ll");
		out.write("o</h1>");
		
		
		String 아이디 = request.getParameter("id");
		System.out.println("아이디 :"+ 아이디);
		String 페스워드 = request.getParameter("pw");
		System.out.println("페스워드 :"+ 페스워드);
		
		out.println(아이디);
		out.println(페스워드);
		
		out.println("<hr>");
		
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		for(int i =1; i <=10;i++ ) {
			TodoDTO dto1 = new TodoDTO();
			dto1.setTno(i);
			dto1.setTitle("할일"+i);
			if(i % 3 == 0) {
				dto1.setFinished(true);
			}
			list.add(dto1);
		}
		// jsp 역할
		for(int i = 0; i<list.size();i++) {
			TodoDTO dto2 = list.get(i);
			
			out.println("<div>");
			out.println("<input type='checkbox'>");			
			out.println("tno :"+ dto2.getTno());
			out.println(",title :"+ dto2.getTitle());
			out.println("</div>");
		}
		
		
	}
}
