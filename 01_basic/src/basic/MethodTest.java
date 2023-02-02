package basic;

public class MethodTest {
	
	public static void main(String[] args) {
		// 25, 36의 큰값을 구하시오	
		int big  = Math.max(25, 36);	// 함수 호출
		System.out.println("최대값 = " + big);	// 36
		
		// 25.8, 78.6의 작은값을 구하시오
		double small = Math.min(25.8, 78.6);
//		float small - Math.min(25.8f, 78.6f);
		System.out.println("최소값 = " + small);	// 25.8
		
		// 250을 2진수로 출력하시오
		String binary = Integer.toBinaryString(250);
		System.out.println("2진수 = " + binary);	// 1111 1010
		// 8진수
		String oct = Integer.toOctalString(250);
		System.out.println("8진수 = " + oct);		// 372
		// 16진수
		String hexa = Integer.toHexString(250);
		System.out.println("16진수 = " + hexa);	// fa
	}
}
