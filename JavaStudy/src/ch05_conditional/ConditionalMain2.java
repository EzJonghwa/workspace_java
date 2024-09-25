package ch05_conditional;

import java.util.Scanner;

/**
 * Class Name	: ConditionalMain2
 * Author		: Jeon
 * Created Date : 2024. 8. 7.
 * Version		: 1.0
 * Purpose		: 조건식
 * Description	: switch
 */
public class ConditionalMain2 {

	public static void main(String[] args) {
		// switch 문은 단순 값을 매칭하는 경우 사용
//		Scanner scan = new Scanner(System.in);
//		int num = Integer.parseInt(scan.nextLine());
		int num = 1;
		switch(num) {
		case 0:
			System.out.println("수강등록");
			break;
		case 1:
			System.out.println("기초 프로그래밍");
			break;
		case 2:
			System.out.println("취업관련");
			break;
		default:
			System.out.println("종료");
		}
	
	
	String a = "펭수";
	if (a == "펭수") { //java  7 이상에서 문자열도 == 비교가능
		System.out.println("펭수^^");
		}
	if (a.equals("펭수")) 
		{ // "a == 펭수" 이전 버전에서 문자열 비교 
		System.out.println("팽수!!!");
		}
	
	
	
	
	
	}
}
