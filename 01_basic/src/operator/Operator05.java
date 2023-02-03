package operator;

public class Operator05 {
	
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);	//a = false
		System.out.println("!a = " + !a);	//!a = true
		System.out.println();
		
		String b = "apple";	// String > 문자열 literal 생성 
		String c = new String("apple");
		
		String result = b == c ? "같다" : "다르다";	// 주소 비교 
		System.out.println("b == c : " + result);	// 다르다
		System.out.println();
		
		String result2 = b.equals(c) ? "같다" : "다르다";	// 문자열 비교 
		System.out.println("b.equals(c) : " + result2);	// 같다
		System.out.println("!b.equals(c) : " + (!b.equals(c)? "같다" :"다르다"));	// 다르
		System.out.println();
		
	}

}
 