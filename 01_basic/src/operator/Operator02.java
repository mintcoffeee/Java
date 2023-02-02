package operator;

import java.util.Scanner;

public class Operator02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수를 입력하시오 : ");
		int num = scan.nextInt();
		// 짝수 찾기 
		String result1 = num % 2 == 0 ? "짝수" : "홀수";	// 2로 나누면 나머지가 0 인가
		System.out.println(result1);
		
		String result2 = num % 2 == 0  && num % 3 == 0 ? "공배수이다" : "공배수 아니다";
		System.out.println(result2);
		
	}
}
