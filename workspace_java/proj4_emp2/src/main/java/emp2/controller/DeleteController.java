package emp2.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;




@WebServlet("/Delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/Delete doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
        String empno = request.getParameter("empno");

		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(Integer.parseInt(empno));

		
		System.out.println("dto :"+dto);
		

				EmpService empService = new EmpService();
				int result = empService.remove(dto);
				System.out.println("delete 결과 :"+ result);
				// 목록으로 보내기
////				response.sendRedirect("list");
				String contextPath = request.getContextPath();
				response.sendRedirect(contextPath + "/Emp");
	}

}
