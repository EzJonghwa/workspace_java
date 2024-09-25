package ch08_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class Name	: CollectionList
 * Author		: 202-2
 * Created Date : 2024. 8. 12.
 * Version		: 1.0
 * Purpose		: Java Collection
 * Description	: ArrayList
 */
public class CollectionList {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션 프레임워크는 데이터를 보다쉽게 다룰 수있도록 재사용 가능한 컬렉션 클래스를 제공함.
		 * list, set ,map
		 * 1. List : 순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 * 			 원소에 쉽게 접근하기 위해 인덱스를 사용.
		 * 			 ArrayList, LinkedList
		 * 2. Map : key 와 value 값을 쌍으로 이루어진 객체를 저장하는 구조
		 * 			key 는 중복 될 수 없으며 각 키는 하나의 값을 가리킴.
		 * 3. set : 중복을 허용하지 않는  객체의 모음 원소의 순서는 보장하지 않음
		 * 			HashSet, TreeSet
		 * */
		// ArrayList(동적 배열 형태)
		ArrayList<String> students = new ArrayList<>();
		//<> 이부분은 제네릭 (generic)이라고 하며 코드에서 타입우ㅢ 안정성을 보장할 수있으며
		// 불필요한  캐스팅을 줄이기위해 만들어짐. 제데릭은 객체(참조타입)만 담을 수있음.
		// 기본타입(Int ,boolean ..)은  Wrapper class 를 사용 Integer Boolean
	
		students.add("펭수");
		students.add("동길");
		students.add("길수");
		System.out.println(students);
		
		System.out.println(students.get(1));			// get :index 로 접근 1 : 동길
		students.set(1,"펭순");							// set(인덱스 ,변경값) 요소 수정  동길 -> 팽순
		
		students.contains("길동"); 						// 리스트 안에 해당값이 존재하면 true 아니면 false 반환 
		System.out.println(students.contains("길동"));
		System.out.println(students.contains("길수"));
	
		System.out.println(students);					//   : [펭수, 펭순, 길수]
		
		System.err.println(students.indexOf("동길")); 	// 리스트 안에 해당 값이 존재하면 index 없으면 -1
		
		System.out.println(students.size());			//리스트의 요소수(= length())
		
		System.out.println(students.isEmpty()); 		// 리스트가 비어있는지 true /false
		
		students.remove("동길"); 						// 해당 값이 있으면 삭제 없으면  아무일도 안 일어남.
		
		
		students.clear(); 								// List 를 비움 :size(0);
		System.out.println(students); 					// clear 로 비웠기에 값이 없음
		System.out.println(students.isEmpty()); 		// 비었기에 true
		
		students.add("강민호");
		students.add("권철규");
		students.add("김윤아");
		students.add("김정인");
		students.add("김혜원");
		students.add("박정호");
		students.add("서원빈");
		students.add("안서령");
		students.add("이소희");
		students.add("이승욱");
		students.add("이원호");
		students.add("전영범");
		students.add("전종화");
		students.add("정도현");
		students.add("최대준");
		students.add("최지은");
		students.add("한준희");
	
		for (int i =0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		for (String str : students) {
			System.out.println(str);
		}
		// 1. 리스트 복사 (얇은 복사)
		
		ArrayList<String> stu = students;
		stu.set(0, "민호");
		System.out.println(students);
		System.out.println(stu); 		// 얇은 복사는 주소를 복사하는 (공유하는) 것 이기에 수정시 둘 다 반영(원본이 바뀜)
		
		// 리스트 복사 : 깊은 복사 1
		ArrayList<String> stu2= new ArrayList<String>(students);
		stu2.set(0,"Kang Min ho");
		System.out.println(stu2);
		
		// 리스트 복사 : 깊은 복사 2
		ArrayList<String> stu3 = new ArrayList<>();
		stu3.addAll(students);	// addAll 
		stu3.set(0, "min ho");
		System.out.println(stu3);
		
		
		System.out.println(students);
		
		// 정렬
		// default 오름차순 숫자 > ABC >abc >가나다 순으로 정렬
		
		Collections.sort(stu3);
		System.out.println(stu3);
		
		// 내림차순 정렬
		Collections.sort(stu3, Comparator.reverseOrder());
		System.out.println(stu3);
		
		ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(10,20,11,190,99,1));
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		// 향상된 for문 앞에 각 요소의 타입
		for (int num :numbers) {
			System.out.print(num);
		}
		
		
		
		
		
		
		
	}

}
