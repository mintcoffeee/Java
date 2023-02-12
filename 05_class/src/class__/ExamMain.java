package class__;

import java.util.Scanner;

public class ExamMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력 : ");
		int cnt = sc.nextInt();
		Exam[] ex = new Exam[cnt];
		
		for(int i=0; i<cnt;i++) {
			ex[i] = new Exam();
			ex[i].compare();
		}	
		
		//출력 
		for(int i=0; i<cnt; i++) {
			System.out.println("이름\t1\t2\t3\t4\t5\t점수");
			System.out.print(ex[i].getName() + "\t");
//							+ ex[i].getOx() + "\t"
//							+ ex[i].getScore());
			
			for(int j=0; j<5;j++) {
				System.out.print(ex[i].getOx()[j] + "\t");
			}
			System.out.print(ex[i].getScore());
		}
	}
	
}


/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'
- 1문제당 점수는 20점씩 처리

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 를 이용하여 이름과 답을 입력받는다. 
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답 입력 : 12311  

이름 입력 : 코난
답 입력 : 24331

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
코난     X X X X O   20


*/
