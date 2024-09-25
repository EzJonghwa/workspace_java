package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//거꾸로 틔를 5층 만들어보자
		//실행결과
//		*****
//		****
//		***
//		**
//		*
		String star ="*****";
		for (int n=5; n>=0; n--) {
			System.out.println(star.substring(0,n));
		}
		for (int n=5; n>=0; n--)  {
			for (int j=0; n<1; n++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
