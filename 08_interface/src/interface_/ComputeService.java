package interface_;

import java.util.Scanner;

public class ComputeService  {
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Compute com = null;	//부모를 interface로 잡음 
		int num;
		
		while(true)	{
			System.out.println("***********************");
			System.out.println("\t1. 합");
			System.out.println("\t2. 차");
			System.out.println("\t3. 곱");
			System.out.println("\t4. 몫");
			System.out.println("\t5. 끝내기");
			System.out.println("***********************");
			System.out.print("\t번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break;
			
			if(num == 1) com = new Sum();
			else if(num == 2) com = new Sub();
			else if(num == 3) com = new Mul();
			else if(num == 4) com = new Div();
			
			com.disp();
			
		}//while
	}//menu
}
