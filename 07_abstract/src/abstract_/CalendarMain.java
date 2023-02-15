package abstract_;

import java.util.*;

class CalendarEx{
	protected int y, m, w, max;
	
	public CalendarEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		y = s.nextInt();
		System.out.print("월 입력 : ");
		m = s.nextInt();
	}
	public void calc() {
		Calendar cal = Calendar.getInstance();
		
		//생성할 때 기준인 시스템 날짜를 내가 원하는 날짜로 변경 
		cal.set(Calendar.YEAR,y);	//년도
		cal.set(Calendar.MONTH,m-1);	//월
		cal.set(Calendar.DAY_OF_MONTH,1);	//DAY_OF_MONTH를 1로 설정 (월의 첫날)
//		cal.set(y, m-1, 1);	//년, 월, 
		
		w = cal.get(Calendar.DAY_OF_WEEK);	//그 주의 요일 반환 (일:1 ~ 토:7)
		max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);	//그 달의 말일 
	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0; i<w-1; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=max; i++) {
			System.out.print(i + "\t");
			if((i+w-1)%7 ==0) System.out.println();
		}
	}
}

public class CalendarMain {
	
	public static void main(String[] args) {
		CalendarEx ce = new CalendarEx();
		ce.calc();
		ce.display();
		
	}

}

/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
        
클래스명 : CalendarEx
필드 : 
메소드 - 기본 생성자 : 월, 일을입력
       calc()    : 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                   매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
       display() : 출력

클래스명 : CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일  월   화   수  목    금   토
        1   2   3    4    5
6   7   8   9   10   11   12
13  14  15  16  17   18   19
20  21  22  23  24   25   26
27  28  29  30  31
*/