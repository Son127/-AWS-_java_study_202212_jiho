package j07_반복문;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name ="김김";
		System.out.println(name.charAt(0)); // name 인덱스 0번째 글자를 가져온다
		
		boolean  loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("========<<식당>>========");
			System.out.println("1.김밥천국");
			System.out.println("2.탄탄면");
			System.out.println("3.홍대개미");
			System.out.println("4.밥앤밥");			
			System.out.println("========================");
			System.out.println("q.프로그램 종료");
			System.out.println("========================");

			System.out.println("식상 선택: ");
			select = scanner.next().charAt(0);
			
			if (select == 'q' || select == 'Q') {
				loopFlag1 = false;
			}else if (select == '1') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				System.out.println("========<<김밥천국 메뉴>>========");
				System.out.println("1.라면");
				System.out.println("2.돌솥비빔밥");
				System.out.println("3.오므라이스");
				System.out.println("4.김치볶음밥");			
				System.out.println("========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("========================");

				System.out.println("메뉴 번호 선택: ");
				select = scanner.next().charAt(0);
				
				if(select == 'b') {
					loopFlag2 = false; 
				}else if (select == 'q' || select == 'Q'){
					loopFlag1 = false;
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("라면을 선택했습니다.");
				}else if (select == '2') {
					System.out.println("돌솥비빔밥을 선택했습니다.");
				}else {
					System.out.println();
					System.out.println("xxxxxxxxxxxxxxxxxx");
					System.out.println("사용할수 없는 번호입니다.");
					System.out.println("다시 입력");
					System.out.println("xxxxxxxxxxxxxxxxxx");
				}
				System.out.println();
				}
			}else if (select == '2') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
				System.out.println("========<<탄탄면 메뉴>>========");
				System.out.println("1.탄탄면");
				System.out.println("2.탄탄면 2");
				System.out.println("3.탄탄면 3");
				System.out.println("4.탄탄면 4");			
				System.out.println("========================");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("========================");
				
				System.out.print("메뉴번호 선택: ");
				select = scanner.next().charAt(0);
				
				if (select == 'b' || select == 'B') {
					loopFlag2 = false; 
				}else if (select == 'q' || select == 'Q') {
					loopFlag1 = false;
					loopFlag2 = false;
				}else if (select == '1') {
					System.out.println("탄탄면을 선택");
				}else if (select == '2') {
					System.out.println("탄탄면2 선택");
				}else if (select == '3') {
					System.out.println("탄탄면3 선택");
				}else if (select == '4') {
					System.out.println("탄탄면4 선택");
				}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxx");
				System.out.println("사용할수 없는 번호입니다.");
				System.out.println("다시 입력");
				System.out.println("xxxxxxxxxxxxxxxxxx");
				}
				System.out.println();
				}		
			}else if (select == '3') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					System.out.println("========<<홍대개미 메뉴>>========");
					System.out.println("1.일개미");
					System.out.println("2.여왕개미");
					System.out.println("3.붉은개미");
					System.out.println("4.흰개미");			
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");

					System.out.println("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						break;
					}else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("일개미 선택 ");
					}
				}
							
			}else if (select == '4') {
			
			}else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxx");
				System.out.println("사용할수 없는 번호입니다.");
				System.out.println("다시 입력");
				System.out.println("xxxxxxxxxxxxxxxxxx");
			}
				
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
