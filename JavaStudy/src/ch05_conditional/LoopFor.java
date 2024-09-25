package ch05_conditional;

/**
 * Class Name	: LoopFor
 * Author		: Jeon
 * Created Date : 2024. 8. 7.
 * Version		: 1.0
 * Purpose		: 반복문
 * Description	: for문 중요함!!
 */
public class LoopFor {

	public static void main(String[] args) {
		// for 문 (1.초기회식; 2.조건식; 4.증감식)
		//			3.실행문 순서대로 반복됨
		for(int i = 1; i <=10; i ++) {
			System.out.println(i);
		}
		//1~10 까지의 합은?
		int sum =0;
		for (int i =1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10을 더하면:" +sum);
		
		//21 ~45를 더하는경우
		int sum2 =0;
		for (int i2=21; i2<=45; i2++) {
			sum2+=i2;
		}
		System.out.println("21~45을 더하면:" +sum2);
		// 1~40 까지 중에 짝수만 더한 값은?
		//1. 반복문 만들기
		//2. 특정 조건일 때만 더하기
		//3. 출력
		
		int sum3 =0;
		for (int i=1; i<=40; i++) {
			if (i%2 ==0) {
				System.err.print(i);
				System.err.print(" ");
				sum3 +=i;
				
			}
		}
		System.out.println();
		System.out.println("1~40 가지의 짝수만 더한 값은 :" +sum3);
		
		
		// 초기값을 0부터 시작해서 10번 *<--로 프린팅 하시오
		for (int a=0; a<10; a++) {
			System.out.print("*");
		}
		// 구구단 출력 
		int dan = 8;
		for (int dd =1; dd<=9; dd++) {
			System.out.printf("%d x %d = %d\n" , dan , dd, dan*dd);
		}
		// 10 부터 1까지
		for(int i =10; i >0; i--) {
			System.out.println(i);
		}
		//5 씩 증가 
		for (int i =1; i<=100; i+=5) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		//2~9단 출력
		for (int i=2; i<=9; i++) {
			System.out.println(i+"단");
			if (i==5) {
				continue;
			}
			for (int j = 1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i , j, i*j);
			}
		}
		// break문 -> 반복문 내에서 break 문이 실행되면 반복문이 즉시 종료됨
			// 해당 스코프 안에서의반복문만 종료됨
		//1~n 까지 더한 값이 100 이상 되는 지점의 n을 구하시오.
		int sum5 =0;
		for (int i=1; i<9999; i ++) {
			sum5 +=i;
			if (sum5>=100) {
				System.out.printf("100 이상이 되는 1+~%d\n",i);
				break;
			}
		}
		
		outer:
			for (int i=0; i<5; i++) {
				System.out.println("메인 for" +i);
				for (int j = 0; j<5; j++) {
					System.out.println("서브 for"+j);
					if (j==2) {
//						break outer;
					}
				}
			}
		
		
		
		
		
		
		
		
		
		
	
	}
}

