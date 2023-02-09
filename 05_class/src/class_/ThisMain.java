package class_;

class This{
	private int b;
	private static int c;
	
	public void setB(int b) {	//구현, 인수(argument), 매개변수(parameter)
		this.b = b;
	}
	public void setC(int c) {	
		this.c = c;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
}

//-----------------------------------------
public class ThisMain {
	private int a;	// 필드
					// private 내 클래스 안에서만 접근이 가능하다 
	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a = 10;
		System.out.println("a = " + tm.a);
		
		//b에 20을 넣어서 출력하시오 
		This t = new This();
		System.out.println("객체 t =" + t);
//		t.b = 20;	//b	는 private 라서 setter/getter 함수를 통해 접근이 필요하다.
		t.setB(20);	//호출 - 호출한 메소드는 반드시 돌아온다.
		System.out.println("t.b = " + t.getB());
		t.setC(30);
		System.out.println("t.c = " + t.getC());
		
		This w = new This();
		System.out.println("객체 w = " + w);
		w.setB(40);
		w.setC(50);
		System.out.println("w.b = " + w.getB());
		System.out.println("w.c = " + w.getC());
	}
	
}

//모든 클래스는 반드시 생성(new)해야 한다.   