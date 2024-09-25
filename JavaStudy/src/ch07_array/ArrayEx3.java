package ch07_array;

public class ArrayEx3 {

	public static void main(String[] args) {
		// Q. 월리를 찾아라!!
		//findwally에 월리가 몇개 들어가는지 출력해 주세요.
		String findWally ="윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0;
		int all =findWally.length();
		int after = findWally.replaceAll("월리","").length();
		System.out.println(after);
		count = (all - after)/2;
		System.out.println("월리는 총:" + count);
		// replace all 로 월리를 지워버리고 
		// 원래 length 값(all) - 월리를 제거한 length값 / 2를 하면 월리의 수를 역으로 계산가능
		
		
		int count2 =0;
		for (int i = 0; i<findWally.length()-1;i++) {
			String subWally = findWally.substring(i,i+2);
			System.out.println(subWally);
			if (subWally.equals("월리")) {
				count2 +=1;
			}
			
		}
		System.out.println("월리는 총:" + count2);
		// for 문으로 findwally.length 값에서 -1을 한 값 59를 
		//(인덱스 참조를 위해) 최댓 값으로 설정 후
		//findwally 의 substring (i,i+2)를 이용
		//문자열 비교 함수인 equals 로 "월리"를 대조해서 count 함

	}

}
