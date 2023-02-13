package abstract_;

public abstract class AbstractTest {	//POJO(Plain Old Java Object) : 가장 기본 Object다.
	protected String name;	// 생성자를 통해서 data를 넣거나 setter로 넣어준다.

	public AbstractTest() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractTest(String name) {
		super();
		this.name = name;
	}


	public String getName() {	//구현
		return name;
	}

	public abstract void setName(String name);	//추상메소드 
}
