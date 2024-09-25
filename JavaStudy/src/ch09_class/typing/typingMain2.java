package ch09_class.typing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class typingMain2 {

	public static void main(String[] args) {
		int num ;
		// args <--해당 메인메서드 실행시 입력값이 있으면 args에 담김.
		// ex) java TypingMain 1     <-- TypingMain호출시 매개변수로 1사용
		if(args.length > 0) {
			num = Integer.parseInt(args[0]);
		}else {
			num = Dictionary.OPTION_STUDENT_NAME;
		}
		System.out.println(" == typing Game == (0.name, 1.coding, 2.random)");
		System.out.println(num + " select");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> wordList = Dictionary.makeWordList(num);
		// 현재시간
		long before = System.currentTimeMillis(); // UTC기준시 밀리초
		int s = 0;
		int f = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			// 단어중 랜덤하게 선택			
			int randIdx = (int) (Math.random() * wordList.size());
			System.out.println(wordList.get(randIdx));
			System.out.print(">>>");
			String input = scan.nextLine();
			// 입력 단어와 문제 단어가 일치하면 삭제 
			if(wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx);
				s++;
			}else {
				f++;
			}
			// 단어가 없으면 종료 
			if(wordList.size() == 0) {
				break;
			}
			if(cnt == 10) {
				System.out.println(cnt + "회 시도");
				System.out.printf("s:%d f:%d \n", s , f );
				break;
			}
		}
		long after = System.currentTimeMillis();
		long diff = after - before; // 소요시간
		double result = diff / 1000.0 ; // 초 변환
		System.out.println(result + " 초 걸리셨습니다.");
	}

}
