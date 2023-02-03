package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		
		double b = (double)a / 3;	// Casting, 강제형변환 / 자동형변환(int -> double)
		
		String c = "25";
		
//		int d = (int)c;	// error (기분형)객체
		int d = Integer.parseInt(c);
		
		int e = 5;
		Integer f = e; //jdk 5.0 이후부터 가능, AutoBoxing(기본형 -> 객체형)
//		객체형		기본형 
//		Integer f = new Integer(e);	// jdk 5.0 이전에 사용, - "deprecate" : 단종되었으니 쓰지 말아라.
		
		Integer g = 5;
		int h = g; //jdk 5.0 이후, unAutoBoxing = AutounBoxing (객체형 -> 기본형)
//		int h = g.intValue(); //jdk 5.0 이전 
	}
}
