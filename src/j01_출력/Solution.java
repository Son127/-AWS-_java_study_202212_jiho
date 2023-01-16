package j01_출력;

import java.util.Scanner;

public class Solution {
	public class Main {

		public void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int x = 0;

			x = scanner.nextInt();

			if (x % 2 == 0 || x == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}

		}
	}
}