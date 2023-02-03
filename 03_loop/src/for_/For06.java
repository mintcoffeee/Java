package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();
		
		int mul=1;
		String count="";
		
		for(int i=1;i<=num;i++) {
			mul *= i;
			count = count + i;
			if(i==num) break;
			count = count +	"*";
		}//for
		
		System.out.println(num + "! = " + mul + " ("+ count +")");
		
	}
}

/*
 * For03과 비

[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
---------------------

숫자 입력 : 5
5! = 120 (1*2*3*4*5)

*/