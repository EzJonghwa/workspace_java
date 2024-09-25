package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx3 {

	public static void main(String[] args) {
		// 커피 주문
		// 아아 or 아메리카노 :3000
		// 카푸치노 : 4500
		// 밀크니 :5000 만약 해당 메뉴가 없으면 "메뉴가 없습니다." 출력
		//1. 주문받기
	Scanner scan = new Scanner(System.in);
	System.out.print("주문하실 메뉴를 입력해주세요 \n>>>");
	String order = scan.nextLine();
	int price = 0;
		//2. 조건문
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
		System.out.println("선택하신 음료는" + price +"원 입니다.");
	}
	scan.close();	
	
			
			
	}

}
