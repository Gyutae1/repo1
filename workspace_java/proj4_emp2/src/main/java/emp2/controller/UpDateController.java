package emp2.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import emp2.dto.EmpDTO;
import emp2.service.EmpService;


@WebServlet("/UpDate")
public class UpDateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/join doGet 실행");
		
		String empno = request.getParameter("empno");
		System.out.println("empno : "+ empno);
		
		// 문자를 숫자로 String to int
		int empno2 = Integer.parseInt(empno);
		
		EmpService empService = new EmpService();
		EmpDTO dto = empService.get(empno2);
		
		request.setAttribute("dto", dto);
		
		request.getRequestDispatcher("/WEB-INF/views/update.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/update doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String hireDate = request.getParameter("hireDate");
		String mgr = request.getParameter("mgr");
		String comm = request.getParameter("comm");
		String sal = request.getParameter("sal");
		String deptno = request.getParameter("deptno");
		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setJob(job);
		dto.setHireDate(Date.valueOf(hireDate));
		dto.setMgr(Integer.parseInt(mgr));
		dto.setComm(Integer.parseInt(comm));
		dto.setSal(Integer.parseInt(sal));
		dto.setDeptno(Integer.parseInt(deptno));
		
		System.out.println(dto);

		// db 의 insert까지 실행
		EmpService empService = new EmpService();
		int result = empService.update(dto);
		System.out.println("update 결과 :"+ result);
		// 목록으로 보내기
////		response.sendRedirect("list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/Emp");
	}

}
