package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Class Name	: Delay
 * Author		: 202-2
 * Created Date : 2024. 9. 13.
 * Version		: 1.0
 * Purpose		: 텍스트 파일생성!
 * Description	: 
 */
public class Delay {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 날자 포맷
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	String currentDate = sdf.format(new Date());
	String filePath ="delay.txt";
	// 현재위치를 기준 workspace
	File file = new File(filePath);
	
	try {
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write((currentDate+"오늘의 지각자...\n").getBytes());
		while(true) {
			System.out.println("오늘의 지각자를 기록하세요. exit 을 입력하면 종료됨.");
			String msg = sc.nextLine();
			if ("exit".equalsIgnoreCase(msg)) {
				System.out.println("종료합니다");
				break;
			}
			fos.write((msg +"\n").getBytes());
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		sc.close();
	}

	}

}
