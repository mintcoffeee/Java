package basic;

class Test{
	int a = 10;
	static int b = 20;
	static String str;
}
//---------------------------------
public class Variable02 {
	int a;	// 전역 변수, 필드, 초기값(0)을 갖고 있다.
	double b;	// 필
	static int c;
	
	public static void main(String[] args) {
//		int a;	// 지역 변수 (local variable), garbage 값을 갖고 있다.
		int a = 5;
		System.out.println("지역변수 a = " + a);	// 5
		
		Variable02 v = new Variable02();	// 메모리에 생성
		
		System.out.println("객체 = " + v);	// 객체 = basic.Variable02@553a3d88
		System.out.println("필드 a = " + v.a);	// 필드 a = 0
		System.out.println("필드 b = " + v.b);	// 필드 b = 0
		System.out.println("필드 c = " + c);		// 필드 c = 0
		System.out.println("필드 c = " + Variable02.c);	// 필드 c = 0, Variable02는 생략 가능
		System.out.println();
		
		//Test class의 a값을 출력하시오
		Test tt = new Test();
		System.out.println("Test class a = " + tt.a);	// a =10
		System.out.println("Test class b = " + Test.b);	// b = 20, 다른 class 이기 때문에 Test 는 생략 할 수 없다. 
		System.out.println("Test class str = " + Test.str);	// null
		
	
	}
}
