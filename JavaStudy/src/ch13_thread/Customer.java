package ch13_thread;

public class Customer extends Thread{
	private Issac issac = Issac.getInstance();
	private String name;
	private int count;
	
	public Customer(String name, int count) {
		this.name = name;
		this.count=count;
		
	}

	@Override
	public void run() {
		super.run();
	}

}
