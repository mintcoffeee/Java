package multi;

import java.util.*;

public class MultiArray05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] subject;
		String[] name;
		int[][] jumsu;
		int subjectCnt;
		
		//반복횟수 설정 
		System.out.print("인원수 : ");
		int cnt = scan.nextInt();
		//초기값 
		name = new String[cnt];
		double[] avg = new double[cnt];
		subject = new String[cnt][];
		jumsu = new int[cnt][];
		
		System.out.println();
		//정보 입력 , cnt 만큼 반복 
		for(int i=0; i<cnt; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.print("과목 수 입력 : ");
			subjectCnt = scan.nextInt();
			subject[i] = new String[subjectCnt];
			jumsu[i] = new int[subjectCnt + 1];
			
			//과목명 입력 
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			} //for i 
		
			//점수 입력 
			for (int j = 0; j < subjectCnt; j++) {
				System.out.print(subject[i][j] + "점수 입력 : ");
				jumsu[i][j] = scan.nextInt();
				jumsu[i][subjectCnt] += jumsu[i][j];	//총점  
			} //for j
			//평균 
			avg[i] = jumsu[i][subjectCnt] / (double)subjectCnt;
			System.out.println();
		}//for i
		
		for(int i=0; i<cnt; i++) {
			//상단 글자
			System.out.print("이름\t");
			for (int j = 0; j <subject[i].length; j++) {
				System.out.print(subject[i][j]+ "\t");
			} //for j
			System.out.print("총점\t");
			System.out.println("평균");
			
			//하단 
			System.out.print(name[i]+ "\t");
			
			//과목별 점수, 총점 
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			} //for j 
			
			//평균 
			System.out.print(String.format("%5.2f", avg[i]));
			System.out.println("\n");
		}//for i
	}

}

/*
[문제]인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름      국어  영어   과학    총점      평균
이기자   95   100   90    xxx      xx.xx
*/