package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		int size, sum = 0;
		int [] ar;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		size = scan.nextInt();
		ar = new int[size];	// 배열 생성 
		
		for(int i=0; i<size; i++) {
			System.out.print("ar[" + i + "]입력 : ");
			ar[i] = scan.nextInt();
			sum += ar[i];
		}//for 
		System.out.println();

		//최대값
		int max, min;
		max = min = ar[0];
		
		for(int i=0; i<size; i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];
		}
		
		for(int data : ar) System.out.print(data + " ");
		System.out.println("\n합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
	}
}

/*
[문제] 배열의 크기를 입력받아서 배열을 생성한다.

[실행결과]
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57

25 13 57
합 = 

*/
