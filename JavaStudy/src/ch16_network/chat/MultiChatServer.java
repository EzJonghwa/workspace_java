package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Class Name	: MultiChatServer
 * Author		: 202-2
 * Created Date : 2024. 9. 13.
 * Version		: 1.0
 * Purpose		: 멀티 채팅 서버
 * Description	: 소켓 서버, 쿨라이언트 서버
 */
public class MultiChatServer {
	private ArrayList<Client> clientList = new ArrayList<>();
	
	public static void main(String[] args) {
		MultiChatServer server = new MultiChatServer();
		server.serverStart(); 	// 서버 시작!!!!!!!!!!!!!!!
	}
	
	
	public void serverStart() {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9001);
			System.out.println("9001 포트 서버 오픈");
			while(true) {
				Socket soc = server.accept(); //접속 대기
				System.out.println("요청 수락!");
				System.out.println(soc.getRemoteSocketAddress()); // 점속자 아이피
				Client client = new Client(soc);
				client.start();		// 스레드 시작
				clientList.add(client);		// 해당 서버 참여 접속자
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	//접속 클라이언트에게 메세지를 전해주기 위함. 	
	public class Client extends Thread{
		Socket soc;
		PrintWriter writer;
		String name;
		
		public Client(Socket soc) {
			this.soc =soc;
			try {
				writer = new PrintWriter(soc.getOutputStream());
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 접속 클라이언트에게 모두 메세지 전송
		public void sendAll(String msg) {
			for(int i =0; i<clientList.size(); i++) {
				clientList.get(i).writer.println(msg);
				clientList.get(i).writer.flush();
			}
		}
		@Override
		public void run() {
			// 접속시 다른 사용자들 에게 접속 알림
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				name = reader.readLine(); // 입장시 닉네임을 전달 받음.
				sendAll(name+"님이 입장 하셨습니다.");
				while(true) {
					String msg = reader.readLine();
					if(msg==null|| msg.isEmpty()) {
						break;
					}
					sendAll(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				sendAll(name + "님이 퇴장 하셨습니다");
				clientList.remove(this);
					try {
						if (soc!= null) soc.close();
					} catch (IOException e) {}
			}
		
		}
	}
	
}
