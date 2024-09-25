package ch09_class.typing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class typingMain {

	public static void main(String[] args) {
		int num ;
		// args <-- 해당 메인메서드 실행시 입려값이 있으면 args에 담김.
		// ex) java TypingMain i 	<-- TypingMain 호출시 매개변수로사용
		if(args.length>0) {
			num = Integer.parseInt(args[0]);
			
		}else {
			num =Dictionary.OPTION_RANDOM_ALPHABET;
		}
		System.out.println(num + "select");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> wordList =Dictionary.makeWordList(num);
		
		
		long before = System.currentTimeMillis(); //utc 기준 밀리초
		while (true) {
			int randIdx = (int) (Math.random()*wordList.size());
			System.out.println(wordList.get(randIdx));
			System.out.println(">>>");
			String input = scan.nextLine();
			// 입력 단어와 문제 단어가 일치하면 삭제
			if(wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx);
			}
			
			// 단어가 없으면 종료
			if(wordList.size() ==0) {
				break;
			}
		}
		long after = System.currentTimeMillis();
		long diff = after - before;
		double result = diff /1000.0; // 초변환
		System.out.println(result + "초 걸리셨습니다.");
	}

}
