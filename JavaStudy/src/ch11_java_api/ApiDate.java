package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class ApiDate {

	public static void main(String[] args) {
	// Date 클래스
	//1970 1월 1일 자정 (UTC ) 이후의 시간을 밀리초 단위로 변환
		Date dateToday = new Date();
		System.out.println(dateToday);
		//Tue Aug 20 09:55:23 KST 2024
		
		//원하는 문자열 format 형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(dateToday));
		//2024년 08월 20일 09시 56분 57초
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(dateToday));
		//2024-08-20
		
		//KST 한국
		// 뉴욕시간
		
		SimpleDateFormat  sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US );
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf3.setTimeZone(timeZone);
		System.out.println(sdf3.format(dateToday));
		//2024/08/19 21:01:33
		
		// 날짜를 문자로 문자를 날짜로 바꾸는 연습하기.
		// String to date
		String str = "2024/08/02 09:00:00";
		//^ 위의 포맷과 아래의 표현식이 같아야함
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 예외 처리리
		try {
			Date start = sdf.parse(str);
			System.out.println(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Calendar 클래스 (year,month, 같은 필드를 제공) 날짜 계산에 유용함
		// 1일뒤
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday.getTime());
		System.out.println(calToday.get(Calendar.DATE));
		System.out.println(calToday.get(Calendar.MONTH)+1);
		System.out.println(calToday.get(Calendar.YEAR));
		System.out.println(calToday.get(Calendar.HOUR_OF_DAY));
		//1일뒤
		calToday.add(Calendar.DATE,1);
		System.out.println(sdf.format(calToday.getTime()));
		//3일뒤
		calToday.add(Calendar.DATE,3);
		System.out.println(sdf.format(calToday.getTime()));
		//5개월 뒤
		calToday.add(Calendar.MONTH,5);
		System.out.println(sdf.format(calToday.getTime()));
		
		Calendar calendars = Calendar.getInstance();
		int year =2024;
		int month =2;
		calendars.set(year, month-1,1);
		System.out.println(sdf.format(calendars.getTime()));
		//해당 월의 마지막 일자 얻기
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// 해당 월의 시작요일
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay); 	//1:일요일 , 2:월요일
		
		
//		Scanner scan = new Scanner(System.in);
//		int sel = Integer.parseInt(scan.nextLine());
				
		System.out.println(year +"년"+month +"월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current =1;
		for (int i =1; i<=42; i++) {
			if (i<startDay) {
				System.out.print("\t");
			}else {
				if (!(i%7 ==1 || i%7 ==0)) {
					System.out.printf("%d\t", current);
				}else {
					System.err.printf("%d\t", current);
				}
				current++;
				if (current>lastDay) {
					break;
				}
			}
			if ( i%7 ==0) {
				System.out.println();
			}
		}
		
		
		
		
		// 년 월을 입력받아 해당 년의 달력을 출력하는 기능을 구현하시오
		
		workingCalendar(2024, 2);
		workingCalendar(2024, 4);
		workingCalendar(2024, 5);
		workingCalendar(2024, 6);
		workingCalendar(2024, 7);
		workingCalendar(2024, 8);
		
	}
	public static void workingCalendar(int y ,int m) {
		Calendar calendars = Calendar.getInstance();
		calendars.set(y, m-1,1);
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		System.out.println(startDay);
		
		System.out.println(y +"년"+m +"월 달력");
		System.out.println("월\t화\t수\t목\t금");
		
		int current =1;
		for (int i =1; i<=35; i++) {
			if (i<startDay) {
				if(i !=1) {
					System.out.print("\t");
				}
				
			}else {
				if (!(i%7 ==1 || i%7 ==0)) {
					System.out.printf("%d\t", current);
				}
				current++;
				if (current>lastDay) {
					break;
				}
			}
			if (i%7 ==0) {
				System.out.println();
			}
		}
	}
	
	
	

}
