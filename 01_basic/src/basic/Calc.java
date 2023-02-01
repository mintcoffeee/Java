package basic;

public class Calc {
	
	public static void main(String[] args) {
		int a, b;
		a = 320;
		b = 258;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / (double)b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
	}
}



//	1줄주석
/*[문제] 320(a), 258(b)를 변수에 저장하여 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
단, 소수이하 2째자리까지 출력하시오

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = x.xx

*/