package class_;

public class SungJukMain {

	public static void main(String[] args) {
		//홍길동  
		SungJuk a = new SungJuk();
		a.setData("홍길동", 91, 95, 100);
		a.calc();
		System.out.println(a.getName() + "\t"+a.getKor() 
						+"\t"+ a.getEng() +"\t"+ a.getMath() 
						+"\t"+ a.getTot()+ "\t"
//						+ String.format("%.2f",a.getAvg()) 
						+ a.getAvg()
						+"\t"+ a.getGrade());
		//프로도  
		SungJuk bb = new SungJuk();
		bb.setData("프로도", 100, 89, 75);
		bb.calc();
		System.out.println(bb.getName() + "\t"+bb.getKor() 
						+"\t"+ bb.getEng() +"\t"+ bb.getMath() 
						+"\t"+ bb.getTot()+ "\t"
						+ bb.getAvg()
						+"\t"+ bb.getGrade());
		//죠르디 
		SungJuk cc = new SungJuk();
		cc.setData("죠르디", 75, 80, 48);
		cc.calc();
		System.out.println(cc.getName() + "\t"+cc.getKor() 
						+"\t"+ cc.getEng() +"\t"+ cc.getMath() 
						+"\t"+ cc.getTot()+ "\t"
						+ cc.getAvg()
						+"\t"+ cc.getGrade());
	}
}

/*
[문제] 성적 처리
- 총점, 평균, 학점을 구하시오
- 평균은 소수이하 2째자리까지 출력

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90 이상이면 'A'
      평균이 80 이상이면 'B'
      평균이 70 이상이면 'C'
      평균이 60 이상이면 'D'
      그외는 'F'
      
클래스명 : SungJuk
필드    : name, kor, eng, math, tot, avg, grade  
메소드   : setData(이름, 국어, 영어, 수학)
          calc() - 총점, 평균, 학점 계산
          getName()
          getKor()
          getEng()
          getMath()
          getTot()
          getAvg()
          getGrade()
         
클래스명 : SungJukMain         

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100     89      75
죠르디   75      80      48
----------------------------------------------------

*/