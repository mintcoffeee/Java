package basic;

import java.util.Arrays;
import java.util.Random; 

public class MethodTest02 {
	
	public static void main(String[] args) {
		//난수	- 컴퓨터가 불규칙적으로 발생하는 수 
		//		- 0 <= 난수 < 1
		
		double a = Math.random();	// = Random.nextDouble()
		System.out.println("난수 = " + a);
		
		Random r = new Random();	// static 으로 정의되어 있지 않기 때문에, 생성자를 통해 만들어줘야한다.
		double b = r.nextDouble();
		System.out.println("난수 = " + b);
		
		int[] ar = new int[5];	// 배열
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;	
		ar[4] = 15;
		System.out.println(ar[0] + ", " + ar[1] + ", " + ar[1] + ", " + ar[2] + ", " 
				+ ar[3] + ", " + ar[4]);	// 25, 13, 13, 45, 30, 15
		
		// 오름차순 정리, sort
		Arrays.sort(ar);	// return 값이 없다. void
		System.out.println(ar[0] + ", " + ar[1] + ", " + ar[1] + ", " + ar[2] + ", " 
				+ ar[3] + ", " + ar[4]);	// 13, 15, 15, 25, 30, 45

		
		
	}

}
