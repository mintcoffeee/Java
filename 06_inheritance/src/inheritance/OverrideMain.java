package inheritance;

class AA {
	public int a=3;
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}
//---------------------
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}
//---------------------
public class OverrideMain {
	
	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();	// BB : 13
		System.out.println("aa : " + aa.a); //13
		System.out.println();
		
		AA bb = new BB();	// 다형성, 부모 = 자식 : 부모가 자식 클래스를 참조한다.
		bb.disp();	//BB : 13
		System.out.println("bb : " + bb.a); //3 , 필드는 Override가 안된다.
		//Override 는 메소드에서만 사용이 가능하다. 
		System.out.println();
		
//		BB cc = bb;	// cc에게 bb의 주소값을 전달한다. cc는 AA를 가리킨다. 
		//자식 = 부모 > error 자식 = (자식)부모 로 캐스팅 해주어야 한다.
		BB cc = (BB)bb;	// cc는 BB 를 가킨다. 
		cc.disp();
		System.out.println("cc : "+cc.a); //18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();	//8
		System.out.println("dd : "+dd.a);	//8
	}

}
