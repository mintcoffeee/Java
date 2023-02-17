package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {

	public void menu() throws IOException, ClassNotFoundException {
		List<MemberDTO> list = new ArrayList<MemberDTO>(); 
		Member member = null;
		
		while(true) {
			Scanner scan = new  Scanner(System.in);
			System.out.println("********************");
			System.out.println("  1. 등록");
			System.out.println("  2. 출력");
			System.out.println("  3. 핸드폰 검색");
			System.out.println("  4. 이름으로 오름차순");
			System.out.println("  5. 파일 저장");
			System.out.println("  6. 파일 읽기");
			System.out.println("  7. 끝");
			System.out.println("********************");
			System.out.print("  번호 : ");
			int num = scan.nextInt();
			
			if(num == 7) break;
			
			if(num == 1) member = new MemberInsert();
			else if(num == 2) member = new MemberPrint();
			else if(num == 3) member = new MemberPhoneSearch();
			else if(num == 4) member = new MemberNameAsc();
			else if(num == 5) member = new MemberFileOutput();
			else if(num == 6) member = new MemberFileInput();
			else {
				System.out.println("1 ~ 7번까지만 입력하세요 ");
				continue;
			}
			member.execute(list);
		}
				
	}

}
