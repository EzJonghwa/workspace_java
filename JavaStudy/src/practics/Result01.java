package practics;

import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("국어 점수를 입력해 주세요.");
	System.out.print(">>>");
	int userK = Integer.parseInt(scan.nextLine());
	
	System.out.println("영어 점수를 입력해 주세요.");
	System.out.print(">>>");
	int userE = Integer.parseInt(scan.nextLine());

	System.out.println("수학 점수를 입력해 주세요.");
	System.out.print(">>>");
	int userM = Integer.parseInt(scan.nextLine());
	
	double avg = (userK + userE + userM)/3.0;
	
	String grade = "";
	
	if (avg >=90) {
		grade = "A";
	}else if (avg >=80) {
		grade = "B";
	}else if (avg >=70){
		grade = "C";
	}else {
		grade = "D";
	}
	
	System.out.printf("평균 : %.14f \n등급 : %s 등급", avg , grade);
	}

}
