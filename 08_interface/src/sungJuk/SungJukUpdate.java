package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		outLoop:
		while(true) {
			System.out.println();
			System.out.println("번호 입력 : ");
			int number = scan.nextInt();
			int i;
			
			for(i=0; i<arrayList.size(); i++) {
				if (number == arrayList.get(i).getNo()) {
					System.out.println(arrayList.get(i));
					
					System.out.println("수정 할 이름 입력 : ");
					String name = scan.next();
					System.out.println("수정 할 국어 입력 : ");
					int kor = scan.nextInt();
					System.out.println("수정 할 영어 입력 : ");
					int eng = scan.nextInt();
					System.out.println("수정 할 수학 입력 : ");
					int math = scan.nextInt();
					
					arrayList.get(i).setName(name);
					arrayList.get(i).setKor(kor);
					arrayList.get(i).setEng(eng);
					arrayList.get(i).setMath(math);
					arrayList.get(i).calc();
					
					System.out.println("수정하였습니다.");
					break outLoop;
				}else if(number != arrayList.get(i).getNo()) {
					continue;
				}
			}//for
			if(i== arrayList.size()) {
				System.out.println("잘못된 번호 입니다.");
			}
		}//while
		
	}

}
