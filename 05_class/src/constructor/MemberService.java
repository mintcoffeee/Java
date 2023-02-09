package constructor;

import java.util.*;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	private MemberDTO[] ar = new MemberDTO[5]; //객체 배열
	
	public MemberService() {
		System.out.println("기본 생성자");
	}

	public void menu() {
		while(true) {
			System.out.println("*************");
			System.out.println("\t1. 가입");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 탈퇴");
			System.out.println("\t5. 끝내기");
			System.out.println("*************");
			System.out.print("번호 : ");
			int num = scan.nextInt();
			
			System.out.println();
			if(num == 5) break;
			
			if(num == 1) 
				this.insert();
			else if(num == 2) 
				this.list();
			else if(num==3) 
				this.update();
			else if(num==4)
				this.delete();
		}//while
	}
	public void insert() {	
	//함수는 기본으로 private로 잡힌다. public 으로 바꿔주는 것이 좋다.
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) break;
		}
		if(i == ar.length) {
			System.out.println(ar.length + "명의 정원이 꽉 찼습니다");		
			return;	//함수를 벗어나라 , break는 반복문을 탈출하는 것.
		}
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone = scan.next();
		System.out.print("주소 입력 : ");
		String address = scan.next();
		System.out.println("1 row created");
		
		//객체 배열 생성 
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) {
				ar[i] = new MemberDTO(name, age, phone, address);
				break; // for 를 벗어나라 
			}
		}//for i
	}
	public void list() {
		for(MemberDTO dto : ar) {
			if(dto != null) {
				System.out.println(dto.getName() +"\t"+
							dto.getAge() +"\t"+
							dto.getPhone() +"\t"+
							dto.getAddress() +"\t");
			}
		}//for i
	}
	public void update() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null && ar[i].getPhone().equalsIgnoreCase(phone)) {
				//ar[i].getPhone() == phone 는 주소가 같은지 물어보는 조건문이다.
				System.out.println(ar[i].getName() +"\t"+
						ar[i].getAge() +"\t"+
						ar[i].getPhone() +"\t"+
						ar[i].getAddress() +"\t");
				break;
			}
		}//for i
		if(i==ar.length) {
			System.out.println("찾는 회원이 없습니다");
			return;
		}
		
		System.out.print("수정 할 이름 입력 : ");
		String name = scan.next();
		System.out.print("수정 할 핸드폰 입력 : ");
		phone = scan.next();
		System.out.print("수정 할 주소 입력 : ");
		String address = scan.next();
		
		ar[i].setName(name);
		ar[i].setPhone(phone);
		ar[i].setAddress(address);
		
//		ar[i] = new MemberDTO(name, ar[i].getAge(), phone, address);
		//기존의 객체배열을 수정하는 것이 아닌 새로운 객체 배열을 생성 
		//기존의 객체배열이 삭제되는데 cost가 소요, user가 수도없이 많을 경우 과부하가 발생한다.
		
		
		System.out.println("1 row(s) updated");
	}
	public void delete() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null && ar[i].getPhone().equalsIgnoreCase(phone)) {
				ar[i] = null;
				System.out.println("1 row deleted");
				break;
			}
		}
		if(i == 5) {
			System.out.println("찾는 회원이 없습니다");
			return;
		}
	}
	
}
