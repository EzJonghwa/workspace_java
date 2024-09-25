package ch14_jdbc;

import java.sql.Connection;

import ch14_jdbc.jdb.ConnectionPool;

public class TestMain {

	public static void main(String[] args) {
		
		
		ConnectionPool cp = ConnectionPool.getInstance();
		
		Connection conn1 = cp.getConnection();
		System.out.println("conn1 가져옴.");
		
		Connection conn2 = cp.getConnection();
		System.out.println("conn2 가져옴.");
		
		Connection conn3 = cp.getConnection();
		System.out.println("conn3 가져옴.");
		
		Connection conn4 = cp.getConnection();
		System.out.println("conn4 가져옴.");
		
//		Connection conn5 = cp.getConnection();
		// 5번째 연결 요청
		new Thread(()->{
			Connection conn5 = cp.getConnection();
			System.out.println("conn5을 얻었습니다.:" +conn5);
		}).start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cp.releaseConnection(conn4);
		System.out.println("conn4를 반환했습니다");
		

	}

}
