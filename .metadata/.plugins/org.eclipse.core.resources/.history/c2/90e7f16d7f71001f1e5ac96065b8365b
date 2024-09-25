package practice.cafe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Cafe starBucks = new Cafe("스타벅스", "starbuks");
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("카푸치노", 6000));
		starBucks.addCoffee(new Coffee("오곡라떼", 7000));
		
		Cafe aKa = new Cafe("아카", "Aka");
		aKa.addCoffee(new Coffee("아메리카노", 2800));
		aKa.addCoffee(new Coffee("바닐라라떼", 3000));
		aKa.addCoffee(new Coffee("아이스티", 3500));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("행동을 선택해주세요 ^^");
			System.out.println("1.스타벅스 방문 | 2.아카 방문 | 3.사무실 복귀...");
			System.out.print(">>> ");
			int select = Integer.parseInt(scanner.nextLine());
			if(select == 1) {
				System.out.println("어서오세요 ^^ 스타벅스입니다.");
				starBucks.ShowMenu();
				starBucks.buyCoffee(scanner);
			}else if(select == 2) {
				System.out.println("어서오세요 ^^ 아카입니다.");
				aKa.ShowMenu();
				aKa.buyCoffee(scanner);
			}else {
				System.out.println("사무실로 복귀합니다...");
				break;
			}
		}
		
	}

}
