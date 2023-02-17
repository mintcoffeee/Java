package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		
		try {
			File file = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int)file.length();; // 파일 크기 
			byte[] b = new byte[size];
			
			bis.read(b, 0, size);
			System.out.println(new String(b)); //byte[](기본형) -> String(객체) 으로 변환 
			
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
