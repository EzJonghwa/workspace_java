package ch10_extens_interface.ramen;
			
public class JinRamen extends Ramen{

	public JinRamen(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printRecipe() {
		// TODO Auto-generated method stub
		System.out.println("끓는 물에 면과 스프를 넣고 3분 후에 드세요.");
		System.out.println("물은 550ml (한강라면 스탈은 400ml)");
	}	

}
