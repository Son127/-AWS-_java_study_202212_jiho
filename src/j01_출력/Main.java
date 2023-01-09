package j01_출력;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		
		h = scanner.nextInt();
		m = scanner.nextInt();
		
		 if(m < 45) {
			h--;
			m = (m - 45) + 60;	 	
			if(h < 0) {
				h = 23;
		 }System.out.println(h + " " + m);
		 }
		 else {
			 m-=45;
			 System.out.println(h + " " + m);
		 }
	}
}