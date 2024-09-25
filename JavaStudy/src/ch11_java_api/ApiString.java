package ch11_java_api;import java.util.HashMap;

public class ApiString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "길동";
		System.out.println(a);
		System.out.println(a.hashCode());	// 주소
		
		a= "펭순";
		System.out.println(a);
		System.out.println(a.hashCode());
		
		
		// String 은 불변 (immutable)으로
		// 한번 초기화 되면 그 갑이 변경 되지 않음
		// 변수에서 값 할당시 바뀌는건 새로운 객체를 만든 것임
		// 메모리 영역에서 매번 새로운 String 객체를 만들면 카비지컬렉터(메모리관리)에서 할 일이 많아짐
		// 그래서 변경이 많다면 StringBuffere 클래스 사용
		// 문자열을 계속 받아야하는 스트리밍 상황에서 사용
		// 만들어져있는 내용이 바뀌는것 == 메모리가 한번만 할당되기에 변경시 알맞게 샤용 가능(자원 낭비 방지)
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("hi");
		System.out.println(strBuffer);
		strBuffer.append("hello");
		System.out.println(strBuffer);
		// 문자열 가져오기
		String str = strBuffer.toString();
		System.out.println(str);
		
		
		
	}

}
