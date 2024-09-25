package ch13_thread;

public class IsssacMain {

	public static void main(String[] args) throws InterruptedException {
		// 오픈전
		Customer cust1 = new Customer("핑수", 3);
		Customer cust2 = new Customer("등길", 3);
		cust1.start();
		cust2.start();
		Thread.sleep(1000);
		System.out.println("오픈 !!!");
		Chef chef1 = new Chef(5);
		chef1.start();
		
		chef1.endCook = new EndCook() {

			@Override
			public void endOfCook() {
				System.out.println("토스트 완성!!!!!");
				
			}
		
		
		};
		Chef chef2 = new Chef(5);
		chef2.endCook = new EndCook() {
			
			@Override
			public void endOfCook() {
				System.out.println("금방 이구만 토스트 완성!!!!!");
				
			}
		};
		chef2.start();
	}

}
