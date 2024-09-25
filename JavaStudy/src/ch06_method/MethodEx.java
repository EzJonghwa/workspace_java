package ch06_method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		// 이름 국어점수 수학점수 영어점수를 입력받아
		//평균과 등급을 출력하는 메소드를 작성하시오
		//input: String ,int, int, int
		//output 없음
		//등급은 90이상A 80이상 B 나머지 C
		// xxx 님의 평균은 (소숫점 둘째 자리가지 출력 ) 으로 y 등급입니더
		makeCd("펭수", 80, 70, 60);
		makeCard("펭수", 80, 70, 60);

	}
	
	public static void makeCd (String A, int b ,int c, int d) {
			float Avg = (b + c + d)/3;
			
			String grade = "";
			if (Avg >= 90) {
				grade = "A";
			}else if (Avg >= 80) {
				grade = "B";
			}else {
				grade = "C";
			}
			System.out.println(A + "님의 평균은" + Avg + "으로" + grade + "등급입니다" );
		
	}
	 public static void makeCard (String nm, int kor ,int math, int eng) {
		 double avg =(kor + math + eng )/3.0;
		 
		 String grade = "C";
		if (avg >= 90) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B";
		}else {
		}
		System.out.printf("%s님의 평균은 %.2f 등급으로 %s 등급 입니다.",nm,avg,grade );
}
}
