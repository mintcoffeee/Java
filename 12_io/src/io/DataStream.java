package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			
			//나눠서 사용 가능 1. fos > 2. dos
			//위에가 편함 
//			FileOutputStream fos = new FileOutputStream("result.txt");
//			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close();
			
			//파일 읽기
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
			System.out.println("키  = " + height);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
	}
}
