package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{

	private Socket soc;
	private String name;
	
	public SendThread(Socket soc, String name) {
		super();
		this.soc = soc;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer;
		try {
			writer = new PrintWriter(soc.getOutputStream());
			// 닉네임 전송
			
			writer.println(name);
			writer.flush();
			while(true) {
			System.out.println("입력:");
			String msg = reader.readLine();
			if(msg == null || msg.equals("")) {
				break;
			}
			writer.println(name+":"+msg);
			writer.flush();
		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (soc !=null) soc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
