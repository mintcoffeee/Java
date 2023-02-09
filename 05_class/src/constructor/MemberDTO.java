package constructor;

public class MemberDTO { // 1 인분 
	private String name;
	private int age;
	private String phone;
	private String address;
	
	
	//생성자를 통해서 데이터 4개를 받아온다.
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

//D : Data
//T : Transfer
//O : Object

//MemberVO
//V : Value
//O : Object