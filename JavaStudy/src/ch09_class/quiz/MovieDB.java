package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
		private ArrayList<Movie> movieList = new ArrayList<Movie>();
		// 싱글톤 패턴
		// 인스턴스 1개만 만들게하는 방법 (최초에 한번만 메모리에 할당)
		// 메모 리 낭비를 방지 할 수있으며, 단 하나의 잭체로 존재해도 클래스에 적용.
		private MovieDB() {												//!!!! 1. 기본으로 프라이빗으로 
			movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
			movieList.add(new Movie("기생충", "넌 게획이 다 있구나", "송강호", "ㄱㅅㅊ"));
			
		}
		// 인스턴스 생성을 해당 클래스에서 하기 떄문에(private) 외부에서 인스턴스를 못만듦
		private static MovieDB instance =new MovieDB();					//!!!! 2.내부에서 new 인스턴스 생성-- 외부에서는 제작 불가
		// 외부에서 접근		
		public static MovieDB getInstance() {						//!!!! 3.외부에서는 static 이기에 new 없이 사용만 할 수있다.
			return instance;
		}
		public ArrayList<Movie> getMovieList() {
			return movieList;
		}
}
