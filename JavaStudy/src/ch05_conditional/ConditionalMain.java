package ch05_conditional;

/**
 * Class Name	: ConditionalMain
 * Author		: Jeon
 * Created Date : 2024. 8. 6.
 * Version		: 1.0
 * Purpose		: 조건문
 * Description	: if $ switch
 */

public class ConditionalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =85;
		String grade = ""; //  전역변수 로서의 초기값 설정 {    }
		if (score >=90) {
			// if 문은 해당 조건이 true 면 해당 영역(scope)으로 진입( if(조건){값} )
			grade= "A";
		}else if(score >=80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(score + "는 " + grade);
		
		int price = 3000;
		int myMoney = 1000;
		if (price > myMoney) {
			System.out.println("돈이부족합니다...");
		}else {
			System.out.println("돈이 충분합니다!!!");
		}
		
		//조건 1: 이름은 1글자 이상 
		//조건 2: 전화번호는 10 or  11자리
		//조건 1이 만족하지 않으면 (가입 실패)
		//if 문의 중첩이 가능하다.
		String nm = "펭수";
		String phone = "0100000000";
		if (nm.length() >= 1) {
			if (phone.length() ==10 || phone.length() ==11) {
				System.out.println("환영합니다");
			}else {
				System.out.println("가입 실패");
			}
		}else {
			System.out.println("가입 실패");
		}
		
	}

}
