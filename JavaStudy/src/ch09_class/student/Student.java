package ch09_class.student;

import ch09_class.common.utilClass;

/**
 * Class Name	: Student
 * Author		: 202-2
 * Created Date : 2024. 8. 13.
 * Version		: 1.0
 * Purpose		: java class
 * Description	: 
 */
public class Student {
		
	// 1. 필드, 속성값 
	// public : 공개, 프로젝트 어디서든 접근가능
	// private :비공개 , 현재 클래스 안에서만 접근
	// default : 같은 폴더 내에 있는 클래스에서 접근가능
	// 캡슐화는 필드 변수 접근 제어자를 전부 private 로 이동
	
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	// 외부에서 변경및 수정이 불 가능 하게 하기위해
	// get / set 을사용한 메서드로 접근가능  
	
	//2. 생성자 (class 는 생성자를 정의하지 않아도 무조건 클래스 명의 생성자가 있음.)
	// public Student() {}		// 디폴트로 존재하지만 프로퍼티가 있으면 무조건 만들어 줘야함
	// 1> super class = 디폴트 생성자
	public Student() {
		super();	// 존재하지 않아도 상관이 없음;
		// TODO Auto-generated constructor stub
	}
	
	// 2> using field 매개변수가 존재하는 생성자
	// 생성자 오버로딩
	// 객체를 다양하게 인스턴스 화 한다면 다양하게 만들 수 있음
	
	public Student(String name, int kor, int eng, int math) {
		super();	// 존재하지 않아도 상관이 없음;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	// 3. to String ? : 
	//오버 라이딩 (부모가 가진것을 재 정의해서 사용)에서 만들 수 있음
	// 부모의 기능을 재 정의 하여 사용하느 기능
	// object 클래스 메서드 중 to String 이 존재함 그 곳에서 가져다가 쓰는것
	// ArrayList 에는 기본으로 존재함
	@Override // @Override 이노테이션은 컴파일러에게 이 메서드가 부모 클래스의 메서드를 오버라이딩 하고 있음을 명시적으로 일
	public String toString() {
		return "학생객체 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	
	}
	
	public void nm() {
		System.out.println(name + "입니다.");
	}
	//4. getter setter 추가
	// 프라이빗 에 접근하기위한것
	// 필요에 의해 만들면 됨
	// 추후에 dB와 매핑하기에 보통 만들게됨
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}

	private void setAvg() {
		//this.avg 랑 동일함// this.avg / this.kor...==
		avg = utilClass.weRound((kor + eng + math)/3.0,1);
		//private : 외부에서 접근할 수없음 .
	}
	


	// 단축키 shift + alt +s
	// ex) 학사 정보 
	public Student (String nm) {
		this.name = nm; 	// this 는 객체 자신을 의미함 (this)는 인스턴스화를 진행한 객체자신
	}// 인스턴스화 진행시 매개변수를 넣어야지 진행됨
	
	
	
	


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
