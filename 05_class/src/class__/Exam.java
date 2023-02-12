package class__;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private int score = 0;
	private final String JUNG = "11111"; //상수화
	private char[] ox = new char[JUNG.length()];
	Scanner sc = new Scanner(System.in);
	public Exam() {
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("답 입력 : ");
		String dap = sc.next();
		this.name = name;
		this.dap = dap;
	}
	public void compare() {
		for(int i=0; i<JUNG.length(); i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i] = 'O';
				setOx(ox);
				score += 20;
			}
			if(dap.charAt(i)!=JUNG.charAt(i)) {
				ox[i] = 'X';
				setOx(ox);
			}
		}
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public char[] getOx() {
		return ox;
	}
	public void setOx(char[] ox) {
		this.ox = ox;
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