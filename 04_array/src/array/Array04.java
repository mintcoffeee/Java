package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean [] ar = new boolean[5];
		
		while(true) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("************************");
			System.out.println("\t1. 입차");
			System.out.println("\t2. 출차");
			System.out.println("\t3. 리스트");
			System.out.println("\t4. 종료");
			System.out.println("************************");
			System.out.print("\t번호 입력 : ");
			int num = scan.nextInt();
			int position;
			
			if(num == 4) break;	// while문 무조건 break 먼저 작
			
			if(num == 1) {
				System.out.print("위치 입력 : ");
				position = scan.nextInt();
				if(ar[position-1]) {	
					// ar[position-1] == true 이렇게 표기하지 않는다.
					// ar[position-1] 이 값 자체만으로 true, false값이다.
					
					System.out.println("이미 주차되어있습니다\n");
				}else {
					ar[position-1] = true;
					System.out.println(position + "위치에 입차\n");
				}
				
			}else if(num == 2) {
				System.out.print("위치 입력 : ");
				position = scan.nextInt();
				
				if(ar[position-1]) {
					ar[position-1] = false;
					System.out.println(position + "위치에 출차\n");
				}else {
					System.out.println("주차되어 있지않습니다\n");	
				}
				
			}else if(num == 3) {
				for(int i=0; i<5; i++) {
					System.out.println((i+1) + "위치 : " + ar[i]);
				}
				System.out.println();
			}
			
		}//while
	}
}

/*
[문제] 주차관리 프로그램

[실행결과]
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 
  
1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false  
*/