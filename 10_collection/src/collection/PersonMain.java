package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 30);
		PersonDTO cc = new PersonDTO("라이언", 40);
		
		ArrayList<PersonDTO> ar = new ArrayList<PersonDTO>();
		ar.add(aa);
		ar.add(bb);
		ar.add(cc);
		return ar;
	}
	
	public static void main(String[] args) {
		PersonMain p = new PersonMain();
//		for(int i=0; i<p.init().size();i++) {
//			System.out.println(p.init().get(i).getName() + "\t" 
//								+ p.init().get(i).getAge() );
//		}
		
		ArrayList<PersonDTO> list = p.init();
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" 
								+ personDTO.getAge() );
		}
		System.out.println();
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		
	}

}
