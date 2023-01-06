package j07_반복문;

import java.util.Scanner;

/*
 * 
 */
public class Loop1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNumber =  0;
		int endNumber = 0;
		int total = 0;
		
		System.out.print("시작: ");
		startNumber = scanner.nextInt();
		
		System.out.print("끝: ");
		endNumber = scanner.nextInt();
		
		for (int i = 0; i < endNumber - startNumber + 1; i++) {
			total += startNumber + i;
		}
		System.out.println(total);
		
		
	}
}
