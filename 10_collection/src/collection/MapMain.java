package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");	//Value 중복 허용 
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");	//Key 중복 허용 , 덮어쓰기 
		
		System.out.println(map.get("book101"));	//key값을 줘야한다
		System.out.println(map.get("book102"));	
		System.out.println(map.get("book501"));	//null
	
	}

}
