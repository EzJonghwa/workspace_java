package ch04_operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// 사용자애개 이메일 주소를 압력 받으세요
		// email 형식이 아니면 "이메일 형식이 아닙니다" 맞으면 "사용가능" 출력
		// ex) indexOf는 특정 문자열을 찾아 인덱스를 반환하는데 없으면 -1을 리턴함
		
		Scanner scan = new Scanner(System.in);
		System.out.println("e-mail 주소를 입력하세요");
		System.out.print(">>>");
		String userEmail = scan.nextLine();
		
		int email = userEmail.indexOf("@");
//		System.out.println(email);
		String msg = (email == -1) ? "이메일로 사용이 불가" : "사용가능";
		System.out.printf("고객님이 임력하신 :%s은 %s합니다\n",userEmail,msg);	

	}

}
