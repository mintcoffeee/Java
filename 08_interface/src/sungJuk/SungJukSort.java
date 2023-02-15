package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("   1. 총점으로 내림차순");
		System.out.println("   2. 이름으로 오름차순");
		System.out.println("   3. 이전메뉴");
		System.out.println("*************************");
		System.out.print("   번호 : ");
		int num = scan.nextInt();
		
		if(num==3) return;
		if(num==1) {	// 총점으로 내림차순 
			Collections.sort(arrayList, new TotComparator());
			for(int i=0; i<arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
		}else if(num==2) {	// 이름으로 오름차순 
			Collections.sort(arrayList, new NameComparator());
			for(int i=0; i<arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
		}
	}

}

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