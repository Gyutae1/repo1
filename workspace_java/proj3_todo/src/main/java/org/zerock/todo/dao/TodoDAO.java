package org.zerock.todo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.zerock.todo.dto.TodoDTO;

public class TodoDAO {
	
	private Connection getConnection() {
		
		Connection con = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott2_7";
		String password = "tiger";
		
		try {
			// Class.forName : String을 이용해서 class를 생성한다
			// 드라이버 : 서로 다른 것들(java, oracle)이 소통할 수 있게 해주는 것
			// 오라클 드라이버 로딩
			Class.forName(driver);
			// DB 접속
			con = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public List<TodoDTO> selectAll(){
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott2_7";
		String password = "tiger";
	     
	     
	    try {
	    	 // Class.forName : String을 이용해서 class를 생성한다
	    	 // 드라이버 : 서로 다른 것들(java, oracle)이 소통할 수 있게 해주는 것
	    	 // 오라클 드라이버 로딩
	    	 Class.forName(driver);
	    	 // DB 접속
	    	 Connection con = DriverManager.getConnection(url, user, password);
	    	 
	    	 // SQL 준비
	    	 String query = "select * from tbl_todo";
	    	 PreparedStatement ps = con.prepareStatement(query);
	    	 
	    	 // SQL 실행 및 결과 확보
	    	 ResultSet rs = ps.executeQuery();
	    	 
	    	 
	    	 // 결과 활용
	    	 // re.next() 다음줄이 있는가?
	    	 while(rs.next()) {
	    		 // 전달인자로 컬럼명을 적고 그 내용을 형변환 해서 가지고 온다
	    		 int tno = rs.getInt("tno");
	    		 String title = rs.getString("title");
	    		 String finished = rs.getString("finished");
	    		 // java.sql.Date
	    		 LocalDate duedate = rs.getDate("duedate").toLocalDate();
	    		 
	    		 TodoDTO dto = new TodoDTO();
	    		 dto.setTno(tno);
	    		 dto.setTitle(title);
	    		 dto.setDueDate(duedate);
	    		 dto.setFinished(finished.equals("Y")? true : false);
	    		 
	    		 list.add(dto);
	    	 }
	    	 
	    	 rs.close();
	    	 ps.close();
	    	 con.close();
	     } catch(Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     return list;
	}
	
	public TodoDTO selectOne(int tno) {
		TodoDTO todoDTO = null;
		
		// DB 접속
		Connection con = getConnection();
		
		// 접속이 안되었다면 null을 바로 리턴한다
		if(con == null) return null;
		
		try {
			
			// sql 준비
			String sql = "select * from tbl_todo where tno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			// ?를 값으로 채워줌
			// 첫번째 전달인자는 ?의 순서
			// 만약에 글씨라면 setString, 알아서 '로 감싸준다
			ps.setInt(1, tno);
			
			// sql 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			if( rs.next() ) {
				todoDTO = new TodoDTO();
				todoDTO.setTno( 	 rs.getInt("tno") );
				todoDTO.setTitle( 	 rs.getString("title") );
				todoDTO.setDueDate(  rs.getDate("duedate").toLocalDate() );
				todoDTO.setFinished( rs.getString("finished").equals("Y") ? true : false);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return todoDTO;
	}
	
	public int insert(TodoDTO dto) {
		int result = -1;
		
		try {
			// Servers 폴더의 context.xml에서
			// name이 jdbc/oracle인 resource를 가져와서 DataSource로 저장하기
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 : 커넥션풀을 사용해서
			Connection con = dataFactory.getConnection();
			
			String query = "insert into tbl_todo (tno,title,duedate,finished)\r\n";
					query += "values (seq_todo.nextval,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getTitle());
			
			Date date= Date.valueOf(dto.getDueDate());
			ps.setDate(2, date);
			
			String finished = dto.isFinished()? "Y" : "N";
			ps.setString(3, finished);
			
			// sql 실행
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public int update(TodoDTO dto) {
		int result = -1;
		
		try {
			// Servers 폴더의 context.xml에서
			// name이 jdbc/oracle인 resource를 가져와서 DataSource로 저장하기
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 : 커넥션풀을 사용해서
			Connection con = dataFactory.getConnection();
			
			String query = "update tbl_todo"
					+ " set title = ?, duedate = TO_DATE(?,'YYYY-MM-DD'), finished = ?"
					+ " where tno = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dto.getTitle());
			
			Date date= Date.valueOf(dto.getDueDate());
			ps.setDate(2, date);
			
			String finished = dto.isFinished()? "Y" : "N";
			ps.setString(3, finished);
			
			ps.setInt(4, dto.getTno());
			
			// sql 실행
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(TodoDTO dto) {
		int result = -1;
		
		try {
			// Servers 폴더의 context.xml에서
			// name이 jdbc/oracle인 resource를 가져와서 DataSource로 저장하기
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속 : 커넥션풀을 사용해서
			Connection con = dataFactory.getConnection();
			
			// sql 준비
			String query = "delete from tbl_todo where tno =?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, dto.getTno());
					
			
			// sql 실행
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
