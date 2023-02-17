package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
			int data;
			while((data = bis.read()) != -1) {	//마지막에 더이상 읽어 올게 없을 때 -1, 객체는 null 
//				System.out.print(data);	//1310 : Enter
				//13 : \n 다음 줄 
				//10 : \r 맨 앞으로 
				System.out.print(data);	
			}
			System.out.println();
		
	}
}
