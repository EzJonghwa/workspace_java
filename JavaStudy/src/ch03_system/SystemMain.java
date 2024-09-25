package ch03_system;

import java.util.Scanner;

/**
 * Class Name	: SystemMain
 * Author		: Jeon
 * Created Date : 2024. 8. 6.
 * Version		: 1.0
 * Purpose		: system class study
 * Description	: 표준입출력
 */

public class SystemMain {

		public static void main (String[] args) {
			System.out.print("hi");
			System.out.print("hi"); //print 이어서 출력
			
			System.out.println("hello");
			System.out.println("hello");
			
			System.err.println("오류입니다."); // 다른 표시로 츌력하고자 할 때
			
			
			// 이스케이프 문자 사용
			// \n 개행 , \t 탭
			System.out.println("Hello \nWrold");
			// \" <-문자열로써의 쌍따옴표
			System.out.println(" \"안녕\" ");
			
			// printf 문자열 포맷 형태로 출력
			System.out.printf("원주율은 %.2f \n", 3.141592);
			System.out.printf("%d 명이 %s 를 들고있습니다.", 18, "java 수업");
			
//			Scanner scan =new Scanner(System.in);	
		}
}
