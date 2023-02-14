package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe();	//protected 는 같은 패키지 않에서만 사용 가능 
//		z.elephant();	//default 
//		z.lion();		//private
	}
}
