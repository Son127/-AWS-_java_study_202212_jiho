package j19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListArrayMain {
	/** 
	 *CRUD
	 *
	 *C reate
	 *R ead
	 *U pDate
	 *D elete
	 */

	public static void main(String[] args) {
//		
		List<String> strList = new ArrayList<>();

		//  * 값추가
		strList.add("java");
		strList.add("python");
		System.out.println(strList);

		// 값을 원하는 위치에 추가하는 법
		strList.add(1, "android");
		System.out.println(strList);

		// * 해당 인덱스의 값을 추출
		System.out.println(strList.get(0));
		String s = strList.get(1);
		System.out.println(s);

		// * 리스트에 해당 값이 있는지 확인(T,F)
		System.out.println(strList.contains("c++"));
		System.out.println(strList.contains(s));

		// 값 수정
		strList.set(2, "javascript");
		System.out.println(strList);

		// * 값 삭제
		strList.remove(0);
		System.out.println(strList);
		strList.remove("android");
		System.out.println(strList);

		// * 리스트 크기 확인
		System.out.println(strList.size());

		// 리스트가 비엇는지 확인
		System.out.println(strList.isEmpty());

		// 리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());

		/********
		 * * 배열을 리스트로 변환 Arrays.asList(배열);
		 */
		String[] langs = { "java", "c++", "python", "javascript" };
		List<String> tempList = Arrays.asList(langs);
		strList.addAll(tempList);
		strList.addAll(2, tempList); // strList.addAll("인덱스",변수) 2번 인덱스부터 넣어라
		System.out.println(strList);

		// * 해당값의 위치 (index) 왼쪽부터 찾기
		int findIndexLeft = strList.indexOf("java");
		System.out.println(findIndexLeft);

		// * 해당값의 위치 오른쪽부터 찾기
		int findIndexRight = strList.lastIndexOf("java");
		System.out.println(findIndexRight);

		//////////////////////////////////////////////////////////
		// 중간에 있는 값 찾기
		strList.set(1, "java");
		System.out.println(strList);
		strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");
		System.out.println(strList);

		//////////////////////////////////////////////////////////

		// fromIndex 부터 toIndex 전까지 부분만 리스트 추출 (슬라이싱)
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);

		System.out.println();

//		==========<< 반 복 >>==========

		// 일반 반복문
		for (int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "] : " + strList.get(i));
		}
		System.out.println();

		// forEeach
		for (String str : strList) {
			System.out.println("[값] : " + str);
		}
		System.out.println();

		// 람다식 forEeach
		strList.forEach(str -> System.out.println("[값2] : " + str));
		;
		System.out.println();

		// 반복자(1회성)
		Iterator<String> iteraror = strList.iterator();
		while (iteraror.hasNext()) {
			String lang2 = iteraror.next();
			System.out.println("[값3] : " + lang2);
		}

	}

}
