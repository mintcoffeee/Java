package class__;
import java.util.StringTokenizer;

public class Token {
	
	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("토큰 개수 = " + st.countTokens());		// 3개("학교","집","게임방"), 비어있는곳은 계산 x
		
		while(st.hasMoreTokens()) {	//토큰이 있다?(true) 없다? (false) 판단 
			System.out.println(st.nextToken());	// nextToken : 토큰을 꺼내고 다음 토큰으로 이동 
		}//while
		System.out.println("------------------------");
		
		String[] ar = str.split(",");
		
		for(String data : ar) {
			System.out.println(data);
		}
	}
}
