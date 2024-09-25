package ch02_variable;

public class variable_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	/*<--여러줄 주석
	 * 패키지 (폴더) 이름은  전부 소문자로 작성
	 * 필요하다면 (__) 언더바 사용
	 * 
	 * 변수명 (함수명)
	 * java는 카멜 표기법 (camel,낙타 표기법이라함)
	 * 첫 글자는 소문자, 다음단어들은  대문자로 시작
	 * ex todayIsHappy
	 * 
	 * python 은 스네이크 표기업 사용
	 * ex) today_is_happy
	 */
	
	// 정수타입
	//[데이터 타입] [변수명]
	int todayIsHappy =0;
	todayIsHappy = todayIsHappy +10;
	System.out.println(todayIsHappy);
	// 문자열
	String strToday = "오늘은 8월 5일";
	System.out.println(strToday);
	// 정수 long l 붙음
	long size = 1000000000000L;
	System.out.println(size);
	// 실수 float f 붙음
	float floatVar = 3.14f;
	System.out.println(floatVar);
	

	}
}
