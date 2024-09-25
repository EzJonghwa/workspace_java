package ch10_extens_interface.starcraft;

public class StarUnit {
	
	// 디폴트로 가질 수있는 것은 부모에 정의 후 자식에서 재사용 가능 
	private String name;
	private int damage;
	private int hp;
	private int armor;
	
	public void move (int x, int y) {
		System.out.println(name + "이(가) x: " + x +", y: " + y +"로 이동") ;
		
	}
	public void attack(StarUnit unit) {
		// 대상 유닛에 해당 유닛의 damage만큼 손상되도록
		unit.setHp(unit.getHp()-damage);
		
	}
	
	// 1. 기본, 필드있는 생성자생성
	// 2. toString 재정의
	// 3. setter/getter 생성
	
	// 비어있는 기본 생성자
	public StarUnit() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 필드를 가진 생성자
	public StarUnit(String name, int damage, int hp, int armor) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.armor = armor;
	}
	@Override
	public String toString() {
		return "StarUnit [name=" + name + ", damage=" + damage + ", hp=" + hp + ", armor=" + armor + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}

	
}
