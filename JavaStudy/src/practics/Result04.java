package practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Result04 {

	public static void main(String[] args) {
		makeLotto();
	}
	
	public static void makeLotto() {
		
		HashSet<Integer> hsLotto= new HashSet<Integer>();
		
		for(int i=0; i<=5; i++) {
			int mk = (int)(Math.random()*45)+1;
			hsLotto.add(mk);	
		}
		ArrayList<Integer> weekLotto = new ArrayList<Integer>(hsLotto);
		
		Collections.sort(weekLotto);
		System.out.println(weekLotto);	
		
	}
}
