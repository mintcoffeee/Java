package basic;

public class Variable01 {
	
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);
		System.out.println();
		
		boolean a;
		a = 25 > 36;
		System.out.println("a = " + a);
		
		char b;
		b = 'A'; //65, 0100 0001
		System.out.println("b = " + b);
		
		char c;
		c = 65;	// 아스키 코드 65 = 'A'
		System.out.println("c = " + c);
		
		byte d = 0;	// 1byte, 8bit, -128 ~ 127
//		d = 128; error
		System.out.println("d = " + d);
		
		int e;
		e = 65; //0100 0001
		System.out.println("e = " + e);
		
		int f;
		f = 'A';
		System.out.println("f = " + f); //65
		
		long g;
		g = 25L; //25L 은 long형 상수
		System.out.println("g = " + g); //65
		
		float h; // 소수점 이하 7, double 소수점 이하 16 자리
//		h = 43.8; // 43.8은 double 형 상수이기 때문에 float변수에서 받을 수 없다.
		
//		h = (float)43.8; //강제 형 변환 
		h = 43.8F; //43.8F는 float형 상수 
		
	}

}
