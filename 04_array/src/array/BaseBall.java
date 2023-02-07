package array;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		//난수 생성
		for(int i=0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9+1);
			
			//중복제거
			for(int j=0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}//for i
//		for(int i=0; i<3; i++) {
//			System.out.print(com[i]+"  ");
//		}
		System.out.println();
		
		//게임 실행 
		outerloop :
		while(true) {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			String game = scan.next();
			
			if(game.equalsIgnoreCase("N")) break;
			if(!game.equalsIgnoreCase("Y")) continue;
			
			System.out.println();
			System.out.println("게임을 시작합니다.\n");
		
			while(true) {	
				//숫자입력 
				System.out.print("숫자 입력 : ");
				String comand = scan.next();
				
				for(int i=0; i<user.length; i++) {
					user[i] = (comand.charAt(i)-'0');
				}//for i
				
				//스트라이크, 볼 카운
				int strikeCount=0, ballCount=0;
				for(int j=0; j<user.length; j++) {
					if(user[j]==com[j]) {
						strikeCount++;
					}else {
						for(int k=0;k<user.length; k++) {
							if(user[j]==com[k]) {
								ballCount++;
								k++;
							}
						}//for k
					}
				}//for j
				
				//출력 
				System.out.println(strikeCount+"스트라이크" + ballCount + "볼");
				System.out.println();
				
				if(strikeCount == 3) {
					System.out.println("프로그램을 종료합니다.");
					break outerloop;
				}//if
			}//while
		}//while - outer		
	}
}


/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/