package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	public void menu() {
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true)	{
			System.out.println("******************************");
			System.out.println("\t1. 데이터 입력");
			System.out.println("\t2. 데이터 출력");
			System.out.println("\t3. 데이터 수정");
			System.out.println("\t4. 데이터 삭제");
			System.out.println("\t5. 데이터 정렬");
			System.out.println("\t6. 끝");
			System.out.println("******************************");
			System.out.print("\t번호 : ");
			num = scan.nextInt();
			
			if(num == 6) break;
			
			if(num == 1) sungJuk = new SungJukInsert();
			else if(num == 2) sungJuk = new SungJukList();
			else if(num == 3) sungJuk = new SungJukUpdate();
			else if(num == 4) sungJuk = new SungJukDelete();
			else if(num == 5) sungJuk = new SungJukSort();
			else {
				System.out.println("1 ~ 6번까지만 입력하세요 ");
				continue;
			}
			sungJuk.execute(arrayList);	//호출 
			
		}//while
	}//menu
}
