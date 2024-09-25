//package practics;
//
//import java.util.concurrent.Flow.Subscriber;
//
//public class Result03_1 {
//
//	public static void main(String[] args) {
//		// 같은 성 찾기 메소드를 작성해 주새요.
//		// input :String, String[]
//		// output :x
//		// 전달받은 배열에서 전달받은 성씨의 인원수를 출력하세요
//		// 호출:SearchName("이", students)
//		// 출력 :'이'씨 성을 가진 동기분은 총 3명 있습니다.
//		// 이소희 씨,이승옥씨,이원호씨
//		
//		String[] student = { "강민호", "권철규", "김윤아", "김정인", "김혜원",
//				"박정호", "서원빈", "안서령", "이소희", "이승욱", 
//				"이원호", "전영범", "전종화","정도현", "최대준", 
//				"최지은", "한준희" };
//		
////		int count=0;
//////		System.out.println(student.length);
////		
////		for (int i =0; i<student.length-1; i++) {
//////			System.out.println(student[i]);
//////			System.out.println(student[1].substring(0,1));
////			String FirN= student[i].substring(0,1);
////			System.out.println(FirN);
////			
////			int FirNl = FirN.length();
////			
////				for(int j = 0; j<FirNl; j++) {
////					if (FirN.equals("김")) {
////						count++;
////					}
////					System.out.println("김씨는 :"+count+"명");
////				}
//////		System.out.println(student[2].substring(0,1));
//		
//	SearchName("김",student);
//	SearchName("이",student);
//	SearchName("박",student); 
//		
//	}
//		
//
//	// for 문 인덱스 값 진입 해서 
//	// 첫글자 의 인덱스를 판별후
//	// 카운트
//	// 출력
//}
//
//	public static void SearchName(String firn, String[] fullN) {
//		int count=0;
//		for (int i =0; i<fullN.length-1; i++) {
////			System.out.println(student[i]);
////			System.out.println(student[1].substring(0,1));
//			String FirN= fullN[i].substring(0,1);
//			System.out.println(FirN);
//			
//			int FirNl = FirN.length();
//			
//				for(int j = 0; j<FirNl; j++) {
//					if (FirN.equals(firn)) {
//						count++;
//					}
//					System.out.println(firn+"씨는 :"+count+"명");
//				}
//		}
//		
//		
//		
//	}
//}
//		
//
