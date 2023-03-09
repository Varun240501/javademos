package collectionsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapdemo {
	public static void main(String[] args) {
		
		Map<String,Integer> marks=new HashMap<>();
		marks.put("Bob",99);
		marks.put("Alex",91);
		marks.put("Spectre",88);
		marks.put("Ross",96);
		marks.put("Rachael",75);
		marks.put("Jessica",82);
		
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for(String key:marks.keySet()) {
			System.out.println(marks.get(key));
		}
		
		Map<String,Integer> marks2=new LinkedHashMap<>();
		marks2.put("Bob",99);
		marks2.put("Alex",91);
		marks2.put("Spectre",88);
		marks2.put("Ross",96);
		marks2.put("Rachael",75);
		marks2.put("Jessica",82);
		marks2.put(null,10);
		System.out.println(marks2);
	}
}
