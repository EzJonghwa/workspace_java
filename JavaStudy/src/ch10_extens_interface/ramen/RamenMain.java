package ch10_extens_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
//		Ramen name = new Ramen("진라면 기본",1000)		// 추상 클래스는 객체로 만들 수없음
		JinRamen jin  = new JinRamen("진라면 기본", 1000);
		jin.printRecipe();
		
		JjaPpagheti jja = new JjaPpagheti("짜파게티", 1200);
		jja.printRecipe();
		
		// 추상클래스를 상속받는 클래스는 모두 구현함 
		// 라면이라는 클래스를 상속받았으니 당연하게 사용 가능한 메서드 printRecipe
		// 틀을 만들어 공통으로 작업하기 위해 미리 정의하는 활동임
	
		
	}

}
