package for_;

import java.util.Scanner; 

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab;
		int count = 0;
//		a, b = 10 ~ 99 사이의 난수 발생 
		for(int i=1; i<6; i++) {
			a = (int)(Math.random() * 90 + 10);	//10 ~ 99
			b = (int)(Math.random() * 90 + 10);
			
			for(int j=0; j<2;j++) {	// 틀리면 기회를 1번더
				System.out.print("[" + i + "] " + a + " + "+ b + " = ");
				dab = scan.nextInt();
				
				if(dab == (a+b)) {
					System.out.println("참 잘했어요");
					count++;
					break;
				}else {
					if(j==0)
						System.out.println("틀렸다.");	
					else 
						System.out.println("틀렸다...정답은 " + (a + b));
				}
			}//for(j)
			
		}//for
		System.out.println("\n당신은 총 	" + count + "문제를 맞추어서 "
				+ "\n점수 : " + (count * 20) + "점 입니다.");
	}
}

/*
[문제] 덧셈 문제
- 2자리 숫자(10 ~ 99)만 제공한다. <- random
- 총 5분제를 제공한다.
- 1문제당 20점씩 처리한다
- 틀리면 1번 더 기회를 준다.

[실행결과]
a	 b
[1] 87 + 56 = 78
틀렸다.
[1] 87 + 56 = 150
틀렸다...정답은 143

[2] 17 + 64 = 81
참 잘했어요!

'
'
[5] 82 + 45 = 78
틀렸다

당신은 총 	x문제를 맞추어서 점수 xx점 입니다.
x => count
점수 => count * 20
*/
