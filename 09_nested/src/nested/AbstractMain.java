package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {// 키다리 아저씨 
			
			public void setName(String name) {// 메소드 구현 
				this.name = name;
			}
			
		};//익명 inner class, 키다리 아저씨, 한번 쓰고버림 
		
		InterA in = new InterA() {	 //interface 는 new 안된다. -> 키다리 아저씨 사용 
			public void aa() {}	
			public void bb() {}	
		};	// 한번 쓰고 버림
		
		AbstractExam ae = new AbstractExam() {
		//추상 클래스 이지만 추상 메소드가 없다. 원하는 메소드를 Override 한다. 
			
		};
	}
}
