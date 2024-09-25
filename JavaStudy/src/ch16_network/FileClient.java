package ch16_network;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileClient {

	public static void main(String[] args) {
		String host = "localhost";
		int port =5000;
		String filePath = "C:/tools/pycharm-community-2024.2.1.exe";
		
		try {
			Socket socket = new Socket(host,port);
			System.out.println("서버에 연결됨.");
			// 파일 전송을 위한 출력 스트림
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			FileInputStream fis = new FileInputStream(filePath);
			File file = new File(filePath);
			
			// 파일 이름과 크기 전송
			dos.writeUTF(file.getName());
			dos.writeLong(file.length());
			
			byte [] buffer = new byte[4096];
			int read;
			while((read = fis.read(buffer))>0) {
				dos.write(buffer,0,read);
			}
			System.out.println("파일 전송 완료" +filePath);
			fis.close();
			dos.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();


	}
}
