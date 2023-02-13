package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
	
	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat();	// -error 추상클래스라서 new 할 수 없다.
		NumberFormat nf = new DecimalFormat();	//Sub class를 이용하여 메모리에 생성
		
		//3자리마다 ','를 찍고 소수이하 3 째자리까지 출력 
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");	
		//유효숫자가 아니면 표시하지 않는다. 
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");	
		// .00을 강제로 표시 
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
	
		
//		NumberFormat nf4 = NumberFormat.getInstance();	// 메소드 이용하여 생성 
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();	// ₩ 표시 
		nf4.setMaximumFractionDigits(2);	//소수이하 2째자리 까지 표시 
		nf4.setMinimumFractionDigits(2);	//소수이하 2째자리까지 0으로 표시 
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
//		NumberFormat nf5 = NumberFormat.getInstance(Locale.US);	// 메소드 이용하여 생성 
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);	// $ 표시 
		nf5.setMaximumFractionDigits(2);	
		nf5.setMinimumFractionDigits(2);	
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
