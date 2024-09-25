package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작!");
		int [] arr = {1,2,3};
		String str =null;

		
	// 예외 처리를 해줌으로서 로직이 중단되지 않고 끝까지 진행되게 하기위함
		try {
			str.length();
			System.out.println(arr[3]);	// 배열상의 3번 위치에 값이 없음. 오류가 빌생가능한 로직을 예외처리
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인덱스 문제!!");
		
		
		}
		catch (NullPointerException e) {
			System.err.println("널이잖슴!!");
		
		
		} catch (Exception e) {
			System.out.println();
//			e.printStackTrace(); 		// 예외 발생 코드에 대해 추적한 내용을 콘솔에 출력
			System.err.println(e.toString());	// 문자열로 출력해줌
		}
		
		System.out.println("메인 종료!");
		
		System.out.println(ExMethod.dateMillSec2("2024/01/01"));	//try catch 처리
		try {
			System.out.println(ExMethod.dateMillSec("2024/01/01"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//throw 처리
		System.out.println("종료");
		
		
		
		
		try {
			ExMethod.printName("");
			
		} catch (BizExcrption e) {
			System.out.println(e.getErrCode()); 	// BizException 메서드
			System.out.println(e.getMessage());		// 부모 메서드
		}
		try {
			ExMethod.printName("길");
		} catch (BizExcrption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
