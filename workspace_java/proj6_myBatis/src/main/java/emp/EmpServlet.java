package emp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO dao = new EmpDAO();
		
		List<EmpDTO> empList = dao.selectEmp();
		
		System.out.println(empList);
		
		request.setAttribute("empList", empList);
		
		List<Map> empListMap = dao.selectEmpMap();
		
		
		System.out.println(empListMap.get(0).get("ENAME"));
		
		request.setAttribute("empListMap", empListMap);
		
		EmpDTO empDTO = dao.selectOneEmp();
		System.out.println(empDTO);
		
		int total = dao.selectTotalEmp();
		System.out.println(total);
		
		String Ename = dao.selectEnameEmp();
		System.out.println(Ename);
		
		EmpDTO empDTO1 = new EmpDTO();
		empDTO1.setEmpno(7788);
		empDTO1.setEname("scoTT3");
		empDTO1.setSal(3210);
		int updateResult = dao.updateEmp(empDTO1);
		System.out.println("update 결과"+ updateResult);
		System.out.println(empDTO1);
		
		EmpDTO empDTO2 = dao.selectEmpByEname("KING");
		System.out.println(empDTO2);
		
	}

}
