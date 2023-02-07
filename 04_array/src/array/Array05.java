package array;

import java.util.*;

public class Array05 {
	
	public static void main(String[] args) {
		char[] ar = new char[50];
		int[] count = new int[26];
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				int random = (int)(Math.random() * 26 + 65);
				ar[num] = (char)random;
				count[random-65]++;
				System.out.print(ar[num]+ " ");
				num++;
			}// for j
			System.out.println();
		}//for i
		
		System.out.println();
		for(int k=0; k<count.length; k++) {
			System.out.println((char)(k+65) + " : " + count[k]);
		}
		
		
		
	}

}

/* Word count
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
배열에 저장후 출
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/
