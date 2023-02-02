package operator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		String name, grade;
		int income1, income2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = sc.next();
		System.out.println("직급 입력 : ");
		grade = sc.next();
		System.out.println("기본급 입력 : ");
		income1 = sc.nextInt();
		System.out.println("수당 입력 : ");
		income2 = sc.nextInt();
		
		double tax_p;
		int sum = income1 + income2;
		
		tax_p =sum >= 5000000 ? 0.03 :
			sum >= 3000000 ? 0.02 : 0.01;
		double tax = (sum * tax_p);
		
		DecimalFormat df = new DecimalFormat();
//		NumberFormat df =  NumberFormat.getInstance();
		String income1_f = df.format(income1);
		String income2_f = df.format(income2);
		String sum_f = df.format(sum);
		String tax_f = df.format(tax);
		String mon_income = df.format(sum - tax);
		
		System.out.println("*** " + name + " " + grade + " 월급 ***");
		System.out.println("기본급 : " + income1_f + "원" );
		System.out.println("수당 : " + income2_f + "원");
		System.out.println("합계 : " + sum_f + "원");
		System.out.println("세금 : " + tax_f + "원");
		System.out.println("월급 : " + mon_income +"원");
		
		
	}
}

/*
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 */

