package member;

import java.io.Serializable;

public class MemberDTO implements Comparable<MemberDTO>, Serializable{
	private String name, phone, address;
	private int age;
	
	
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"\t"+age+"\t"+phone+"\t"+address;
	}

	@Override
	public int compareTo(MemberDTO m) {
		return name.compareTo(m.getName());
	}

}
