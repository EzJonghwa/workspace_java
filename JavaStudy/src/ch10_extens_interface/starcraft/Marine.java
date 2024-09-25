package ch10_extens_interface.starcraft;

public class Marine extends StarUnit{
	
	// 디폴트 값을 설정 new Marine 생성시 생성
	public Marine() {
		this("마린",6,50,0);
	}
	
	// 다른 이름의 마린 생성시 부모의 것 사용
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
		// TODO Auto-generated constructor stub
	}
	public void stimpack() {
		System.out.println("우아아아!!!");
		super.setHp(super.getHp() -10);
		super.setDamage(super.getDamage() * 2);
	}

	@Override
	public String toString() {
		return "Marine [getName()=" + getName() + ", getDamage()=" + getDamage()
				+ ", getHp()=" + getHp() + ", getArmor()=" + getArmor() + "]";

	}
	

}
