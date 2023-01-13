package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] { "java", "python", "c++" };
		String[] strArray1 = new String[strArray.length + 1];

		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i];
		}
		strArray1[strArray.length] = "html";

		System.out.println(strArray);
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println(strArray1);
		for (String str : strArray1) {
			System.out.println(str);

		}
		System.out.println();
//////////////////////////////////////////////////////////////////		
		ArrayList<Integer> strList = new ArrayList<>(); // 배열이랑 다르게 클래스 객체이다.
		strList.add(1);
		strList.add(2);
		strList.add(3);
		strList.add(4);
		strList.remove(0);
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i +"]: ");
			System.out.println(strList.get(i));
		}
		for(Integer str : strList) {
			System.out.println(str * 2);
		}
	}

}
