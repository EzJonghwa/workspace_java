package ch06_method;

/**
 * Class Name	: MethodMain
 * Author		: Jeon
 * Created Date : 2024. 8. 8.
 * Version		: 1.0
 * Purpose		: method
 * Description	: java 함수 클래스에 종속되어 있는 method
 */

public class MethodMain {
	// main 메소드 public  이며 static(전역) 하여 어디서든 사용가능하고 void 리턴이 없는 
	// 매개변수 한개 (String [] 배열타입 args?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsum(10,500);
		printsum(100,110);
		
		int resultsum = returnsum(5, 100);
		System.out.println(resultsum);
		System.out.println(returnsum(100,200));
		
		print("나는 함수다");
		//ctrl + 메소드 클릭 (메소드 선언 내용으로 이동)
		//Alt + < (방향키 왼쪽) 이전코드로 이동
		System.out.println(factorial(10));

	}
	
	public static void printsum(int from, int to) {
		int sum =0;
		for (int i = from ; i <= to; i++ ) {
			sum +=i;
		}
		System.out.printf("from : %d 부터 to : %d 까지 합은 :%d\n",from, to, sum);
	}
	
	public static int returnsum(int from, int to) {
		int sum =0;
		for (int i = from ; i <= to; i++ ) {
			sum +=i;
		}
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 메소드 오버로딩 동일 한 이름의 메소드를 다른 입력과, 다른 리턴으로 정의 할수있음.
	
	public static void print(int msg) {
		System.out.println(msg+" 는 정수다");
	}
	// 팩토리얼 메소드를 만드시오
	//input :int
	//output : long
	
	public static long factorial(int num) {
		long result =1;
		for (int i = 1; i<=num; i++) {
			result*=i;
		}
		return result;
	}
		
	
	
	
	
	}
		
	
	
	

