package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe();	//protected 는 같은 패키지 않에서만 사용 가능 
//		z.elephant();	//default 
//		z.lion();		//private
		System.out.println();
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();
//		z.elephant();	
//		z.lion();	
		
	}
}
