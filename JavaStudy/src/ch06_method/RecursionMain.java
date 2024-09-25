package ch06_method;

/**
 * Class Name	: RecursionMain
 * Author		: Jeon
 * Created Date : 2024. 8. 8.
 * Version		: 1.0
 * Purpose		: method
 * Description	: recursion function
 */
public class RecursionMain {
	public static void main(String[] args) {
		System.out.println(necFactorial(10));
		Func(10);
	}
	
	public static long necFactorial(int num) {
		if (num ==1) {
			return 1;
		}
		return num*necFactorial(num-1);
		
		// 3을 입력 받았다면
		// 3* recFactorial(2)
		// 3*2*recFactorial(1)
		//
	}
	public static void Func(int num) {
		
		if (num ==0) {
			return;
		}else {
			System.out.println("hi");
			Func(num-1);
		}
		
	}
}
