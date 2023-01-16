package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * .get이라는 메소드는 존재하지 않는다 key값이 없음
 */
public class SetStringMain {

	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>(); // Hash 값으로 정렬을 하는 방식.순서가 없다.똑같은 값이 하나만 들어간다.
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임나영");
		listStr.add("이가용");
		listStr.add("임나영");
		listStr.add("임나영");
		setStr.addAll(listStr); //중복제거
		
		System.out.println(listStr);
		
		setStr.add("이");
		setStr.add("함");
		setStr.add("사");
		setStr.add("오");

		System.out.println(setStr);
		String searchName = "사";

		for (String name : setStr) {
			if (name.equals(searchName)) {
				System.out.println(name);
			}

		}
		Iterator<String> iterator = setStr.iterator();
		while (iterator.hasNext()) {
			String n = iterator.next();
			if (n.equals(searchName)) {
				System.out.println(n);
			}
		}
	}
}
