package class__;

import java.util.*;
public class StringBufferMain {
	int dan;
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = s.nextInt(); 
	}
	public void output() {
		StringBuffer buffer = new StringBuffer();	// append(), delete()
		
		for(int i=1; i<10; i++) {
			//System.out.println(dan + "*"+i+"="+ dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			System.out.println(buffer.toString());	//StringBuffer -> String 으로 변환 
			buffer.delete(0, buffer.length());
		}//for 
	}
	public static void main(String[] args) {
		StringBufferMain sb = new StringBufferMain();
		sb.input();
		sb.output();
	}
}

/*
[문제] 구구단

원하는 단을 입력 : 5	input()
------------------
5*1=5
5*2=10

5*9=45

*/