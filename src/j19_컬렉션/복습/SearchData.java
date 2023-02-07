package j19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;

public class SearchData {
	
	public static void main(String[] args) {
//		Map은 순서가 없다
		Map<String, Object> searchData = new HashMap<>();
		
		searchData.put("category", "소설");
		searchData.put("searchValue", "불편한 편의점");
//	key,value 출력 {}
		System.out.println(searchData);
// key값만 출력	[]		
		System.out.println(searchData.get("category"));
//key,Values 따로 출력 []
		System.out.println(searchData.keySet());
		System.out.println(searchData.values());
//key,values 대괄호로 출력 [] 
		System.out.println(searchData.entrySet());
//괄호가 대괄호인것들은 반복이 가능하다
//		for(int i = 0; i < searchData.size(); i++) { 인덱스로는 반복 불가능
//			System.out.println(searchData.get(null));
//		}
	
		for(String key : searchData.keySet()) {
			System.out.println(searchData.get(key));
		}
	}

}
