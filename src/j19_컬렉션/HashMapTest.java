package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
//		map<? , Object> value 값으로 뭐든 들어갈수있다
		Map<String, Object> dataMap = new HashMap<>();
		
		dataMap.put("username", "aaa");
		dataMap.put("password", "123");
		dataMap.put("name", "가나다라");
		dataMap.put("email", "aaa@naver.com");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("골프");
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("헬스");
		
		dataMap.put("hobbys",hobby);//hobbys 키 에 list hobby 벨류
		
		System.out.println(dataMap);
//		타입이 Object 여서 값을 꺼내쓸려면 다운캐스팅을 해얗
		List<String> list = (List<String>) dataMap.get("hobbys");
		System.out.println(list.get(0));
	}
}
