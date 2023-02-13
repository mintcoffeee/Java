package inheritance;

class Test extends Object {
	
}
//----------------------
class Sample {
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
}
//----------------------
class Exam {
	private String name = "홍길동";
	private int age = 25;
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}
//----------------------
public class ObjectMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t); // 클래스명@16진
		System.out.println("객체 t = " + t.toString());	// t = t.toString
		System.out.println("객체 t = " + t.hashCode());	// 주소를 10진수 형태로 표현 
		System.out.println();
		

		Sample s = new Sample();
		System.out.println("객체 t = " + s.toString());	// t = t.toString
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 t = " + e.toString());	
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa);	// 문자열 
		System.out.println("객체 aa = " + aa.toString());	 
		System.out.println("객체 aa = " + aa.hashCode());	 
		System.out.println();
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb == cc : " + (bb == cc));	// 주소비교 - false 
		System.out.println("bb.equals(cc) : " + bb.equals(cc));	// 문자열비교 - true
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd == ee : " + (dd == ee));	// 주소비교 - false  
		System.out.println("dd.equals(ee) : " + dd.equals(ee));	// 주소비교 - false 
		//equals가 문자열을 비교하는 것은 String 일 때만
		System.out.println();
		
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff == gg : " + (ff == gg));	// 주소비교 - false  
		System.out.println("ff.equals(gg) : " + ff.equals(gg));	//  true
		System.out.println();
		
	}

}
/*
class Objct {
	public String toString() {}			클래스명@16진수 
	public int hashCode() {}			10진수
	public boolean equals(Object ob) {}	참조값 비교 
}

class String() {
	public String toString() {}
	public int hashCode() {}; 			10진수(믿으면 안된다), 문자열은 무한대로 표기가되므로 10진수로는 다 표기할 수 없다. 
	public boolean equals(Object ob) {}	문자열 비교 
}
 * */
