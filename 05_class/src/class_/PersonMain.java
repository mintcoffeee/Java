package class_;

class Person{
	private String name;	//클래스 바로 밑에 오는 변수는 필드 초기값	
	private int age;
	
	
	//set
	//method 구현 
	//public 결과형 메소드명(인수형 인수)
	public void setName(String n){ //구현 
		name = n;
	}
	public void setAge(int a) { //구현 
		age = a;
	}
	public void setData(String n, int b) {
		name = n;
		age = b;
	}
	public void setData() {//d
	}
	//get
	public String getName(){
		return name;// 반환값  
	}
	public int getAge(){
		return age;
	}
}
//-----------------------------------
public class PersonMain {

	public static void main(String[] args) {
		Person a; // 객체형 변수 
		a = new Person(); // 생성  
		System.out.println("객체 a = " + a);
//		a.name = "홍길동";	//main 함수 안에서 먼저 찾는다. 
		a.setName("홍길동");	//호출 - 함수를 호출하 반드시 제자리로 돌아온다.
							//함수를 호출하면 수행시간이 길어진다.
		a.setAge(25);
		System.out.println("이름 = " + a.getName() + "\t나이 = " + a.getAge());
		
		Person b = new Person();
		System.out.println("객체 b = " + b);
		b.setName("코난");
		b.setAge(13);	//호
		System.out.println("이름 = " + b.getName() + "\t나이 = " + b.getAge());
		
		Person c = new Person();
		System.out.println("객체 c = " + c);
		c.setData("둘리", 100	);
		System.out.println("이름 = " + c.getName() + "\t나이 = " + c.getAge());
		
		Person d = new Person();
		System.out.println("객체 c = " + d);
		d.setData();
		System.out.println("이름 = " + d.getName() + "\t나이 = " +d.getAge());
		
		
	}
}
