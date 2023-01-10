package j01_출력;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		
		n = scanner.nextInt();
	
		for ( n = 2; n < 10; n++) {
			for (int j = 1; j < 10; j++) {
				int m = n * j;
				System.out.println(n + " * " + j + " = " + m);
			}
		System.out.println();
		}
	}
}