package practics;

import java.util.Scanner;

public class Result03_3 {
	
	// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을
	// 눌렀을때, 한 대의 엘리베이터가 이동하는 프로그램 구현
	
	// 1. 사용자의 현재 위치를 Scanner로 입력하면
	//	 사용자의 위치와 더 가까운 엘리베이터가 이동한다.
	// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면
	//	 둘 중 위 층의 엘리베이터가 내려온다.
	// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다.
	// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력
	
	// ex) Math.abs(2)  -> 2 : 절대값 리턴
	// ex) Math.abs(-2) -> 2 : 절대값 리턴
	
	//----------------------------------------------------------------------예시 
	int elevatorA = 10; // 임의의 엘리베이터 A의 위치 
	int elevatorB = 4;  // 임의의 엘리베이터 B의 위치 
	Scanner scanner = new Scanner(System.in);
	
	// 움직인 엘리베이터가 A이면 1, B이면 2
	final int ACTIVE_ELEVATOR_A = 1;  // 상수로 고정 
	final int ACTIVE_ELEVATOR_B = 2;
	//현재 활성화된 엘리베이터를 나타냅니다. 사용자의 위치에 가장 가까운 엘리베이터가 활성화되며,
	//이는 나중에 사용자가 이동하고자 하는 층으로 엘리베이터를 이동시키는 데 사용됩니다.
	int activeElevator = 0;
	//----------------------------------------------------------------------예시
	
//	while(true) {
//		System.out.println("=");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//
//	}
	
	
	
}
