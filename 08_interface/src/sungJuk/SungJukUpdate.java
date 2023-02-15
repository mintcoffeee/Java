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
			int num = scan.nextInt();
			int i;
			
			for(i=0; i<arrayList.size(); i++) {
				if (num == arrayList.get(i).getNo()) {	//같으면 수정 	
					System.out.println(arrayList.get(i));
					
					System.out.print("수정 할 이름 입력 : ");
					String name = scan.next();
					System.out.print("수정 할 국어 입력 : ");
					int kor = scan.nextInt();
					System.out.print("수정 할 영어 입력 : ");
					int eng = scan.nextInt();
					System.out.print("수정 할 수학 입력 : ");
					int math = scan.nextInt();
					
					arrayList.get(i).setName(name);
					arrayList.get(i).setKor(kor);
					arrayList.get(i).setEng(eng);
					arrayList.get(i).setMath(math);
					arrayList.get(i).calc();
					
					System.out.println("수정하였습니다.");
					break outLoop;
				}else if(num != arrayList.get(i).getNo()) {	// 같지 않으면 다음 항목 찾아보기 
					continue;
				}
			}//for
			if(i == arrayList.size()) {
				System.out.println("잘못된 번호 입니다.");
			}
		}//while
		
		
		//수업시간에 한거 
//		System.out.println("번호 입력 : ");
//		int no = scan.nextInt();
//		
//		int sw =0;
//		for(SungJukDTO sungJukDTO : arrayList) {
//			if(sungJukDTO.getNo() == no) {
//				sw = 1;
//				System.out.println(sungJukDTO);
//				
//				System.out.print("수정 할 이름 입력 : ");
//				String name = scan.next();
//				System.out.print("수정 할 국어 입력 : ");
//				int kor = scan.nextInt();
//				System.out.print("수정 할 영어 입력 : ");
//				int eng = scan.nextInt();
//				System.out.print("수정 할 수학 입력 : ");
//				int math = scan.nextInt();
//				
//				sungJukDTO.setName(name);
//				sungJukDTO.setKor(kor);
//				sungJukDTO.setEng(eng);
//				sungJukDTO.setMath(math);
//				sungJukDTO.calc();
//				
//				System.out.println("수정하였습니다.");
//			}
//		}//for
//		
//		if(sw == 0) {
//			System.out.println("없는 번호 입니다.");
//		}
		
	}

}
