package inheritance;

/*
abstract class AA {
	public final void sub() {}
	public abstract void disp();
}

class BB extends AA {
//	public void sub() {}	// error: Override 하면 안된다. 
	public void disp() {}	// 반드시 Override  해야 한다. 
}

final class AA {	//절대 상속하면 안된다. 
	
}
class BB extends AA {
	
}
*/
enum Color {	//enum : 상수들의 집합체
	//public static final 생략 
	RED, GREEN, BLUE	// 컴퓨터는 RED = 0 으로 인식, 아무말 없어도 0,1,2 로 저장 
}
//-----------------------
class Final {
	public final String FRUIT = "사과"; //상수는 아무데서나 값에 접근 할 수 있게 public 사용 
	public final String FRUIT2;
	
	public static final String ANIMAL = "기린";
	// static : 시음식, 실행하자마자 메모리 자동으로 생성(new 할 필요 x)
	public static final String ANIMAL2;	//static은 생성자에서 초기화가 안된다. 

//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;	// >>> enum 
	
	static {	//초기과 영역
		System.out.println("static 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	
	Final(){	// 생성자 = 객체 초기화 
		System.out.println("기본 생성자");
		FRUIT2 = "딸기";
	}
}

//-----------------------
public class FinalMain {
	
	public static void main(String[] args) {
		final int A = 10;	// 상수화 
//		A = 20;	//error, final 은 값을 변경 할 수 없다. 
		System.out.println("A = " + A);
		
		final int B;
		B = 30;
//		B = 40;
		System.out.println("B = " + B);
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.println(data + "\t" + data.ordinal());
		}
	}

}
