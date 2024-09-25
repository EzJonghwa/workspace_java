package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbcselect {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// db에 연결 
		Connection conn = null;
		
		PreparedStatement ps =null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("등록 실패");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id ="java";
		String db_pw ="oracle";
		try {
			conn = DriverManager.getConnection(url,db_id,db_pw);
			System.out.println("접속 성공");
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT info_no");
			query.append("		,nm");
			query.append("		,email");
			query.append("		,hobby");
			query.append(" FROM tb_info");
			query.append(" WHERE nm LIKE ? ||'%' ");
			System.out.println(query);
			
			ps = conn.prepareStatement(query.toString());
			ps.setString(1,"전");
			rs = ps.executeQuery();	// 쿼리문 실행
			
			 while(rs.next()) {
		          int no = rs.getInt("info_no");
		          String nm = rs.getString("nm");
		          String email = rs.getString("email");
		          String hobby = rs.getString("hobby");
		          
		          System.out.println("no:" +no+ "nm:" +nm
		          + "email:" + email+ "hobby:" +hobby);
		          
		          
		       }

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// connection 객체를 꼭 닫아야함
			// 안 닫으면 계속 쌓여서 에러 발생
				if(rs != null) {try {rs.close();} catch(SQLException e) {e.printStackTrace();}}
				if(ps != null) {try {ps.close();} catch(SQLException e) {e.printStackTrace();}}
				if(conn != null) {try {conn.close();} catch(SQLException e) {e.printStackTrace();}}
		}
	}

}
