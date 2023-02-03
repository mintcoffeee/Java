package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값 입력 : ");
		int x = scan.nextInt();
		System.out.print("y값 입력 : ");
		int y = scan.nextInt();
		int mul=1;
		
		for(int i=1; i<=y; i++) {
			mul *= x;
		}//for
		System.out.println(x + "의 " + y + "승은 "+ mul +" 이다.");
		
		
		
	}
}

/*
[문제] 제곱 계산 - x의 y승

x값 입력 : 2 
y값 입력 : 5

2의 5승은 32 이다.
-----------------------
x값 입력 : 3 
y값 입력 : 4

3의 4승은 81 이다.


*/
