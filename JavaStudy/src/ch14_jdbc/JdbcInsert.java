package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcInsert {
	
	public static void main(String[] args) {
		//db와 연결
		Connection conn = null;
		//sql명령
		PreparedStatement ps = null;
		//쿼리실행 결과
		ResultSet rs = null;
		//1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("등록 실패");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료 
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "java";
		String db_pw = "oracle";
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			System.out.println("접속 성공");
			StringBuffer query = new StringBuffer();
			query.append(" INSERT INTO 학생 (학번, 이름)");
			query.append(" VALUES((SELECT nvl(max(학번),0) +1 FROM 학생), ?) ");
			System.out.println(query);
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, "팽수");
			int cnt = ps.executeUpdate();
			if(cnt > 0 ) {
				System.out.println(cnt + " 행이 삽입됨.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체를 꼭 닫아야함.
			// 안닫으면 계속 쌓여서 에러 발생
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		
	}
}
