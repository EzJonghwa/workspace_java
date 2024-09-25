package ch13_thread;

public class ExRunnable implements Runnable{
	int num;
	String name;

	public ExRunnable(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i =num; i<=num+5; i++) {
			// 현재 실행중인  Thread 이름 출력
			System.out.println(name + " " +i);
			// 시간차를 두기 위햐
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
