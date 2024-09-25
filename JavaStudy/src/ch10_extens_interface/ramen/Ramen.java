package ch10_extens_interface.ramen;

public abstract class Ramen {
	String name;
	int price;
	
	public Ramen(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	// 추상 메소드
	public abstract void printRecipe();		// input,output,name 정의{} <-로직을 만들지 않은 미완성 메소드

}
