package ch10_extens_interface.family;

public class Child extends Parent {

	public Child() {
		super();

	}

	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("자식입니다.!!!");
	}

	@Override
	public String toString() {
		return "child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	

}
