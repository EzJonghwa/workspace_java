package ch15_inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBasic {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		// 현재 경로
		System.out.println(path);
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader(path + "/delay.txt");
			writer = new FileWriter(path + "/delay_backup.txt");
			char [] data = new char[16]; // 한번에 16개 문자를 읽겠다!
			while(true) {
				int x = reader.read(data);
				if(x == -1) {
					System.out.println("파일에 끝에 도달함.");
					break;
				}
				writer.write(data,0,x);
				
			}
			writer.flush(); // 남아있는게 없도록 비움.
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
