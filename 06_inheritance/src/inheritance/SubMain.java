package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("SubMain 기본 생성자");
	}
	SubMain(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		super.weight = weight;	//this.weight = weight;
		this.height = height;
	}
	public void output() {
		System.out.println("이름 = " +  name);
		System.out.println("나이 = " +  age);
		disp(); // this.disp()
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25,73.5, 182.6);
		aa.disp(); //부모 메소드 호출
		aa.output();
		System.out.println("-------------------");
		
		Super bb = new SubMain("코난", 13, 53.5, 156.6);
//		bb.output();	// error
		bb.disp();
		
	}
}

/*
자식 클래스는 메모리에 생성할 때
-부모 클래스 생성 후 
	-> new 부모() : 기본생성자로 생성 
	 어떠한 상황에서도 사용할 수 있도록 개발할때는 기본생성자를 먼저 작성한다.
	
-자식 클래스 생성 > new 자식()
*/