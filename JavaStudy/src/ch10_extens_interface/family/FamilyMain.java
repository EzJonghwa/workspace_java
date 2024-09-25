package ch10_extens_interface.family;

public class FamilyMain {

	public static void main(String[] args) {
		// 슈퍼클래스 (부모)
		// 서브클래스 (자식) 서브믈래스는 슈퍼클래스의 모든 필드와 메소드를 상속받음.
		Parent papa = new Parent("아부지",65);
		System.out.println(papa.toString());
		papa.sayHello();
		// child 도 Parent의 기능을 상속 받아서 사용이 가능하다. setage..등
		Child baby = new Child();
		baby.setAge(10);
		baby.setName("아기");
		baby.sayHello();
		System.out.println(baby.toString());

	}

}
