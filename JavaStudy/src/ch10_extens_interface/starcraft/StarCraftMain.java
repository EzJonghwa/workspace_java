package ch10_extens_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		Marine marine01 = new Marine();
		Marine marine02 = new Marine("영웅 마린",8,100,0);
		System.out.println(marine01);
		System.out.println(marine02);
		
		marine02.move(100, 200);
		marine02.stimpack();
		System.out.println(marine02);
		
		Zealot zealot01 = new Zealot();
		zealot01.attack(marine01);
		// attack(StarUnit unit)이라는 동일한 부모를 가지고 있어서 공통으로 동일하게 사용가능 
		
		
		System.out.println(marine01);
		
		// 디형성(Polymorphism)
		// 오버라이딩, 오버로딩,업캐스팅,다운캐스팅
		// 하나의 객체가 여러 타입을 가질 수있음
		// 자식 객체에서 부모 객체로 형 변환이 가능.
		
		StarUnit highTemplar01 = new HighTemplar();
		HighTemplar highTemplar02 = new HighTemplar();
		StarUnit highTemplar03 = highTemplar02;	// 자식에사 부모 객체로 형변환은 자동으로됨. = 업 캐스팅 (상위로 갈때는 자동 / 다운은 자동 x)
		
		System.out.println(highTemplar01);
		System.out.println(highTemplar02);
		System.out.println(highTemplar03);
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		starList.add(marine01);
		starList.add(zealot01);
		starList.add(highTemplar01);
		System.out.println(starList);
		
		for (int i =0; i<starList.size(); i++) {
			starList.get(i).move(100,150);
		}
//		highTemplar01.ttunderStorm();	타입이 부모 타입이기 때무에 부모가 가지고 있지 않은 메서드는 사용 불가.	//StarUnit으로 선언
		highTemplar02.ttunderStrom();	//HighTemplar 로 선언
		// 다운캐스팅
		((HighTemplar) highTemplar01).ttunderStrom(); 	// 부모 ->자식 으로 형 변환 후 사용 가능
		
		StarUnit scv = new StarUnit("SCV",5,60,0);
		// 형변환 가능 체크 (true/false) 부모 객체는 자식 객체로 형 변환 할 수 없음.
		System.out.println(scv instanceof Zealot);	//false 불가능 부모 to 자식 불가능
		
		// 부모 객체로 형 변환 되었던 자식 객체는 자식 타임으로 다시 형 변환 가능.
		StarUnit m =marine01;
		System.out.println(m instanceof Marine);	// true 가능
		
		
	}

}
