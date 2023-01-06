package j05_입력;

import java.util.Scanner;

public class Intput3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //(System) 운영체제를 뜻함
		
		String name = null;
		int age = 0;
		String ad = null;
		String ph = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소: ");
		ad = scanner.nextLine();
		
		System.out.print("연락처: ");
		ph = scanner.next();
		
		System.out.println("사용자의 이름은 " +  name + "이고" + "나이는" + age + "살 입니다." );
		System.out.println("주소는 " + ad + " 에 거주중입니다.");
		System.out.println("연락처는" + ph + "입니다.");
		
		/*
		 * 키보드 입력은 전부 버퍼로 취급한다.
		 * next는 스페이스랑 엔터를 무시함
		 * next 다음 nextLine을 사용 할 경우 그 사이에 line을 한번 버려줘야한다.
		 * 
		 */
		
	}
}
