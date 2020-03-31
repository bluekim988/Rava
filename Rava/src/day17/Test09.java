package day17;
import java.util.*;
public class Test09 {

	public Test09() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("김가나", "010-8888-8888");
		map.put("오나다", "010-5555-1111");
		map.put("이라마", "010-2222-3333");
		map.put("박바마", "010-1111-2222");
		
		Set<String> keys = map.keySet();
		
		ArrayList<String> list = new ArrayList<String>(keys);
	
		for(String k : list) {
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println("-----------------------------");
		
		// Map.Entry를 사용해서 키와 벨류를 출력해보자.
		Set<Map.Entry<String, String>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, String>> itr = entry.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> comp = itr.next();
			System.out.println(comp.getKey() + " : " + comp.getValue());
		}
	}
	
	public static void main(String[] args) {
		new Test09();
	}

}
