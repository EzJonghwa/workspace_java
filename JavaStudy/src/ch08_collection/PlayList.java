package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayList {

	public static void main(String[] args) {

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

		for(String str : playList) {
			System.out.println(str);
		}
		System.out.println(playList);
		
		ArrayList<String> searchList = searchSong("가수", "임영웅", playList);
		System.out.println(searchList);  // 임영웅의 노래만 출력됨.
		System.out.println(searchSong("노래", "사랑", playList));
		
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("탑 100 입니다 , 가수 or 제목 어떤걸로 알려드릴까요? (종료:q)");
			System.out.print(">>>");
			String select =scanner.nextLine();
			if (select.equalsIgnoreCase("q")) {
				System.out.println("탑 100 종료");
				break;
				
			}
			System.out.println("키워드를 입력해 주세요");
			System.out.print(">>>");
			String keyword = scanner.nextLine();
			ArrayList<String> userList = searchSong(select, keyword, playList);
			if (userList.isEmpty()) {
				System.out.println("아쉽지만 검색결과가 없습니다.....");
		}else {
			System.out.println("검색 결과는 총:" + userList.size() + "건");
			
			for(String str:userList) {
				System.out.println(str);
				
			}
			
		}
		
	}

}
		// input :1. 가수 or 노래, 2. 키워드, 3.리스트
		// output :리스트
		// 노래검색 리스트
		// 노래겁색 메서드 생성
		// ex) ArrayList<String> serachList = SearchSong("가수","임영웅", playlist);
		public static ArrayList<String> searchSong(String option,String keyword, ArrayList<String>arr){
			ArrayList<String> result = new ArrayList<>();
			for (int i = 0; i< arr.size(); i++) {
				int no =i +1;
				// 각 요소에서 : 을 기준으로 0:제목 , 1:가수
				String [] temp = arr.get(i).split(":");
				if(option.equals("가수")) {
					// 검색어가 포함이 되어있다면
					if (temp[1].contains(keyword)){
						result.add(no +"."+arr.get(i));
					}
				}
					else if (option.equals("제목")) {
						if (temp[0].contains(keyword)) {
							result.add(no + "."+arr.get(i));
						}
					}
					
				}
			return result;
		}
		
		
	
	
	
	
	
}
