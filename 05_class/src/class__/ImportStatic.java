package class__;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*;	// *(wild card) 사용 비추천, Math안에 뭐가 들었는지 찾기 어려움 

import static java.lang.String.format;	 
import static java.lang.System.out;	 

public class ImportStatic {

	public static void main(String[] args) {
		out.println(random());
		out.println(pow(2, 5));	//2의 5승 
		out.println(format("%.2f", 45.5678));
	}
}
