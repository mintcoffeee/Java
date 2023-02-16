package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
//			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			
			//나눠서 사용 가능 1. fos > 2. dos
			//위에가 편함 
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
	}
}
