package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiiJson {

	public static void main(String[] args) throws IOException, ParseException {
		// upbit rest api 코인 종목 코드를 제공함. json 데이터 형태로
		// json Javascript Object Notation	== 택스트(문자열) 데이터 형태로 응답과 요청
		// 문자열 -> 자바스크립트 객체 형태로 파싱을 해서 이용 
		// 데이터를 저장하고 교환하는데 사용되는 경량 데이터 형식! 속성 - 값 쌍으로 이루어져 있음.
		String allUrl = "https://api.upbit.com/v1/market/all";
		// URL 클래스 특정 프로토콜(http https ftp등) 으로 웹브라우저가 웹 페이지에 전급하는 것 처럼
		// 인터넷에 있는 자원에  접근할 수있도록 많은 기능을 제공하는 서비스
		URL url = new URL(allUrl);	//  인터넷 요청은 오류가 일어날 수있기 때문에  예외처리를 해줘야함 (12장)
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 요청방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000);
		conn.setDoOutput(true);
		int resCode = conn.getResponseCode();
		if (resCode == HttpsURLConnection.HTTP_OK) {
//			System.out.println(resCode);
			
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in =
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			// 내용이 없을 때 까지 버퍼에 담기
			while ((inputLine = in.readLine()) !=null) {
				response.append(inputLine);
			}
			in.close();

			// 데이터 파싱
			JSONParser parser = new JSONParser();
			
			JSONArray jsonArray = (JSONArray) parser.parse(response.toString());
			for (Object object:jsonArray) {
				JSONObject obj = (JSONObject) object;
				System.out.print("market:" + obj.get("market")+" ");
				System.out.print("en:" + obj.get("english_name")+" ");
				System.out.print("kr:" + obj.get("korean_name")+" ");
				System.out.println();
			} 
			Scanner scan = new Scanner(System.in);
			while(true) {
			System.out.println("어떤 종목을 보여드릴까요:?(end :q)");
			String nm = scan.nextLine();
			
			if (nm.equals("q")) {
				System.out.println("종료합니다");
				break;
			}else {
			JSONObject resultObj = getCoin(nm);
			System.out.println(resultObj.get("trade_date"));
			// 9.1413E7 E 에 오는 숫자는 10의 지수를 나타냄
			// 8.1413*10^7 = 81413000
			DecimalFormat format = new DecimalFormat("0,000");
			DecimalFormat decFormat = new DecimalFormat("#");	// # 숫자를 출력하되 정수 부분만 출력
			decFormat.setMaximumFractionDigits(0); 	/// 소수점 이하 자릿수를 0으로
			System.out.println("trade_price: "+decFormat.format(resultObj.get("trade_price"))+"원");
			System.out.println();
			}
		}
		scan.close();
		}
	}
	
	
	public static JSONObject getCoin(String code) throws IOException, ParseException{
		JSONObject obj = null;
		
		// 특정 코인의 시세 조회
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=" +code;
		URL url = new URL(detailUrl);	//  인터넷 요청은 오류가 일어날 수있기 때문에  예외처리를 해줘야함 (12장)
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 요청방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000);
		conn.setDoOutput(true);
		int resCode = conn.getResponseCode();	// 응답에 따른 요청 코드 리턴 200 정상
		if (resCode == HttpsURLConnection.HTTP_OK) {
//			System.out.println(resCode);
			
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in =
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			// 내용이 없을 때 까지 버퍼에 담기
			while ((inputLine = in.readLine()) !=null) {
				response.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray) parser.parse(response.toString());
			obj = (JSONObject) arr.get(0);
			}
		return obj;
		
	}

}
