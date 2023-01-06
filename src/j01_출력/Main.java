package j01_출력;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		
		h = scanner.nextInt();
		m = scanner.nextInt();
		
		if(m < 46) {
			h = h - 1;
			m = (m - 45) + 60;
		}else {
			m = m - 45;
		}
		if(h < 0 || h == 0) {
			h = h + 24;
			m = (m - 45) + 60;
		}
		System.out.println(h + " " + m);
	}
}
