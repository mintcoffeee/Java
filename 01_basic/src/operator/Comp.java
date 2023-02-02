package operator;

public class Comp {

	public static void main(String[] args) {
//		char ch = 'B';
		char ch = 'e';
//		System.out.println((int)'Z');	// 90
		
		int result = ch >= 65 && ch <= 90 ? ch + 32 : ch - 32;
//		System.out.println(ch >= 65 && ch <= 90 ? (char)(ch + 32) : (char)(ch - 32));
//		System.out.println(ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : (char)(ch - 32)););
		System.out.println(ch + " -> " + (char)result);
		
	}
}

/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b		e -> E

 */ 
