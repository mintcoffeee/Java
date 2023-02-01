package basic;

public class SungJuk {
	
	public static void main(String[] args) {
		String name = "L";
		int kor = 85;
		int eng = 78;
		int math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3d ;
		
		System.out.println("******************************** " + name +" 성적표 ********************************");
		System.out.println("국어\t\t영어\t\t수학\t\t총점\t\t평균");
		System.out.println(kor + "\t\t" + eng + "\t\t" + math + "\t\t" + 
				tot + "\t\t" + String.format("%.2f", avg));
	}
}


/*
[문제] 성적계산
이름이 L 이고 국어점수(kor) 85점, 영어점수(eng) 78점, 수학점수(math) 100일 때 총점(tot)과 평균(avg)을 구하시오
단 평균은 소수 이하 2째자리 까지 출력하시오.

총점 = 국어점수 + 영어점수 + 수학점수 
평균 = 총점 / 과목수 

[실행결과]
	*** L 성적표 ***
국어		영어		수학		총점		평균
85		78		100		xxx		xxx

*/