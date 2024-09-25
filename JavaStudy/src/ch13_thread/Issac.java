package ch13_thread;

import java.util.LinkedList;
import java.util.Queue;

public class Issac {
	private int toast =0;
	private final Queue<String> orderList = new LinkedList<>();		// LinkedList : 노드구조로 되어있어 순차적으로 순행 == first in first out 구조임

	// 싱글톤 적용
	private static Issac instance = new Issac();
	public static Issac getInstance() {
		return instance;
	}
	// 토스트 만들기 (chef 클래스가 사용)
	// 멀티 스레딩 환경에서 여러 스레드가 동시에 같은 객체나 메서드 블로에 접근하는
	// 것을 방지하기 위햇 synchronized (동기화 유지 시켜줘야함)
	
	public synchronized void makeToast() {
		toast +=1;
		System.out.println("토스트 1개를 만들었습니다. 재고:" + toast);
		notifyAll();	//대기중(wait)인 모든 스레드를 꺠운다
	}
	
	
	// 토스트 구매 (customer 클래스가 사용)
	public synchronized void buyToast(String name , int count) {
		orderList.add(name);
		while(orderList.peek() != name || toast <count) {
		try {
			wait();		//현재 주문이  맨앞이 아니거나 토스트가 충분하지 않으면 대기
		}catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		toast -= count;
		System.out.println(name +"에게 토스트를 " +count +"개 팔았습니다.");
		orderList.remove();	// 처리된 주문 제거 (큐 구조애서 처음께 삭재됨).
		notifyAll(); 	// 다음 대기중이누 주문 처리를위해 모든스래드 적용.

	

	
	}
}
