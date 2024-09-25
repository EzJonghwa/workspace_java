package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		//movieDB 는 싱들톤 패턴으로 디자인 되어 있어서
		// 외부에서 new 룰 할 수없고 내부에서 생성되어진 하나의 인스턴스만을 사용할 수 있음
		
		MovieDB movieDB1 = MovieDB.getInstance();	// get 인스턴스로 가져올 수만 있음
		MovieDB movieDB2 = MovieDB.getInstance();	// get 인스턴스로 가져올 수만 있음
		System.out.println(movieDB1);	// 주소값으로 출력ch09_class.quiz.MovieDB@64c64813 !!!! 객체의 주소거 같음 (동일한 객체 라는 뜻)
		System.out.println(movieDB2);	// 주소값으로 출력ch09_class.quiz.MovieDB@64c64813
		
		// 영화 맞추기 게임
		//1. 명대사 출력 맞추면 score +3;
		// 틀리면 2. 배우 출력	+2
		// 틀리면 3. 영화명 초성 출력	+1
		// 오답일시 -1
		ArrayList<Movie> movieList = movieDB1.getMovieList();
		//collection shiffle (순서를 랜덤하게 사용)
		Collections.shuffle(movieList);
//		System.out.println(movieList.size());
//		System.out.println(movieList.get(0));
		int score =0;
		
		
//		for(int i =0; i<movieList.size(); i++) {
//		 
//			System.out.println(movieList.get(i).getQuotes());
//			System.out.println(movieList.get(i).getActors());
//			System.out.println(movieList.get(i).getWord());
//			System.out.println(movieList.get(i).getTitle());
//		}
//		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("영화 제목 맞추기");
		
		
		for(int i =0; i<movieList.size(); i++) {
			System.out.println(movieList.get(i).getQuotes());
			System.out.print(">>>");
			String ansQ = scan.nextLine();
			
		if(ansQ.equals(movieList.get(i).getTitle()) ) {
			System.out.println("정답입니다.");
			score +=3;
			System.out.println("점수:"+ score);
		
		}else {
			System.out.println("오답입니다.");
			System.out.println(movieList.get(i).getActors());
			System.out.print(">>>");
			String ansA = scan.nextLine();
			if(ansA.equals(movieList.get(i).getTitle()))
			{
				System.out.println("정답입니다.");
				score +=3;
				System.out.println("점수:"+ score);
			}else {
				System.out.println("오답입니다.");
				System.out.println(movieList.get(i).getWord());
				System.out.print(">>>");
				String ansW = scan.nextLine();
				if(ansW.equals(movieList.get(i).getTitle())) {
					System.out.println("정답입니다.");
					score +=3;
					System.out.println("점수:"+ score);
				}else {
					System.out.println("정답은 " + movieList.get(i).getTitle());
					System.out.println("===================================");
					}
				}
			}
			
		}
			
	}
	}

		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("영화 제목 맞추기");
//		
////		System.out.println(movieList.get(0);
//		
//		for (int i =0; i<movieList.size(); i++) {
//			System.out.println(movieList.get(i).getQuotes());
//				
		
//				String ansW = scan.nextLine();

//				if(movieList.get(i).getTitle() == ansW) {
//					System.out.println("정답입니다");
//					score +=3;
//					System.out.println("점수 :"+ "+"+score);
//				}else {
//					System.out.println("틀렸습니다.");
//					score -=1;
//					System.out.println("점수 :"+ ""+score);
//					System.out.println(movieList.get(i).getActors());
//					
//					
//					if(movieList.get(i).getTitle() == ansW) {
//						System.out.println("정답입니다");
//						score +=2;
//						System.out.println("점수 :"+ "+"+score);
//						
//					}else {
//						System.out.println("틀렸습니다.");
//						score -=1;
//						System.out.println("점수 :"+ ""+score);
//						System.out.println(movieList.get(i).getActors());
//						
//						
//						
//				}
//				}
//		}
//	}
//}
//}

					
					
//				}else if (movieList.get(i).getTitle() != ansW) {
//					System.out.println("틀렸습니다");
//					System.out.println(movieList.get(i).getActors()); 
//					
//					
//					if (movieList.get(i).getTitle() != ansW) {
//						System.out.println("틀렸습니다");
//						System.out.println(movieList.get(i).getWord()); 
//						
//						if (movieList.get(i).getTitle() != ansW) {
//							System.out.println("틀렸습니다");
//							System.out.println(movieList.get(i).getWord()); 
//							
//							if (movieList.get(i).getTitle() == ansW) {
//								System.out.println("정답입니다");
//								score +=1;
//							}
//						}
//					}else{
//						System.out.println("정답입니다");
//						score +=2;
//						
//					}
//					{
//						
//					}
//
//			}
//		}
////		
//
//	}
//
//}
