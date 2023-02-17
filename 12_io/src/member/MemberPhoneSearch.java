package member;

import java.util.List;
import java.util.Scanner;

public class MemberPhoneSearch implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		Scanner scan = new  Scanner(System.in);
		System.out.print("검색할 핸드폰 번호 입력 : ");
		String phone = scan.next();
		int count=0;
		for(MemberDTO memberDTO : list) {
			if(memberDTO.getPhone().equalsIgnoreCase(phone)) {
				System.out.println("이름\t나이\t핸드폰\t\t주소");
				System.out.println(memberDTO);
				count++;
				
				break;
			}
		}//for
		if(count==0) 
			System.out.println("찾으시는 핸드폰 번호가 존재하지 않습니다.");
	}

}
