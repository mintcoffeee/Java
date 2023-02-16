package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	
	//선생님 풀이 
	public void menu(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("*************************");
			System.out.println("   1. 총점으로 내림차순");
			System.out.println("   2. 이름으로 오름차순");
			System.out.println("   3. 이전메뉴");
			System.out.println("*************************");
			System.out.print("   번호 : ");
			int num = scan.nextInt();
			
			if(num==3) break;
			
//			if(num==1) {	// 총점으로 내림차순 
//				Collections.sort(arrayList, new TotComparator());
//			}else if(num==2) {	// 이름으로 오름차순 
//				Collections.sort(arrayList, new NameComparator());
//			}
//			for(int i=0; i<arrayList.size(); i++) {
//				System.out.println(arrayList.get(i));
//			}//for
			
			//풀이 
			Comparator<SungJukDTO>  com = null;
			if(num==1) {	// 총점으로 내림차순 
				com = new Comparator<SungJukDTO>(){
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						//내림차순 
						if(dto1.getTot() > dto2.getTot()) return -1;
						else if(dto1.getTot() < dto2.getTot()) return 1;
						else return 0;
					}
				};
			}else if(num==2) {	// 이름으로 오름차순 
				com = new Comparator<SungJukDTO>(){
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());	//오름차순 
					}
				};
			}
			else {
				System.out.println("1 ~ 3 번까지만 입력하세요");
				continue;
			}
			//
			Collections.sort(arrayList, com);
			// 출력
			new SungJukList().execute(arrayList);	//단발성, 한번 쓰고 버린다.
			
		}
	}
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
	}

}

//--------------
class TotComparator implements Comparator<SungJukDTO>{
	@Override
	public int compare(SungJukDTO dto1, SungJukDTO dto2) {
		//내림차순 
		if(dto1.getTot() > dto2.getTot()) return -1;
		else if(dto1.getTot() < dto2.getTot()) return 1;
		else return 0;
	}
}
class NameComparator implements Comparator<SungJukDTO>{
	@Override
	public int compare(SungJukDTO dto1, SungJukDTO dto2) {
		return dto1.getName().compareTo(dto2.getName());	//오름차순 
		
	}
	
}