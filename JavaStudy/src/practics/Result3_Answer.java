package practics;

import java.util.Scanner;

public class Result3_Answer {

	public static void main(String[] args) {
		// 0~3 업다운 게임
		//1~50 사이의 랜덤 정수 생성
		
		
		
		System.out.println("<.=======================업다운 게임!=======================.>");
		System.out.println("<.======================범위 :1~50 사이======================.>");
	
		int randInt = (int)(Math.random() *50 +1); //Math.random()난수 생성 메소드 0~1사이 실수
		System.out.println(randInt);
		int chance = 5;
		Scanner scan = new Scanner(System.in);
		
	while(true) {
		
		System.out.print(" 숫자를 입력해주세요!! >>");
		int userpick = Integer.parseInt(scan.nextLine()); // nextLine 
			
			
		if (userpick ==randInt) {
			System.out.println("정답");	
			break;
		}
		chance --;
		if (chance==0) {
			System.out.println("실패 하였습니다 정답은 :" + randInt + "입니다");
				break;
		}
			
			if (userpick < randInt) {
					
			System.out.println("업!! 기회가" + (chance) + "번 남았습니다!!");
					
			}else if (userpick > randInt) {
			
				System.out.println("다운!! 기회가" + (chance) + "번 남았습니다!!");
			}else if(userpick == randInt){
					System.out.println("정답입니다.");
					break;
				}
			
				
			}
		scan.close();
	}
}		






