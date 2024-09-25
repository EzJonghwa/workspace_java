package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	
	private static final String URL ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private static final String DB_ID = "java";
    private static final String DB_PW = "oracle";
    public static boolean updateUser(int hakno, String userNm ) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
			StringBuffer query = new StringBuffer();
			query.append(" UPDATE 학생 ");
			query.append(" SET 이름 = ? ");
			query.append(" WHERE 학번 =? ");
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, userNm); 
			ps.setInt(2, hakno); 
			int cnt = ps.executeUpdate(); 
			return cnt > 0; 
					
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} finally {
			if(ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
	}
	public static void selectUser(int hakno) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
			StringBuffer query = new StringBuffer();
			query.append(" SELECT 이름, 전공, 평점");
			query.append(" FROM 학생 ");
			query.append(" WHERE 학번 =? ");
			ps = conn.prepareStatement(query.toString());
						ps.setInt(1, hakno); 
			rs = ps.executeQuery(); 
			while(rs.next()) {
				String nm = rs.getString("이름");
				String subject = rs.getString("전공");
				int score = rs.getInt("평점");
				System.out.println("이름:"+ nm + " 전공:" +subject + " 평점:"+score );
			}
					
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
	}
    
    public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("학사 정보 시스템입니다.");
			System.out.println("1.조회|2.수정(q:종료)");
			String msg = scan.nextLine();
			if(msg.equals("q")) {
				System.out.println("학사 정보 시스템 종료");
				break;
			}
			int sel = Integer.parseInt(msg);
			if(sel ==1) {
				System.out.println("조회할 학번을 입력해주세요:");
				// 학생의 정보 출력
				int hanNo = Integer.parseInt(scan.nextLine());
				selectUser(hanNo);
			}else if(sel == 2) {
				System.out.println("수정할 학번을 입력해주세요:");
				int hanNo = Integer.parseInt(scan.nextLine());
				System.out.println("새로운 이름을 입력하세요:");
				String nm = scan.nextLine();
				boolean result = updateUser(hanNo, nm);
				if(result) {
					System.out.println("정보가 성공적으로 업데이트 되었습니다.");
				}else {
					System.out.println("정보 업데이트에 실패했습니다.");
				}
			}else {
				System.out.println("다시 입력!!");
			}
		}
	}
}
