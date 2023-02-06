package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int com = (int) (Math.random() * 100 + 1);
			System.out.println(com);
			int count = 0;
			System.out.println("1 ~ 100 사이의 숫자를 맞추세요");
			System.out.println();
			while (true) {
				System.out.print("숫자 입력 : ");
				int user = scan.nextInt();
				count++;
				if (com == user) {
					break;
				}

				if (user > com) 
					System.out.println(user + "보다 작은 숫자입니다.");
				else if (user < com) 
					System.out.println(user + "보다 큰 숫자입니다.");
				
			} //while
			System.out.println("\n딩동뎅..." + count + "번만에 맞추셨습니다.");
			
			System.out.println("\n 한번 더 (y/n) : ");
//			int yn = scan.nextInt(); // y or n 
			String yn = scan.next();
			
//			if(yn == 'n' || yn == 'N') break; // yn 을 int 형으로 입력 받았을 
			if(yn.equals("n") || yn.equals("N")) break;
			// yn == "n" 은 절대 break 할 수 없다. 문자열의 주소를 가리키기 때문
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}


/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (70)

숫자 입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.

~~~

숫자 입력 : 70
딩동뎅...x번만에 맞추셨습니다.

// 시간 될때 해보기, y, n 이외의 값을 입력하면 "한번 더 "문장이 다시 나오기
한번 더 (y/n) : w
한번 더 (y/n) : b
한번 더 (y/n) : n
프로그램을 종료합니다.
*/



