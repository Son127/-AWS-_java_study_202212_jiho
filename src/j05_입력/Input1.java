package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //scanner import 하는법 : 컨트롤 + Shift (일괄적으로 한번에 처리하고 싶을때)*단어가 미완성이면 사용 x
										         //컨트롤 + 스페이스 (미완성일때 자동완성)
		
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		int input4 = 0;
		int input5 = 0; //변수 선언은 전부 위에 몰아둔다.
		
		System.out.print("입력1:");
		input1 = scanner.nextInt();
		System.out.print("입력2:");
		input2 = scanner.nextInt();
		System.out.print("입력3:");
		input3 = scanner.nextInt();
		System.out.print("입력4:");
		input4 = scanner.nextInt();
		System.out.print("입력5:");
		input5 = scanner.nextInt();
		
		System.out.println(input1 + input2 + input3 + input4 + input5 );
	}

}
