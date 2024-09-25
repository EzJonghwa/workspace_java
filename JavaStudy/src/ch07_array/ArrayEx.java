package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
		// 문자편집 단축키 : ALt - Shift - A
		// 자동 정렬 : cntr - shift - f
		// 우리반 학생들의 이름을 변수로

		
		String[] student = { "강민호", "권철규", "김윤아", "김정인", "김혜원",
							"박정호", "서원빈", "안서령", "이소희", "이승욱", 
							"이원호", "전영범", "전종화","정도현", "최대준", 
							"최지은", "한준희" };
		// 우리반 학생들의 이름을 출력하시오.
		// 학생들의 이름에 출석부 순번을 붙여주세요... 1.강민호 2. 권철규......
		for (int i = 0; i <student.length; i++) {
			System.out.println(student[i]);
		}
		for (int i = 0; i<student.length+1; i++) {
				System.out.println(i+1 +"."+ student[i]);
		}
		
	}

}
