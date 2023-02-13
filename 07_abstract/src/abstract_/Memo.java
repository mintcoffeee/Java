package abstract_;

import java.util.*;

public class Memo {

	public static void main(String[] args) {
		int y,m,w, max;
		Scanner s = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		y = s.nextInt();
		System.out.println("월 입력 : ");
		m = s.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,y);
		cal.set(Calendar.MONTH,m-1);
		cal.set(Calendar.DAY_OF_MONTH,1);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		String dayOfWeek = null;
		switch(w) {
		case 1: dayOfWeek = "일";break;
		case 2: dayOfWeek = "월";break;
		case 3: dayOfWeek = "화";break;
		case 4: dayOfWeek = "수";break;
		case 5: dayOfWeek = "목";break;
		case 6: dayOfWeek = "금";break;
		case 7: dayOfWeek = "토";
		}
		max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(dayOfWeek);
		System.out.println(max);
		System.out.println(cal.get(Calendar.YEAR)+"년 "+  (cal.get(Calendar.MONTH)+1));
		
	}
}
