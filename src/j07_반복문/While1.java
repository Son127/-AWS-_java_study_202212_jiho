package j07_반복문;

public class While1 {

	public static void main(String[] args) {
		
		// index : 순서가 있는 경우에 for문을 사용
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("------------------------------");
		
		
		// 순서보다 조건이 중요할 때 while문 사용
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

}
