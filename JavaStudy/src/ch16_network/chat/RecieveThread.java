package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieveThread extends Thread{
	private Socket soc;
	
	public RecieveThread(Socket soc) {
		this.soc=soc;
	}

	@Override
	public void run() {
		// 전달 받은 내용을 콘솔에 출력
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTf-8"));
			while(true) {
				String msg = reader.readLine();
				if(msg == null|| msg.equals("")) {
					break;
				}
				System.out.println(msg);
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {if(soc !=null)soc.close();}catch (IOException e) {}
		}
		
		
		
	}
	

}
