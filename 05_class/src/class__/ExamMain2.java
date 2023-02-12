package class__;

import java.util.Scanner;

public class ExamMain2 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


System.out.println("인원수 입력 :");

int cnt = sc.nextInt();

Exam[] ex = new Exam[cnt];



for(int i=0; i<cnt; i++) {
	System.out.print("이름 입력 : ");
	String name = sc.next();
	System.out.print("답 입력 : ");
	String dap = sc.next();
	ex[i] = new Exam(name, dap);


System.out.println(ex[i].getName() );



System.out.println(ex[i].getOx());

System.out.println(ex[i].getScore());


}


//객체배열을사용

}

}