package ch16_network;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Class Name	: FileServer
 * Author		: 202-2
 * Created Date : 2024. 9. 13.
 * Version		: 1.0
 * Purpose		: socket 통신
 * Description	: 파일을 받는 서버
 */
public class FileServer {

	public static void main(String[] args) {
		int port =5000;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("서버가 포트 : "+ port +"에서 실행중...");
			
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 연결됨.");
			
			// 파일 수신\
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String fileName = dis.readUTF();
			long filesize = dis.readLong();
			
			FileOutputStream fos = new FileOutputStream(fileName);
			byte[] buffer = new byte[4096];  // 숫자 크기는 보내는쪽과 동일 하면 됨.
			int read =0;
			long totalRead =0;
			int remaining =(int) filesize;
			while((read = dis.read(buffer,0,Math.min(buffer.length, remaining)))>0) {
				totalRead +=read;
				remaining -=read;
				System.out.println("파일 수신 중:" +totalRead + "바이트("+(totalRead *100/filesize)+"%)");
				fos.write(buffer,0,read);
			}
			System.out.println("파일 수신 완료 :" + fileName);
			fos.close();
			dis.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
