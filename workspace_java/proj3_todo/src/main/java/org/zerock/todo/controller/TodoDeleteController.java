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


@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/delete doGet 실행");
		
		

		
		String str_tno = request.getParameter("tno");
		System.out.println("str_tno : "+ str_tno);
		
		// 문자를 숫자로 String to int
		int tno2 = Integer.parseInt(str_tno);
		
		TodoService todoService = new TodoService();
		TodoDTO dto2 = todoService.get(tno2);
		
		request.setAttribute("dto", dto2);
		request.getRequestDispatcher("/WEB-INF/todo/delete.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/delete doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		String tno = request.getParameter("tno");
		
		TodoDTO dto = new TodoDTO();
		int tnoInt = Integer.parseInt(tno);
		dto.setTno(tnoInt);
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
				int result = todoService.delete(dto);
				System.out.println("delete 결과 :"+ result);
				// 목록으로 보내기
////				response.sendRedirect("list");
				String contextPath = request.getContextPath();
				response.sendRedirect(contextPath + "/todo/list");
	}

}
