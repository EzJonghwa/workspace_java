package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop(5);
	}
	
	//input : 고객수
	//output : 없음
	//고객 수 만큼 커피를 주문받아 금액을 출력하는 메소드 생성.

	public static void shop(int num) {
		System.out.println(num + "명의 고객 출현");
		System.out.println("================");
		Scanner scan = new Scanner(System.in);
		int i =1;
		while(num >=i) {
			System.out.println((i)+ "번 째 고객님 어떤걸 드릴까요");
//////////////////////////////////////////////////////////////////////////////
			int price = 0;
			//2. 조건문
			String order = scan.nextLine();
			switch (order) {
			case "아아" : 
			case "아메리카노" : 
				price = 3000;
				break;
			case "카푸치노":
				price = 4500;
				break;
			case "밀크티":
				price = 5000;
				break;
			default:
				System.out.println("메뉴가 없습니다....");
				break;
			}
			//4. 출력
	
			if (price>0) {
				i++;
				System.out.println("선택하신 음료는" + price +"원 입니다.");
			}
///////////////////////////////////////////////////////////			
		}
		scan.close();
	}
	
}
