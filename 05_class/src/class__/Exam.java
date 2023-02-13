package class__;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private int score = 0;
	private final String JUNG = "11111"; //상수화
	private char[] ox = new char[JUNG.length()];
	
	public Exam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		this.name = sc.next();
		System.out.print("답 입력 : ");
		this.dap  = sc.next();
		System.out.println();
	}
	public void compare() {	//void return값이 없다. 
		for(int i=0; i<JUNG.length(); i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else {
				ox[i] = 'X';
			}
		}
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public char[] getOx() {
		return ox;
	}

}

/*
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

*/