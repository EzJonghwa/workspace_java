package ch02_variable;

import java.util.Scanner;

public class variableEx {

	public static void main(String[] args) {
		// 사용자의 "이름:나이" 를 입력받아 
		// 각각 변수에 할당 후 출력 하시오
		
		// 콘솔에서 사용자 입력을 받는 객체
		Scanner scan = new Scanner(System.in); //(system.in) :입력
		System.out.println("이름:나이를 입력하새요."); //(system.out) :출력
		String userString = scan.nextLine();
		System.out.println(userString);
		
		int idx = userString.indexOf(":");
		String name =userString.substring(0,idx);
		String age = userString.substring(idx+1);
		System.out.println("입력하신 이름은 :" + name +  " 나이는 :" + age);
		// indexOf 와 Substring  을 사용하여 위 내용을 완성해보자
		//println : 줄바꿔서 출력
		//printf 형식과 출력내용
	}

}
