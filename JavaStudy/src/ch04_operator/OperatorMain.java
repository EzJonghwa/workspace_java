package ch04_operator;

import java.util.Scanner;

/**
 * Class Name	: OperatorMain
 * Author		: Jeon
 * Created Date : 2024. 8. 6.
 * Version		: 1.0
 * Purpose		: operator study
 * Description	: 기본연산자
 */
public class OperatorMain {

	public static void main (String[] args) {
		// 1. 증감연산자
		int num =10;
		num++;
		System.out.println("++ 이후 :" + num);
		num--;
		System.out.println("--이후 :" + num);
		// 주의 연산자의 전,후에 따라 다름
		
		int a,b;
		a = num ++;
		b = ++ num;
		System.out.printf("a:%d, b:%d \n", a , b);
		
		//2.대입연산자 +=, -=, *=, /=, %=
		int c = 1;
		c +=2; // c = c + 2
		System.out.println("c: " +c);
		c *=10; // c = c * 10 
		System.out.println("c: " +c);
		
		//3. 산술연산자 +, -, *, /, %
		// %는 나머지를 반환
		System.out.println(10 + 5);
		System.out.println(10 % 5); // 나머지가 0
		System.out.println(10 / 5); // 몫이  2 등등
		
		//4. 비교연산자
		int num1 =10;
		int num2 =20;
		System.out.println("===  비교 연산자  ===");
		System.out.printf("num1:%d, num2:%d \n", num1, num2);
		// 비교 후 true /false  값을 반환 - 왼족을 기준으로  비교연산이 적용
		System.out.println(num1 > num2);  // false
		System.out.println(num1 < num2);  //true
		System.out.println(num1 <= num2); //true
		System.out.println(num1 >= num2); // false
		System.out.println(num1 != num2); // (같지 않음) == true
		System.out.println(num1 == num2); // (같음) == false
		//5.삼항 연산자( 조건 연산자)
		System.out.println("===  삼항 연산자  ===");
		// (a) ? (b) : (c) a의 조건식이 true 면 b / false 면 c
		// 조건식? 참값: 거짓값
//		int t =10;
//		int y = 20;
//		int max = (t > y) ? t:y;
//		System.out.println("The maximum number is " + max);
		
		String msg = (a > 9) ? "a가 9보다 큼" : "a가 9보다 작음";
		System.out.println(msg);
		
		// 아이디는 10자리 이상
		System.out.println("아이디를 입력해주세요(10자리 이상):");
		System.out.printf(">>>");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		int len =userInput.length();
		System.out.println("입력길이: " + len);
		String message = 
				len >= 10 ? "사용가능합니다" : "10자리 이상으로 다시 작성하세요";
		System.out.println(message);
		
		//6.논리연산자 (&& = and) 둘다 true 일 떄 true
		//			(|| = or) 둘중 하나만 true 이면 true 
		//			(! = not) 부정
		System.out.println("===  논리연산  ===");
		System.out.println("아이디를 입력하세요(8에서 14길이):" );
		System.out.print(">>>");
		String userInput2 = scan.nextLine();
		int idLen = userInput2.length();
		String message2 = (idLen >= 8 && idLen <15) ? "가능" : "불가능";
		//					조건 1     and   조건 2   ?  참   :   거짓
		System.out.println(message2);
		
		// 성적이 90 이상이면 A, 80이상이면 B, 나머지 C
		System.out.println("성적을 입력하세요:");
		System.out.print(">>>");
		int score = Integer.parseInt(scan.nextLine());
		String grade = (score >=90) ? "A" : (score >=80) ? "B" : "C";
		//					식 1		?	참	: (거짓)식2	 ?	 참 : 거짓
		System.out.println(grade + "입니다.");
		
		
	}
}
