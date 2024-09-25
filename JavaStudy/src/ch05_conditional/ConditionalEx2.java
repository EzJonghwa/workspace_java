package ch05_conditional;

public class ConditionalEx2 {

	public static void main(String[] args) {
		// 각자리의 수를 더한 값을 출력하시오
		// 출력결과 :2 + 9 + 8 = 19
		// ex) 문자열로 한자리씩 or 각 한자리를 나눠서
		int num = 298;
		String test = num +"";

		int a = Integer.parseInt(test.substring(0,1));
		int b = Integer.parseInt(test.substring(1,2));
		int c = Integer.parseInt(test.substring(2,3));
		int mul = a+b+c;

		System.out.println(mul);
		
		int st1 = num / 100;
		System.out.println(st1);
		int st2 = (num / 10) %10 ;
		System.out.println(st2);
		int st3 = num % 10;
		System.out.println(st3);
		int mul2 = st1 + st2 + st3;
		System.out.println(mul2);
	}

}
