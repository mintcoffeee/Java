package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("ChildMain 기본 생성자");
	}
	ChildMain(String name, int age, double weight, double height) {
		super(weight, height); // 부모 생성자 호출
		
		this.name = name;
		this.age = age;
//		super.weight = weight;	//this.weight = weight;
//		this.height = height;
	}
	public void disp() {
		System.out.println("이름 = " +  name);
		System.out.println("나이 = " +  age);
		super.disp(); // 부모의 disp()
		//this.disp()는 계속해서 자기 자신만 가르키기 때문에 무한루프에 빠진
	}
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25,73.5, 182.6);
		aa.disp();	//ChildMain disp()
		System.out.println("-------------------");
		
		Super bb = new ChildMain("코난", 13, 53.5, 156.6);	// bb 는 Super 를 가리킨다.
		bb.disp();	//Over ride된 메소드는 무조건 자식클래스의 메소드만 호출한다. 
		
	}

}
