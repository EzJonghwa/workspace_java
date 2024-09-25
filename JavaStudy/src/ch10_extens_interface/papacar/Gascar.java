package ch10_extens_interface.papacar;
// implements 인터페이스를 구현하겠다 의미
public class Gascar implements Vehicle{
// add an implements
	@Override
	public void start() {
		System.out.println("부릉 부르릉~");
		
	}

	@Override
	public void stop() {
		System.out.println("...탈..탈...탈");
		
	}

}
