package ch10_extens_interface.family;

/**
 * Class Name	: Parent
 * Author		: 202-2
 * Created Date : 2024. 8. 16.
 * Version		: 1.0
 * Purpose		: 상속
 * Description	: 기본 상속 방법
 */
public class Parent {
	private String name;
	private int age;

	public Parent() {}
	public Parent(String name, int age) {
		//sper()부모 생성자 호출 default 로 object 라는 클래스에서 상속 받음
		// 그래서 toString 을 기본적으로 가지고있음
		// opject 클래스의 기본 생성자를호출하는 것;
		//java 는 
		super();
		this.name = name;
		this.age = age;
		
	}
	// 오버라이딩 부모의 메서드를 재 정의 (override) 해서 사용
	// 즉 부모에게는 toString() 이라는 동일한 이름의 메서드가 있음 하지만 재정의 해서 다르게 사용 할 수있음
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}

	public void sayHello() {
		System.out.println("부모입니다. 소리질러~!!!");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
