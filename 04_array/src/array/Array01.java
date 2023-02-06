package array;

public class Array01 {

	
	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		System.out.println("배열명 ar = " + ar);
//		배열명 ar = [I@64f6106c
//				I = integer
		ar[0] = 25;
		ar[1] = 37;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		
		System.out.println("배열 크기 = " + ar.length ); // ar.length 배열의 크기
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 1) {
				System.out.println("ar[" + i + "] = " + ar[i]);
			}
		}
		System.out.println();
		
		System.out.println("확장 for");
		for(int data : ar) {	// ar 의 배열의 크기만큼 for 문을 반복한다.
			System.out.println(data);
		}
	}
}
