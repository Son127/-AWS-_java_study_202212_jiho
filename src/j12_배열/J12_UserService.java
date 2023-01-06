package j12_배열;

import java.util.Scanner;

public class J12_UserService {

	private Scanner scanner; // 클래스를 만들때부터 스캐너가 생성 

//	public J12_UserService(Scanner scanner) {
//		this.Scanner.scanner 
//	}
	
	public J12_UserService() { // <- 이객체가 생성이 되야지만 스캐너가 생긴다.
		scanner = new Scanner(System.in);  
	}

	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		
		while(loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag =  mainMenu(select);
		}
	}
	public void stop(){
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료 중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("프로그램 종료");
	}
	
	private void showMainMenu() {
		System.out.println("========<< 메인 메뉴 >>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("===============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	private boolean mainMenu(char select) {
		boolean flag =true;
		
		if(isExit(select)) {
			flag = false;
		
		}else {
			if(select == '1') {
				
		}else if(select == '2') {
				
		}else if(select == '3') {
			
		}else if(select =='4') {
			
		}else {
			System.out.println(getSelectedErrormessage());
		}
		
	}	
	System.out.println();
	return flag;	
	}
	// 리펙터링 : 이전에 소스코드를 정리
	private boolean isExit(char select) {
	return select == 'q' || select =='Q';
	}
	
	private String getSelectedErrormessage() {
		return "잘못된 입력입니다. 다시 입력하세요.";
	}
	
	private char inputSelect(String menuName) {
		System.out.println(menuName + "메뉴 선택: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
		
	}

}
