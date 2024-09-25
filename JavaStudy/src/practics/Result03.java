package practics;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		// 0~3 업다운 게임
		//1~50 사이의 랜덤 정수 생성
		
		
		
		System.out.println("<.======================= 업다운 게임! =======================.>");
		System.out.println("= 범위 :1~50 사이 =");
	
		int randInt = (int)(Math.random() *50 +1); //Math.random()난수 생성 메소드 0~1사이 실수
		
		int chance = 5;
		
	while(true) {
		
			System.out.print("숫자를 입력해주세요!! >>>");
			Scanner scan = new Scanner(System.in);
			int anSw = Integer.parseInt(scan.nextLine());
			
			if (chance>0) {
				if (anSw < randInt) {
					chance--;
					System.out.println("업!! 기회가" + (chance+1) + "번 남았습니다!!");
					
				}else if (anSw > randInt) {
					chance--;
					System.out.println("다운!! 기회가" + (chance+1) + "번 남았습니다!!");
				}else if(anSw == randInt){
					System.out.println("정답입니다.");
					break;
				}
			}
			
			else if (chance==0) {
				System.out.println("실패 하였습니다 정답은 :" + randInt + "입니다");
					break;
				}
			}
		}
}





