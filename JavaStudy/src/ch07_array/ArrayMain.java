package ch07_array;

import javax.swing.JPopupMenu.Separator;

/**
 * Class Name	: ArrayMain
 * Author		: 202-2
 * Created Date : 2024. 8. 9.
 * Version		: 1.0
 * Purpose		: Array 배열
 * Description	: 배열 선언및 사용
 */
public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String samjang = "삼장";
		String ogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		// 배열
		//String []문자열 배열
		String [] seoyougi = new String[4]; // 첨자는 배열의 크기 
		System.out.println(seoyougi.length);// .length = 배열의 길이를 리턴 0 1 2 3 (4개)
		System.out.println(seoyougi[0]);	// null 값이없을을 의미함 공간은 할당되었으나 값은 없음
		System.out.println(seoyougi); //[Ljava.lang.String;@5f150435= 현재 배열의 메모리 주소정보가 해쉬값으로 출력

		
		seoyougi[0] = samjang;
		seoyougi[1] = ogong;
		seoyougi[2] = saojeong;
		seoyougi[3] = palgye;	// 인덱스로 같은 타입의 데이터를 할당 및 수정 가능
		System.out.println(seoyougi[2]);
		printArr(seoyougi);// 출력을 위한 메서드 작성
		System.out.println(seoyougi[3]);
		
		int [] number =new int[3]; 
		System.out.println(number[0]); // default 0을 가짐 String 은 null
		boolean [] bools=new boolean[5]; 
		System.out.println(bools[0]);
		
		
		for (int i = 0; i<seoyougi.length;i++) {
			// 배열의 첫 요서에서 부터 순호;하면서 변경
			seoyougi[i] ="서유기"+seoyougi[i];
		}
		printArr(seoyougi);
		
		
		// 오공이 포함되어있는 배열의 요소를 찾아서 서유기 -> '드래곤볼'로 변경하시오
		for (int i = 0; i<seoyougi.length; i++) {
			//String.contains("포함 문자열") string 에서 '포함문자열'ㅇㅣ 있으면 true 아니면 false 를 리턴;
			if (seoyougi[i].contains("오공")) {
				System.out.println(i +":" +seoyougi[i]);
				//String.replace("찾는 문자열", "변경 문자열") string 에서 "찾는 문자열"을 찾아서 "변경문자열"로 변경
				//만약 변경하고자 하는 동일 문자열이 많다면 replaceAll <-- 전체다
				seoyougi[i] =seoyougi[i].replace("서유기","드래곤볼"); // 
			}
		}
		printArr(seoyougi);
	
	// 값을 할당하며 배열 선언
	String [] students = {"펭수","길동","동길","길수"};
	// String [] students = new String[] {"펭수","길동","동길","길수"}; 위와 동일함.
	printArr(students);
	String subjects = "JAVA, DB, JS, HTML"; // 공백이 존재함
	// ","을 구분으로 배열에 담기
	// 대상문자열.split(구분자)
	String [] subArr = subjects.split(",");
	printArr(subArr);
	// 문자열 양쪽 공백 제거(string.trim();)
	
	for (int i = 0; i<subArr.length; i++) {
		subArr[i] = subArr[i].trim();
	}
	printArr(subArr); // 공백이 제거된 모오습
	
	// 배열의 복사1.앏은 복사 shallow copy(주소값 복사)
	String[] sinSeoyugi = seoyougi;
	printArr(sinSeoyugi);
	sinSeoyugi[0] = "강호동";
	printArr(seoyougi);
	printArr(sinSeoyugi); 
	// 주소정보를 복사하는 것이기에 원래 있던 내용이 바뀜
	
	//배열의 복사 2. 깊은 복사 (deep copy) 새로운 객체(주소가 다름)
	String [] newSeoyugi = seoyougi.clone();
	newSeoyugi[2] = "은지원";
	printArr(seoyougi);
	printArr(newSeoyugi);
	// clone 으로 따로복사하여 새로운 객체를 만들었기에 수정시에도 원본에 문제가 없음.
	
	// deep copy 까먹음?
	String[] copy = new String[seoyougi.length]; // 새로운 배경객체를 복사 대상 객체의 길이 만큼으로 선언
	for (int i = 0; i <seoyougi.length; i++) {
		copy[i] = seoyougi[i];
	}
	printArr(copy);
	
//	String grade = {"국어"
	// 일차원 배열
	int [] oneD = {1,2,3}; //0,1,2
	System.out.println(oneD[1]);
	
	int [][] twoD= {{1,2,3}, //0.0 , 0.1 , 0.2 / 1.0 , 1.1 , 1.2 / 2.0 , 1.1 , 2.2  
					{4,5,6},
					{7,8,9}}; // 2중 for 문으로 접근
	System.out.println(twoD[0][1]);
	int [][][] threeD = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11}}};
						// 0.0,0, 0.0.1 , 0.0,2 / 0.1,0, 0.1.1 , 0.1.2
						// 1.0,0, 1.0.1 , 1.0,2 / 0.1,0, 1.1.1 , 1.1.2
	System.out.println(threeD[1][0][1]);
	
//	for(int i = 0; i <twoD.length; i++) {
//		for(int j = 0; twoD[i].length; j++) {
//			printArr2(int);
//		}
//	}
	
	
}	
	
	
	
	
	
	public static void printArr(String[] strArr) {
		for (int i = 0; i<strArr.length; i++) {
			if (i== strArr.length -1) {
				System.out.print(strArr[i]+"\n");
				break;
			}
			System.out.print(strArr[i]+",");
		}
		
		
//		public static void printArr2(int[] strArr) {
//			for (int i = 0; i<strArr.length; i++) {
//				if (i== strArr.length -1) {
//					System.out.print(strArr[i]+"\n");
//					break;
//				}
//				System.out.print(strArr[i]+",");
//			}
	}

}
