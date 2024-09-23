package emp2.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpDAO {

	public List selectEmp(String empno2) {
		List list = new ArrayList();

		try {
			// # DB에서 emp2 조회하기

			// ## DB 접속 시작
			// JNDI 방식으로
			// Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져온다
			// 거기에는 DB 정보가 있다
			// 그걸로 DataSource만든다
			// DataSource가 커넥션 풀이라고 생각하면 된다
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// 커넥션 풀에서 접속 정보를 가져오기
			Connection con = dataSource.getConnection();
			// ## DB 접속 끝

			// SQL 준비
			String query = null;
			PreparedStatement ps = null;

			if (empno2 == null) {
				query = " SELECT * FROM emp2";
			} else if (empno2 != null) {
				query = " SELECT * FROM emp2 where empno = ?";
			}
			ps = con.prepareStatement(query);

			if (empno2 != null) {
				ps.setInt(1, Integer.parseInt(empno2));
			}

			// SQL 실행 및 결과 확보
			// executeQuery : select문 실행
			// ResultSet : select문 조회 결과 전체 : 엑셀처럼 테이블 느낌
			ResultSet rs = ps.executeQuery();

			// 결과 활용
			// 한줄 한줄을 DTO에 넣기
			// 그렇게 만들어진 DTO를 List에 넣기

			// rs.next() : 다음 줄로 커서를 이동한다
			// 다음 줄이 있다면 true를, 없으면 false를 돌려줌
			// 다음 줄이 있으면 rs는 다음줄 덩어리 : table의 tr 한줄, 1차원 배열
			while (rs.next()) {
				EmpDTO empDTO = new EmpDTO();

				// 이번 줄에서 empno 컬럼의 값을 int로 형변환해서 가져옴
				int empno = rs.getInt("empno");
				empDTO.setEmpno(empno);

				String ename = rs.getString("ename");
				empDTO.setEname(ename);

				empDTO.setJob(rs.getString("job"));
				empDTO.setHireDate(rs.getDate("hiredate"));
				empDTO.setMgr(rs.getInt("mgr"));
				empDTO.setComm(rs.getInt("comm"));
				empDTO.setSal(rs.getInt("sal"));
				empDTO.setDeptno(rs.getInt("deptno"));
				list.add(empDTO);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public List selectEmp2(String ename2) {
		List list = new ArrayList();

		try {
			// # DB에서 emp2 조회하기

			// ## DB 접속 시작
			// JNDI 방식으로
			// Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져온다
			// 거기에는 DB 정보가 있다
			// 그걸로 DataSource만든다
			// DataSource가 커넥션 풀이라고 생각하면 된다
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// 커넥션 풀에서 접속 정보를 가져오기
			Connection con = dataSource.getConnection();
			// ## DB 접속 끝

			// SQL 준비
			String query = null;
			PreparedStatement ps = null;

			if (ename2 == null) {
				query = " SELECT * FROM emp2";
			} else if (ename2 != null) {
				query = " SELECT * FROM emp2 where ename = ?";
			}
			ps = con.prepareStatement(query);

			if (ename2 != null) {
				ps.setInt(1, Integer.parseInt(ename2));
			}

			// SQL 실행 및 결과 확보
			// executeQuery : select문 실행
			// ResultSet : select문 조회 결과 전체 : 엑셀처럼 테이블 느낌
			ResultSet rs = ps.executeQuery();

			// 결과 활용
			// 한줄 한줄을 DTO에 넣기
			// 그렇게 만들어진 DTO를 List에 넣기

			// rs.next() : 다음 줄로 커서를 이동한다
			// 다음 줄이 있다면 true를, 없으면 false를 돌려줌
			// 다음 줄이 있으면 rs는 다음줄 덩어리 : table의 tr 한줄, 1차원 배열
			while (rs.next()) {
				EmpDTO empDTO = new EmpDTO();

				// 이번 줄에서 empno 컬럼의 값을 int로 형변환해서 가져옴
				int empno = rs.getInt("empno");
				empDTO.setEmpno(empno);

				String ename = rs.getString("ename");
				empDTO.setEname(ename);

				empDTO.setJob(rs.getString("job"));
				empDTO.setHireDate(rs.getDate("hiredate"));
				empDTO.setMgr(rs.getInt("mgr"));
				empDTO.setComm(rs.getInt("comm"));
				empDTO.setSal(rs.getInt("sal"));
				empDTO.setDeptno(rs.getInt("deptno"));
				list.add(empDTO);
			}
			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public int update(EmpDTO dto) {
		int result = -1;

		try {
			// Servers 폴더의 context.xml에서
			// name이 jdbc/oracle인 resource를 가져와서 DataSource로 저장하기
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 : 커넥션풀을 사용해서
			Connection con = dataFactory.getConnection();

			String query = "update emp2"
					+ " set ename = ?, job = ?, hiredate = TO_DATE(?,'YYYY-MM-DD'), mgr = ?, comm = ?, sal = ?, deptno = ?"
					+ " where empno = ?";

			PreparedStatement ps = con.prepareStatement(query);

			// 값 넣자~
//			ps.setInt(1, dto.getEmpno());
			ps.setString(1, dto.getEname());
			ps.setString(2, dto.getJob());
			ps.setDate(3, dto.getHireDate());
			ps.setInt(4, dto.getMgr());
			ps.setInt(5, dto.getComm());
			ps.setInt(6, dto.getSal());
			ps.setInt(7, dto.getDeptno());

			ps.setInt(8, dto.getEmpno());

			result = ps.executeUpdate();

			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int insertEmp(EmpDTO dto) {
		int result = -1;

		try {

			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();
			// ## DB 접속 끝

			// SQL 준비

			String query = " INSERT INTO";
			query += " emp2 (empno, ename, sal, deptno, hiredate)";
			query += " VALUES (?, ?, ?, ?, sysdate)";

//			PreparedStatement ps = con.prepareStatement(query);
			PreparedStatement ps = new LoggableStatement(con, query);
			ps.setInt(1, dto.getEmpno());

			ps.setString(2, dto.getEname());

			ps.setInt(3, dto.getSal());

			ps.setInt(4, dto.getDeptno());

			// 실제 실행되는 sql을 출력해볼 수 있다
			System.out.println(((LoggableStatement) ps).getQueryString());

			// SQL 실행
			result = ps.executeUpdate();

			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public EmpDTO selectOne(int empno) {
		EmpDTO empDTO = null;

		try {

			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();
			// sql 준비
			String sql = "select * from emp2 where empno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			// ?를 값으로 채워줌
			// 첫번째 전달인자는 ?의 순서
			// 만약에 글씨라면 setString, 알아서 '로 감싸준다
			ps.setInt(1, empno);

			// sql 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();

			// 결과 활용
			if (rs.next()) {
				empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt("empno"));
				empDTO.setEname(rs.getString("ename"));
				empDTO.setJob(rs.getString("job"));
				empDTO.setHireDate(rs.getDate("hireDate"));
				empDTO.setMgr(rs.getInt("mgr"));
				empDTO.setComm(rs.getInt("comm"));
				empDTO.setSal(rs.getInt("sal"));
				empDTO.setDeptno(rs.getInt("deptno"));
			}

			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return empDTO;
	}

	public int deleteOne(EmpDTO dto) {
		int result = -1;

		try {
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataFactory.getConnection();

			// SQL 준비
			String query = "delete from emp2 where empno = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, dto.getEmpno());

			// SQL 실행
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public EmpDTO selectLogin(EmpDTO empDTO) {
		EmpDTO resultDTO = null;
		try {
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataFactory.getConnection();

			// SQL 준비
			String query = "select * from emp3 where ename = ? and empno = ?";
			
			PreparedStatement ps = new LoggableStatement(con, query);
				
			ps.setString(1, empDTO.getEname());
			ps.setInt(2, empDTO.getEmpno());
			
			
			// 실제 실행되는 sql을 출력해볼 수 있다
			System.out.println(((LoggableStatement) ps).getQueryString());

			// SQL 실행
			ResultSet rs  = ps.executeQuery();
			
			while(rs.next()) {
				resultDTO = new EmpDTO();
				
				resultDTO.setEmpno(rs.getInt("empno"));
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setSal(rs.getInt("sal"));
				
			}
			rs.close();
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultDTO;
	}
}
