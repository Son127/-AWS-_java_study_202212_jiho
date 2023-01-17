package j21_에외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException {
	// 예외처리에 강제성을 줄려면 checked exception
	public static void printList(List<String> list, int size) throws IndexOutOfBoundsException { // Exception는 오류를 잡

		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] names = { "김수현", "이종현", "박성진", "김동민" };
		try {
//			throw new ClassCastException();
			printList(Arrays.asList(names), 5);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {// 예외가 터져도 실행 안터져도 실행 무조건 실행시킴 - 정상 종료는 안됨
			System.out.println("무조선 실행");
		}
		System.out.println("프로그램 정상 종료");
	}
}
