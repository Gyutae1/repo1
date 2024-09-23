package emp.crud;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.crud.EmpDAO;
import emp.crud.EmpDTO;

@WebServlet("/emp0")
public class Emp0Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String cmd = request.getParameter("cmd");
		request.setAttribute("cmd", cmd);
		String strEmpno = request.getParameter("empno");
		
		if(cmd == null) {
			EmpDAO dao = new EmpDAO();
			emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
//			List<emp.EmpDTO> empList = dao.selectEmp();
			String keyword = request.getParameter("keyword");
			String searchType = request.getParameter("searchType");
			String orderType = request.getParameter("orderType");
			String nnj = request.getParameter("nnj");
			String[] checks = request.getParameterValues("check");
			
			dto.setNnj(nnj);
			dto.setOrderType(orderType);
			dto.setKeyword(keyword);
			dto.setSearchType(searchType);
			dto.setChecks(checks);
			
			List<emp.crud.EmpDTO> empList = dao.selectEmpList(dto);
			System.out.println(empList);
			
			request.setAttribute("empList", empList);
			request.setAttribute("keyword", keyword);
			request.setAttribute("searchType", searchType);
			request.setAttribute("checks", checks);
			request.setAttribute("orderType", orderType);
			request.setAttribute("nnj", nnj);
			request.getRequestDispatcher("/WEB-INF/views/emp.jsp").forward(request, response);
			
		}else if("join".equals(cmd)) {
			
			request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
		}else if("edit".equals(cmd)) {
			emp.crud.EmpDTO dto = new emp.crud.EmpDTO();
			emp.crud.EmpDAO dao = new emp.crud.EmpDAO();
			
			System.out.println("strEmpno:"+strEmpno);
			
			try {
				
				dto.setEmpno(Integer.parseInt(strEmpno));
				emp.crud.EmpDTO dto2 = dao.selectParamOneEmp(dto);
				request.setAttribute("dto", dto2);
				
				System.out.println("수정하기 read:"+dto2);
				request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = new EmpDTO();
		String strEmpno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String strHireDate = request.getParameter("hireDate");
		String modify = request.getParameter("modify");
		if(modify.equals("join")) {
			try {
				int empno = Integer.parseInt(strEmpno);
				Date hireDate =Date.valueOf(strHireDate);
				
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setHireDate(hireDate);
				
				int result = dao.insertEmp(dto);
				System.out.println("가입 결과 : "+result);
				// insert 실행
				
				response.sendRedirect("emp0");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else if(modify.equals("edit")) {
			try {
			int empno = Integer.parseInt(strEmpno);
			Date hireDate =Date.valueOf(strHireDate);
			
			dto.setEmpno(empno);
			dto.setEname(ename);
			dto.setHireDate(hireDate);
			
			int updateResult = dao.updateParamEmp(dto);
			System.out.println("update 결과"+ updateResult);
			
			response.sendRedirect("emp0");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else if(modify.equals("delete")) {
			try {
			int empno = Integer.parseInt(strEmpno);
			
			dto.setEmpno(empno);
			
			int deleteResult = dao.deleteParamEmp(dto);
			System.out.println("delete 결과"+ deleteResult);
			
			response.sendRedirect("emp0");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
