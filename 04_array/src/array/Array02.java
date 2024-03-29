package array;

public class Array02 {
	
	public static void main(String[] args) {
		String[] ar = {"호랑이", "사자", "코끼리", "기린", "하이애나", "긴팔원숭이", "고릴라"};
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
			System.out.println("문자열의 크기 = " + ar[i].length());	// 총 글자 수 
			System.out.println("첫번째 문자 = " + ar[i].charAt(0));	// 배열의 각 값의 첫번째 문자를가져온다.
			System.out.println("마지막 문자 = " + ar[i].charAt(ar[i].length()-1));
			System.out.println();
		}//for
		
		System.out.println("확장 for");
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
