package practics;

public class Result02 {

	public static void main(String[] args) {
		// 10의 팩토리얼 구하기
		
		int mul = 10;
		for (int num = 9; num>=1; num--) {
			mul*=num;
		}
		System.out.println("10의 팩토리얼은: " + mul);
	
		// 15의 팩토리얼 구하기
		
		long mul2 = 15;
		for (int num2 = 14; num2>=1; num2--) {
			mul2*=num2;
		}
		System.out.println("15의 팩토리얼은: " +mul2);
	}	
}
