package ch09_class.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentMain {

		public static void main(String[] args) {
			Student pangsu = new Student("펭수",90,80,70);
			Student gildong = new Student("길동",80,70,100);
			System.out.println(pangsu);
			System.out.println(gildong);
			
			// 캡슈화 적용
			// private 필드 는 해당 클래스의 메서드로 사용해서 접근
			System.out.println(pangsu.getEng());
			//수정
			pangsu.setEng(99);
			System.out.println(pangsu);
			// setter를 클래스에서 제작하지 않은 경우 get으로 확인만 가능하고 수정이 불가능하다.
			// class 또한 배열에 담을 수있다.
			// 사용자가 만든 클래스도 객체 제네릭에서는 클랙스객체가 들어감
			ArrayList<Student> myClass = new ArrayList<Student>();
			myClass.add(pangsu);
			myClass.add(gildong);
			myClass.add(new Student("주디",80,80,70));
			myClass.add(new Student("닉",100,100,100));
			for (int i=0; i<myClass.size(); i++) {
				System.out.println(myClass.get(i));
			}
			Collections.sort(myClass, new Comparator<Student>() {
				// return :-1	반환 두 객체의 순서를 바꾸지 않음
				// return : 1 	반환 두 객체의 순서를 바꿈
				// return : 0 	반환 : 유지
				@Override
				public int compare(Student stu1, Student stu2) {
					
					double diff = stu2.getAvg() - stu1.getAvg();
					if (diff >0) {
						return -1;
					}
					return 1;	//차이가 0보다 크면 stu2가 더 크기 떄문에 순서를 바꿈.
				}
			});
			
			System.out.println(myClass);
			
			for (int k =0; k<myClass.size()-1; k++) {
				for (int i =0 ; i< myClass.size()-1; i++) {
										   // i < i+1 내림 //
										   // i > i+1 올름 //
					if (myClass.get(i).getAvg() > myClass.get(i+1).getAvg()) {
						Student temp = myClass.get(i);
						myClass.set(i, myClass.get(i+1));
						myClass.set(i+1, temp);		// 비교해서 위치변경 
					}
				}
			}
			System.out.println("내림차순");
			System.out.println(myClass);
			
			
			
			// 람다 표현식 java 8이상부터 사용가능
			Collections.sort(myClass, (stuA, stuB) -> (stuB.getAvg()-stuA.getAvg() > 0)? (1):(-1));
									    //(매개변수) -> (식);
			
			
			
			
			
			
//			Student stu = new Student("펭수");
//			Student stu2 = new Student("길수");
//			Student stu3 = new Student();
//			
//			//ch09_class.Student@73035e27 <- to String 진행전 주소값으로만 출력됨
//			System.out.println(stu);  // <- to String 진행 후 :Student [name=펭수, kor=0, eng=0, math=0, avg=0.0]
//			stu.nm();
//			stu2.nm();
//			stu3.nm();
//			// 하나의 설계도에 프로퍼티가 있고
//			// 매개변수로 받는것은 독자적인 인스턴스화가 진행됨
//			// 매개변수를 받지 않는 경우가 필요하면
//			// 비어이는 생성자가 존재해야함
			
		}
}
