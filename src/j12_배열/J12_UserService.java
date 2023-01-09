package j12_배열;

import java.util.Scanner;

import javax.xml.transform.stax.StAXSource;

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

	private J12_User verifUsername() {
		String username = null;
		System.out.println("ㅅㅇㅈㅇㄹ");
		username = scanner.nextLine();
		return userRepository.findUserByUsername(username);
	}
	
	
	private void showUser () {                                                                                                                                                
		J12_User user = null;
		
		System.out.println("회원조회");
		user = verifUsername();
		
		if(user == null) {
			System.out.println("없음");
			return;
		}
		
		System.out.println(user.toString());
		
	}
	
	private void updateUser() {
		J12_User user = verifUsername();
		if(user == null) {
			System.out.println("없는 이름입;니ㅏㄷㅇ.");
			return;
		}
		boolean loopFlag = true;
		char select = '\0';
		
		while(loopFlag) {
			showUpdateMenu(user);
			select = inputSelect("수정");
			loopFlag = updateUser(user, select);
		}
	}
	private void showUpdateMenu(J12_User user) {
		System.out.println("수정메뉴");
		System.out.println("사용자 이름 :" + user.getUsername());
		System.out.println();
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 이름 변경");
		System.out.println("3. 이메일 변경");
		System.out.println("b. 뒤로가기");
		System.out.println();
	}
	private void updataPassword(J12_User user) {
		String oldPassword = null;
		String newPassword = null;
		String cofirmPassword = null;
		
		System.out.println("비번변경");
		
		System.out.println( "기존 비번 입력: ");
		
		if(!comparPassword(user.getPassword(), oldPassword)) {
			System.out.println("비번 일치 안함");
			return;
		}
		System.out.println("새비번 입력:");
		newPassword = scanner.nextLine();
		System.out.println("새 비번 확인");
		cofirmPassword = scanner.nextLine();
		
		if(!comparPassword(newPassword, cofirmPassword)) {
			System.out.println("새비번 일치 안함");
			return;
		}
		user.setPassword(newPassword);
		System.out.println("비밀번호 변경완료");
		
	}
	
	private void updatePassWord(J12_User user) {
		
	}
	private boolean comparPassword(String perPassword, String nextPassword) {
		return prePassword.equals
	}
	
	private boolean updateMenu(J12_User user, char select) {
		boolean flag =true;
		
		if(isBack(select)) {
			flag = false;
			
		}else {
			if(select == '1') {
				updatePassWord(user);
			}else if(select == '2') {
				
			}else if(select == '3') {
				
			}else if(select == '4') {
			
			}else {
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
				
		}else if(select == '4') {
			
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
