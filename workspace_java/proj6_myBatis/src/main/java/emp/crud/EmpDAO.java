package emp.crud;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import emp.EmpDTO;

public class EmpDAO {
	private  SqlSessionFactory sqlMapper = null;

    public  SqlSessionFactory getInstance() {
        if(sqlMapper == null) {
            try {
                String res = "mybatis/SqlMapConfig.xml";
                Reader reader = Resources.getResourceAsReader(res);

                SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
                sqlMapper = ssfb.build(reader);

                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sqlMapper;
    }
    public List<EmpDTO> selectEmp(){
    	List<EmpDTO> empList = null;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
        	SqlSession sqlSession = sqlMapper.openSession();
        	
        	empList = sqlSession.selectList("mapper.emp.selectAllEmp");
        	System.out.println("empList.size :"+ empList.size());
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return empList;
    }
   
    public int insertEmp(emp.crud.EmpDTO dto){
    	int result = -1;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
    		// 자동 커밋 : sqlMapper.openSession()
    		// 수동 커밋 : sqlMapper.openSession(false)
    		SqlSession sqlSession = sqlMapper.openSession(false);
    		try {
    			result = sqlSession.insert("mapper.emp.param.insertEmp",dto);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
    public emp.crud.EmpDTO selectParamOneEmp(emp.crud.EmpDTO dto){
    	emp.crud.EmpDTO empDTO = null;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
        	SqlSession sqlSession = sqlMapper.openSession();
        	try {
        		empDTO = (emp.crud.EmpDTO)sqlSession.selectOne("mapper.emp.param.selectParamOneEmp", dto);
        		System.out.println(sqlSession);
        	}catch (Exception e) {
				e.printStackTrace();
			}
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return empDTO;
    }
    public int updateParamEmp(emp.crud.EmpDTO empDTO){
    	int result = -1;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
    		// 자동 커밋 : sqlMapper.openSession()
    		// 수동 커밋 : sqlMapper.openSession(false)
    		SqlSession sqlSession = sqlMapper.openSession(false);
    		try {
    			result = sqlSession.update("mapper.emp.param.updateParamEmp",empDTO);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
    public int deleteParamEmp(emp.crud.EmpDTO empDTO){
    	int result = -1;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
    		// 자동 커밋 : sqlMapper.openSession()
    		// 수동 커밋 : sqlMapper.openSession(false)
    		SqlSession sqlSession = sqlMapper.openSession(false);
    		try {
    			result = sqlSession.delete("mapper.emp.param.ParamEmpDelete",empDTO);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
//    public List<emp.crud.EmpDTO> selectEmpList(emp.crud.EmpDTO empDTO){
//    	List<emp.crud.EmpDTO> empList = null;
//    	
//    	// sqlMapConfig.xml을 읽어옴
//    	sqlMapper = getInstance();
//    	if(sqlMapper != null) {
//    		// DB 접속
//        	SqlSession sqlSession = sqlMapper.openSession();
//        	
//        	empList = sqlSession.selectList("mapper.emp.dynamic.selectEmpList",empDTO);
//        	System.out.println("empList.size :"+ empList.size());
//    	}else {
//    		System.out.println("DB 접속 실패");
//    	}
//    	
//    	return empList;
//    }
    public List<emp.crud.EmpDTO> selectEmpList(emp.crud.EmpDTO empDTO){
    	List<emp.crud.EmpDTO> empList = null;
    	
    	// sqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	if(sqlMapper != null) {
    		// DB 접속
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		empList = sqlSession.selectList("mapper.emp.dynamic.selectEmpList2",empDTO);
    		System.out.println("empList.size :"+ empList.size());
    	}else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return empList;
    }
    
}
