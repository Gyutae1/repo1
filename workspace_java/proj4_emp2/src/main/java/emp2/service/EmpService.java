package emp2.service;

import java.util.List;



import emp2.DAO.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
EmpDAO empDAO = new EmpDAO();
	public List getEmp(String a) {
		
		
		List result = empDAO.selectEmp(a);
		
		return result;
	}
	public List getEmp2(String a) {
		
		
		List result = empDAO.selectEmp2(a);
		
		return result;
	}
//	public int update(EmpDTO empDTO) {
//		
//		
//		return empDAO.
//	}
	public int joinEmp(EmpDTO dto) {
		
		int insertCount = empDAO.insertEmp(dto);
		return insertCount;
	}
	public EmpDTO get(int empno) {
		EmpDTO dto1 = new EmpDTO();
		
		EmpDAO dao = new EmpDAO();
		dto1 = dao.selectOne(empno);
		
		
		return dto1;
	}
	public int update(EmpDTO dto) {
		
		EmpDAO empDAO = new EmpDAO();
		return empDAO.update(dto);
	}
	public int remove(EmpDTO dto) {
		EmpDAO dao = new EmpDAO();
		return dao.deleteOne(dto);
	}
	
}
