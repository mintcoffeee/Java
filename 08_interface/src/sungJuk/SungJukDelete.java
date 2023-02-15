package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		for(i=0; i<arrayList.size(); i++) {
			if (!name.equalsIgnoreCase(arrayList.get(i).getName())) continue;
			else break;
		}
		if(i == arrayList.size()) {
			System.out.println("회원의 정보가 없습니다");
			return;
		}
		
		while(true) {
			for(i=0; i<arrayList.size(); i++) {
				if(name.equalsIgnoreCase(arrayList.get(i).getName())) {
					arrayList.remove(i);
					break;
				}
				else if (!name.equalsIgnoreCase(arrayList.get(i).getName())) continue;
			}
			if(i == arrayList.size()) {
				break;
			}
		}//while
		System.out.println("삭제하였습니다.");
		
		
		
		
	}

}
