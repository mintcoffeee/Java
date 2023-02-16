package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x,y;
	public static void main(String[] args) {
		ExceptionMain2 e = new ExceptionMain2();
		e.input();
		e.output();
	}
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("x 입력 : ");
		x = s.nextInt();
		System.out.print("y 입력 : ");
		y = s.nextInt();
	}
	public void output() {
		if(y >= 0) {
			int mul=1;
			for(int i=0; i<y; i++) {
				mul *= x;
			}
			System.out.println("---------------------");
			System.out.println("2의 10승은 " + mul);
		}else { 
//			System.out.println("y는 0보다 크거나 같아야 한다.");
			
			//개발자가 강제로 Exception 발생 
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

/*
[문제] 제곱 연산
- x의 y승을 처리 한다.
- for 문을 이용하여 처리한다. 

[실행결과]
x 입력 : 2
y 입력 : 10         input()
----------------------------------
2의 10승은 xxx        output()

*/
