package class_;

import java.util.Scanner;

public class ComputeMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compute[] compute;
		String[] shape = {"X","Y","SUM","SUB","MUL","DIV"};
		
		System.out.print("횟수 입력 : ");
		int num = scan.nextInt();
		compute = new Compute[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("["+(i+1)+"]번째");
			System.out.print("x 입력 : ");
			int x = scan.nextInt();
			System.out.print("y 입력 : ");
			int y = scan.nextInt();
			System.out.println();
			
			//클래스 생성 
			compute[i] = new Compute();
			compute[i].setData(x,y);
			compute[i].calc();
		}//for i
		for(String data : shape) {
			System.out.print(data + "\t");
		}
		System.out.println();
//		for(int j=0; j<num; j++) {
//			System.out.println(compute[j].getX() + "\t"
//								+compute[j].getY() + "\t"
//								+compute[j].getSum() + "\t"
//								+compute[j].getSub() + "\t"
//								+compute[j].getMul() + "\t"
//								+compute[j].getDiv());
//		}
		for(Compute data : compute) {
			System.out.println(data.getX() + "\t"
								+data.getY() + "\t"
								+data.getSum() + "\t"
								+data.getSub() + "\t"
								+data.getMul() + "\t"
								+data.getDiv());
		}
	}

}

/*
[문제] 사칙연산
x, y를 입력하여 합, 차, 곱, 몫을 구하시오

클래스명 : Compute (1인분)
필드 : x, y, sum, sub, mul, div
메소드 : setData(x의 값, y의 값)
        calc()
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
클래스명 : ComputeMain        

[실행결과]
횟수 입력 : 2

[1번째]
x 입력 : 25
y 입력 : 36

[2번째]
x 입력 : 35
y 입력 : 12

x   y   sum      sub      mul      div
25   36
35   12
*/