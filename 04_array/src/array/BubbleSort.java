package array;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		//sort 전
		for(int i=0; i<ar.length; i++) {
			System.out.println(String.format("%4d", ar[i]));
		}
		System.out.println();
		
		//정렬
		//오름차순(ASCENDING)
		//내림차순(DESCENDING)
		int temp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j] > ar[j+1]) {	// > 오름차순, < 내림차순
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}//for j
		}//for i
		
		//sort 후 
		for(int i=0; i<ar.length; i++) {
			System.out.println(String.format("%4d", ar[i]));
		}
		System.out.println();		
	}
}
