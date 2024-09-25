package ch05_conditional;

import java.util.Scanner;

/**
 * Class Name	: LoopWhile
 * Author		: Jeon
 * Created Date : 2024. 8. 7.
 * Version		: 1.0
 * Purpose		: 반복문
 * Description	: while
 */

public class LoopWhile {

	public static void main(String[] args) {
		// while(조건식) 조건이 true 면 반복(무한루프를 조심해야함)
		int i =1;
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("===============");
			System.out.println("이름을 입력하세요.(종료:q)");
			String nm = scan.nextLine();
			if (nm.equals("q")) {
				flag = false;
			}else {
				System.out.println(nm+" 님 환영합니다.");
			}
			System.out.println("===============");
		}
//		while(true) {
//			System.out.println("===============");
//			System.out.println("이름을 입력하세요.(종료:q)");
//			String nm = scan.nextLine();
//			if (nm.equals("q")) {
//				break;
//			}else {
//				System.out.println(nm+" 님 환영합니다.");
//			}
//			System.out.println("===============");
//		}
		int dan = 2;
		while(dan<=9) {
			System.out.println(dan+"단");
			int su=1;
			while(su<=9) {
				System.out.printf("%d x %d = %d\n", dan,su,dan*su);
				su++;
			}
			dan++;
		}
	}

}
