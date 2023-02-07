package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		String[] shape = {"이름","국어","영어", "수학","총점","평균","학점"};
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{91,95,100,0}, {100,88,75,0}, {75,80,48,0}};
		double[] arg = new double[3];
		char[] grade = new char[3];
		
		//총점, 평균, 학점  
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];
			}//for j
			arg[i] = jumsu[i][3] / 3d;
			
			if(jumsu[i][3] >= 90) grade[i] = 'A';
			else if(jumsu[i][3] >= 80) grade[i] = 'B';
			else if(jumsu[i][3] >= 70) grade[i] = 'C';
			else if(jumsu[i][3] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}//for i
		
		
		
		//출력  
		System.out.println();
		System.out.println("------------------------------------------------");
		for(String data : shape) {
			System.out.print(String.format("%6s", data));
		}
		System.out.println("\n------------------------------------------------");
		for(int i=0; i<3; i++) {
			//이름 
			System.out.print(String.format("%6s", name[i]));
			//점수 
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(String.format("%7d", jumsu[i][j]));
			}//for j
			//평균 
			System.out.print(String.format("%7.2f", arg[i]));
			//학점 
			System.out.print(String.format("%6s", grade[i]));
			System.out.println();
		}//for i
		System.out.println("------------------------------------------------");
	}
}


/*
[문제] 성적 처리
- 총점, 평균, 학점을 구하시오 
- 평균은 소수이하 2째자리까지 출력 

총점 = 국어 + 영어 + 수
평균 = 총점 / 과목수 
학점은 평균이 90이상이면 'A'
	  평균이 80이상이면 'B'
	  평균이 70이상이면 'C'
	  평균이 60이상이면 'D'
	  그외는 'F'
	 
		   

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100      89      75
죠르디   75      80      48
----------------------------------------------------

*/
