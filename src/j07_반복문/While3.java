package j07_반복문;


import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String  select = null;
		
		while(true) {
			System.out.print("X입력시 멈춤: ");
			select = scanner.nextLine();
			                                        
			//equals 문자열 비교 연산
			if(select.equals("x") || select.equals("X")) {
				System.out.println("프로그램을 멈춥니다.");
				break;
			}
			System.out.println("계속실행");
			
		}
		System.out.println("프로그램 종료");
		
		


	}

}
