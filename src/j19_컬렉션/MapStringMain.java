package j19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapStringMain { //Map 하나하나의 값에는 엔트리가 들어간다
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("임","a");
		strMap.put("짅","b");
		strMap.put("김재","c");
		strMap.put("이","d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		for(String k: strMap.keySet()) {
			System.out.println(strMap.get(k));
			System.out.println(k);
		}
		
		for(String v : strMap.values()) { // value (값)만 바로 뽑아볼수있다
			System.out.println("value: " + v);
		}
		
		
		Set<Entry<String, String>> s = null; //
		
		for(Entry<String, String> e : strMap.entrySet()) {	// 한쌍을 셋으로 취급
			System.out.println(e);
			System.out.println("key: " + e.getKey());
			System.out.println("value: " + e.getValue());
			System.out.println();
		}
		
		strMap.forEach((k,v) -> { 
			System.out.println("key" + k);
			System.out.println("value" + v);
		});
	}

}
