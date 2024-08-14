package org.zerock.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.service.TodoService;

/**
 * Servlet implementation class TodoRegisterController
 */
@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doGet 실행");
		
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO dto = new TodoDTO();
		
		dto.setTitle(title);
		dto.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			dto.setFinished(false);
		} else {
			dto.setFinished(true);
		}
		
		System.out.println(dto);
		
		// db 의 insert까지 실행
		TodoService todoService = new TodoService();
		int result = todoService.register(dto);
		System.out.println("insert 결과 :"+ result);
		// 목록으로 보내기
//		response.sendRedirect("list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
	}

}
