package ch09_class.common;

/**
 * Class Name	: utilClass
 * Author		: 202-2
 * Created Date : 2024. 8. 13.
 * Version		: 1.0
 * Purpose		: 공통 class
 * Description	: 유용한 메서드를 보통 common, commons .. 패키지로 분할 함
 */
public class utilClass {
	
	// public static 정적 메서드 어디서든 사용할 수있는 메서드
	// 인스턴스화를 하지 않아도 사용가능
	
	/**
	 * @Method name :weRound
	 * @작성일 : 2024.08.13
	 * @메소드 설명 :입력한 소수를 반올림하여 소수 n번째 자리로 리턴
	 * @param : num  반올림 하고자 하는 소수
	 * @param : 소수 n 번째 자리까지 반올림
	 * @return : 반올림된 소수를 리턴
	 * 
	 */
	
	public static double weRound(double num, int n) {
		int ten =1;
		for (int i=0; i<n; i++) {
			ten *=10;
		}
		num *=ten;
		long temp =Math.round(num);
		double result = (double)temp/ten;
		return result;
	}
	
	
	
	// 외부에서 import해서 가져와도 이분은 자체 테스트 실행 파일이기 때문에 타 문서에서 실행되지 x 
	public static void main(String[] args) {
		System.out.println(weRound(75.54658465, 4));
	}
	
	
}
