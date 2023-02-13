package class__;
import java.util.*;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = 0, index=0;
		while(true) {
			System.out.print("문자열 입력 : ");
			String a = s.next();
			System.out.print("현재 문자열 입력 : ");
			String now = s.next();
			System.out.print("바꿀 문자열 입력 : ");
			String change = s.next();
			if(a.length() < now.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다");
				System.out.println("치환할 수 없습니다.");
//				break;
//				return;	//함수를 벗어나라 
				System.exit(0);	// 프로그램 강제 종
			}
			//indexOf : 처음에 만난 now 위치를 알려준다. 
			a = a.toLowerCase();	//소문자 변환 
			now = now.toLowerCase();	
			while(a.indexOf(now, index) != -1) {
				index += a.indexOf(now,index)+ now.length();
				cnt++;
			}
			System.out.println(a.replace(now, change)); 
			System.out.println(cnt + "번 치환");
		}//while
	}
}


/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/