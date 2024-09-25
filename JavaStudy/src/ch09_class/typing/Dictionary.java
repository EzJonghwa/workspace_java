package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	// 전역적으로 사용하는 상수
	public static final int OPTION_STUDENT_NAME		=0;	// 보통 상수는 대문자로
	public static final int OPTION_CODING_WORD		=1;
	public static final int OPTION_RANDOM_ALPHABET	=2;
	
	// 타자연습 게임을 위한 단서 생성기
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> result = new ArrayList<String>();
		// option 0 학생이름, 1 코딩용어 2 렌덤알파벳
		if(option == OPTION_STUDENT_NAME) {
			result.add("kim pangsu");
		}else if (option == OPTION_CODING_WORD) {
			result.add("Class");
			result.add("static");
		}else if (option == OPTION_RANDOM_ALPHABET) {
			// 랜덤 알파벳 6자리
			// 10개 생성
			String[] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
			
			String ran = "";
			for (int i =0; i<10; i++) {
				int random = (int) (Math.random()*(alphabet.length+1));
				for (int j =0; j<6; j++) {
					ran += alphabet[random];
				}
			result.add(ran); 
			
			}
		}
			return result;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
