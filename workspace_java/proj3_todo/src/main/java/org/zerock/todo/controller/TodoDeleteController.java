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

	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/delete doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		

		String tno = request.getParameter("tno");
		
		TodoDTO dto = new TodoDTO();
		int tnoInt = Integer.parseInt(tno);
		dto.setTno(tnoInt);

		
		System.out.println(dto);
		
	
		TodoService todoService = new TodoService();
		int result = todoService.delete(dto);
		System.out.println("delete 결과 :"+ result);

		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
	}

}
