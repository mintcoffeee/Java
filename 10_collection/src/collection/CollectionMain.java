package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	
	@SuppressWarnings("all")	//어노테이션, 억제 : 좋은건 아니다.
	public static void main(String[] args) {
		Collection coll = new ArrayList<>();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");	//중복 허용, 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		//노란밑줄 : warning error 틀린거는 아니지만 수정하는게 좋다. 
		//모든 type이 다 들어와서 불안하다 generic '<>' 을 걸어라 
		Iterator it = coll.iterator();
//		it.hasnext(); -> 항목이 있냐? (true), 없으면 (false)
//		it.next() -> 항목을 꺼내고 다음 항목으로 이동 
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while 
	}

}
