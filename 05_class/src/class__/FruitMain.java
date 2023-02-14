package class__;

class Fruit {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan=0, sumFeb=0, sumMar=0;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
	
}
//-----------------------
public class FruitMain {
	
	public static void main(String[] args) {
		Fruit[] fruit = new Fruit[3];
		fruit[0] = new Fruit("사과", 100, 80, 75);
		fruit[1] = new Fruit("포도", 30, 25, 10);
		fruit[2] = new Fruit("딸기", 25, 30, 90);
		for(int i=0; i<fruit.length; i++) {
			fruit[i].calcTot();
		}//for 
		
		System.out.println("---------------------------------");
		System.out.println("PUM\tJAN]\tFEB\tMAR\tTOT");
		System.out.println("---------------------------------");
		for(int i=0; i<fruit.length; i++) {
			fruit[i].display();
		}//for 
		System.out.println("---------------------------------");
		Fruit.output();
	}

}

/*
[문제]과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드 :
	pum, jan, feb, mar, tot
	sumJan, sumFeb, sumMar
	scanner X

메소드 : 
	생성자(품명, 1월, 2월, 3월)
	calcTot()
	display()
	public static void output()

클래스 : FruitMain

[실행결과]
---------------------------------
PUM    JAN   FEB   MAR     TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
       xxx   xxx   xxx            output()로 처리
*/