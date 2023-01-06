package j07_반복문;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int total = 0;
		
		System.out.print("반복횟수: ");
		count = scanner.nextInt();
		System.out.println();
		
		for (int i = 0; i < count; i += 1) {
			// 반복문 안에 있는 변수는 한번 반복 할때마다 선언
			int a = 0; // 지역 변수로 for문 밖으로 빼서 변수를 줄일 필요는 없다 
			int b = 0;

			System.out.println(i + 1 + "번 반복");	
			System.out.print("a:");
			a = scanner.nextInt();
			
			System.out.print("b:");
			b = scanner.nextInt();
			
			System.out.println(i + 1 + "번 합: " + (a + b) + "\n" );	// \가 들어가는 모든 문자는 이스케이프 문자
			//System.out.println();
			
			total += (a + b);
		}
		
		System.out.println("총합" + total);
	}
}
