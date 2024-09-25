package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionEx {

	public static void main(String[] args) {
		//1.top 100 가수 리스트를 오름차순으로 정렬하여 1줄에 5명씩 출력
		//------ top100 ArrayList의 가수 이름이 중복되지 않게 
		//	ex) input arrayList, output arrayList
		//		배열을 전달 받아 가수이름으로 set 에 담고
		// 		죽복되지 않은 가수 arraylist 를 리턴
		
		//2. 가수 이름 입력시 해당 가수를 노래로 출력
		// 메서드 2개 만들기 1. 유니크하게 정렬 2. 입력받아 출력하는 메서드
		//----- 순서정보 or 가수명을 입력받아 해당 가수의 노래 출력
		ArrayList<String> playList = new ArrayList<>(Arrays.asList("Supernova:aespa", "클락션 (Klaxon):(여자)아이들",
				"How Sweet:NewJeans", "Sticky:KISS OF LIFE", "Small girl (feat. 도경수(D.O.)):이영지",
				"Supernatural:NewJeans", "소나기:이클립스 (ECLIPSE)", "고민중독:QWER", "한 페이지가 될 수 있게:DAY6 (데이식스)",
				"Bubble Gum:NewJeans", "나는 아픈 건 딱 질색이니까:(여자)아이들", "Magnetic:아일릿(ILLIT)", "Armageddon:aespa",
				"첫 만남은 계획대로 되지 않아:TWS (투어스)", "Welcome to the Show:DAY6 (데이식스)", "해야 (HEYA):IVE (아이브)", "사랑은 늘 도망가:임영웅",
				"SPOT! (feat. JENNIE):지코 (ZICO)", "예뻤어:DAY6 (데이식스)", "천상연:이창섭", "온기:임영웅", "우리들의 블루스:임영웅", "Home:임영웅",
				"모래 알갱이:임영웅", "다시 만날 수 있을까:임영웅", "에피소드:이무진", "이제 나만 믿어요:임영웅", "미안해 미워해 사랑해:Crush", "Hype Boy:NewJeans",
				"Boom Boom Bass:RIIZE", "Do or Die:임영웅", "슬픈 초대장:순순희(지환)", "무지개:임영웅", "London Boy:임영웅", "Polaroid:임영웅",
				"인생찬가:임영웅", "Seven (feat. Latto) - Clean Ver.:정국", "Love wins all:아이유", "내가 S면 넌 나의 N이 되어줘:TWS (투어스)",
				"WAY 4 LUV:PLAVE", "비의 랩소디:임재현", "I AM:IVE (아이브)", "연애편지:임영웅",
				"그대만 있다면 (여름날 우리 X 너드커넥션 (Nerd Connection)):너드커넥션 (Nerd Connection)", "ETA:NewJeans",
				"Super Shy:NewJeans", "To. X:태연 (TAEYEON)", "Attention:NewJeans", "우리 영화:PLAVE", "오래된 노래:허각",
				"보금자리:임영웅", "헤어지자 말해요:박재정", "밤양갱:비비 (BIBI)", "Drama:aespa", "Ditto:NewJeans", "From:PLAVE",
				"Dynamite:방탄소년단", "Watch Me Woo!:PLAVE", "SHEESH:BABYMONSTER", "Spicy:aespa",
				"Girls Never Die:tripleS (트리플에스)", "너의 모든 순간:성시경", "주저하는 연인들을 위해:잔나비", "버추얼 아이돌:PLAVE",
				"청혼하지 않을 이유를 못 찾았어:이무진", "인사:범진", "퀸카 (Queencard):(여자)아이들", "LOVE DIVE:IVE (아이브)", "사랑인가 봐:멜로망스",
				"Accendio:IVE (아이브)", "Love 119:RIIZE", "파이팅 해야지 (Feat. 이영지):부석순 (SEVENTEEN)", "사건의 지평선:윤하 (YOUNHA)",
				"Get A Guitar:RIIZE", "OMG:NewJeans", "Perfect Night:LE SSERAFIM (르세라핌)", "봄날:방탄소년단",
				"사막에서 꽃을 피우듯:우디 (Woody)", "삐그덕 (Walk):NCT 127", "그랬나봐:유회승 (엔플라잉)", "Cosmic:Red Velvet (레드벨벳)",
				"모든 날, 모든 순간 (Every day, Every Moment):폴킴", "Love Lee:AKMU (악뮤)", "꿈:태연 (TAEYEON)",
				"다정히 내 이름을 부르면:경서예지", "MANIAC:VIVIZ (비비지)", "어떻게 이별까지 사랑하겠어, 널 사랑하는 거지:AKMU (악뮤)",
				"I Don't Think That I Like Her:Charlie Puth", "Midas Touch:KISS OF LIFE", "취중고백:김민석",
				"네가 내 마음에 자리 잡았다 (Into You):엔플라잉 (N.Flying)", "MAESTRO:세븐틴 (SEVENTEEN)", "봄눈:10CM", "Impossible:RIIZE",
				"Lucky Girl Syndrome:아일릿(ILLIT)", "Right Now:NewJeans", "EASY:LE SSERAFIM (르세라핌)", "Who:지민",
				"내가 그댈:하동균", "Siren:RIIZE"));
//		ArrayList<String> arrayList = new ArrayList<>();
//		for(String temp : playList){
//			arrayList.add(temp);
		System.out.println(singerSet(playList));
		ArrayList<String> list = singerSet(playList);
		Collections.sort(list);	// 오름차순
		System.out.println("\n--top 100 가수리스트 -------------------------------------------");
		for (int i=0; i<list.size(); i++) {
			if (i %4 ==0) {
				System.out.println();		// 5칸씩 띄기 위해 size 를5로 나눈나머지 값을 비교
			}
			if (i == list.size() -1) {
				System.out.print((i + 1) + "."+list.get(i));
			}else
			{
				System.out.print((i + 1) + "."+list.get(i)+",");
			}
			
		}
		
		Scanner scan = new Scanner (System.in);
		while(true) {
			System.out.println("\n\n가수 이름을 입력하세요(종료:q) >>>");
			String select = scan.nextLine();
			
			if (select.equals("q")) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			ArrayList<String> userList = PlayList.searchSong("가수", select, playList);
				
			if(userList.isEmpty()) {
			System.out.println("아쉽지만 검색 결과가 없습니다.....");
			}
			else {
				System.out.println("검색 결과는 총 :" + userList.size() + "건");
				for(String str:userList) {
					System.out.println(str);
				}
			}
			
		}

}	
	public static ArrayList<String> singerSet(ArrayList<String> arr){
		
			HashSet<String> result = new HashSet<>();
			for (int i = 0; i< arr.size(); i++){
				String[] temp = arr.get(i).split(":");
				result.add(temp[1]);
		}
			ArrayList<String> list = new ArrayList<String>();
			for (String str : result) {
				list.add(str);
			}
		return list;
	
	}
}

