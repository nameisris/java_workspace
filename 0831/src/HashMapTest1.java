import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest1 {

	public static void main(String[] args) {
		// Map은 인터페이스이므로, new Map<>() 불가능
		Map<String, Integer> hmap = new HashMap<>();
		
		// 데이터 삽입(key, value)
		hmap.put("1001", 35);
		
		// key 존재 여부 확인
		if(hmap.containsKey("1001") == false) {
			hmap.put("1001", 40);
			// put 메서드이지만, 같은 key값이기에
			// 기존 key와 동일한 값에 put()을 하면, value의 값이 수정됨
		}
		
		hmap.put("1002", 20);
		hmap.put("1003", 33);
		hmap.put("1004", 27);
		
		// key로 value 조회
		Integer value = hmap.get("1001");
		System.out.println(value);
		
		System.out.println("===========");
		for(Integer n : hmap.values()) { // value 전체 목록 조회
			System.out.println(n);
		}
		
		System.out.println("===========");
		for(String k : hmap.keySet()) { // key 전체 목록 조회
			System.out.println(k);
		}
		
		System.out.println("===========");
		for(String k : hmap.keySet()) {			// key 전체 목록 조회를 이용하여
//			System.out.println(hmap.get(k));	// 해당 key의 value 값을 조회
			System.out.println(String.format("key: %s, value: %d", k, hmap.get(k)));	// 해당 key 값과, key에 해당하는 value 값 호출
		}
		

		hmap.remove("1004");
		// Entry 클래스가 Map 안에 들어가 있음
		// entrySet()을 통해 key와 value를 쌍으로 Set으로 반환받음
		System.out.println("===========");
		for(Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("key: %s, value: %d", entry.getKey(), entry.getValue()));
		}
		
	}
}
