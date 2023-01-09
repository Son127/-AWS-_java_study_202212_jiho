package j12_배열;

import java.util.Scanner;

public class J12_UserService {

	private Scanner scanner; // 클래스를 만들때부터 스캐너가 생성 
	private J12_UserRepository userRepository;

//	}
//  이객체가 생성이 되야지만 스캐너가 생긴다.

	public J12_UserService(J12_UserRepository userRepository) { 
		scanner = new Scanner(System.in); 
		this.userRepository = userRepository;
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
//	
	private void showUsers() {
		J12_User[] users = userRepository.getUserTable();
		
		System.out.println("========<<회원 전체 조회>>========");
		
		for(J12_User user : users) {
			System.out.println(user.toString());
		}
		
	}
	
	private  void registerUser() {
		J12_User user = new J12_User();
		
		System.out.println("========<<회원 등록>>========");
		System.out.println("사용자 이름 : ");
		user.setUsername(scanner.nextLine());
		
		System.out.println("비밀번호 : ");
		user.setPassword(scanner.nextLine());
		
		System.out.println("성명 : ");
		user.setName(scanner.nextLine());
		
		System.out.println("이메일 : ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user);
	}

	private void findUser() {
		J12_User users = userRepository.findUserByUsername(null);
		System.out.println("사용자 이름 : ");
		users.setUsername(scanner.nextLine());
		
		
	}
	
	
	private boolean mainMenu(char select) {
		boolean flag =true;
		
		if(isExit(select)) {
			flag = false;
		
		}else {
			if(select == '1') {
				showUsers();
		}else if(select == '2') {
				registerUser();
		}else if(select == '3') {
				findUser();
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
