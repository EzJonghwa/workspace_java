package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx1 {

	public static void main(String[] args) {
		//
		// 사용자로 부터 숫자입력을 맏아 짝수인지 홀수인지 판별하시오
		// 조건 1 정수만 입력받음.
		//		
		//		
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요(정수)");
			System.out.print(">>>");
			// if  문을 사용하여 짝수이면 "짝수" (산술 연산자 사용) / 홀수이면 홀수
		
			int idx = Integer.parseInt(scan.nextLine());
				
			if (idx%2 == 1 ) {
				System.out.printf("%d 는 %s입니다.", idx,"홀수");
			
			}else {
				System.out.printf("%d 는 %s입니다.", idx,"짝수");
			}
		
		
	}

}
