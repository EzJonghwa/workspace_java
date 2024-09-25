package ch02_variable;


// Alt + Shift + j

/**
 * Class Name	: variableMain
 * Author		: Jeon
 * Created Date : 2024. 8. 5.
 * Version		: 1.0
 * Purpose		: JAVA 기초 공부
 * Description	: 변수 의 데이터 타입
 */
public class variableMain {

	public static void main(String[] args) {
		// 상수 Constant 변경 불가 |
		final double MATH_PI = 3.14f;
		// 보통 full 대문자로 선언 변경하려고 할 시 오류
		
		double mathPi2 = 3.14f;
		mathPi2 = 1; // 변수는 변경 가능
		//java 의 경우 타입이 다른 변수를 사용시 형 변환을 해줘야함
		
		// 문자열 String 타입은 클래스로 관리되어짐(다양한 메소드 (함수)를 내장하고 있음)
		String fruits = "Apple, Banana, Cherry";
		//.length()문자열의 길이를 리턴
		System.out.println(fruits); // 출력 = Apple, Banana, Cherry
		System.out.println(fruits.length()); // 출력 = 21
		//.indexOf()특정 문자열을 찾아서 첫번째 인덱스를 리턴
		//문자열의 인덱스는 0부터 시작
		System.out.println(fruits.indexOf("Banana")); //  출력값 = 7 
//		String dold = "machine, running";
//		System.out.println(dold);
//		System.out.println(dold.length());
//		System.out.println(dold.indexOf("running"));
		//.substring(시작 인텍스) = 시작부터 끝까지
		// of (시작, 종료 인덱스) = 시작부터 종료인덱스 전까지
		System.out.println(fruits.substring(15));
		System.out.println(fruits.substring(7,13));
		System.out.println(fruits.substring(0,5));
		String stu = "펭수:10";
		//			   01234
		String name = stu.substring(0,2);
		System.out.println(name);
		
		String age = stu.substring(3); // 3번째부터 싲가해서 끝까지
		System.out.println(age);
		
		String stu2 = "김길동:200";
		String stu3 = "남궁민수:100";
		// :을 기준으로 앞 뒤를 나누면 된다. how to ? indexof and substract

		
		
		
		
	}
	
}
