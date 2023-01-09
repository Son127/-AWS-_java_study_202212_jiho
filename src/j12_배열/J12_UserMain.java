package j12_배열;

public class J12_UserMain {
	public static void main(String[] args) {
	J12_User[] user = new J12_User[0];
	J12_User[] user2 = new J12_User[100];

	J12_UserRepository userRepository = new J12_UserRepository(user);	
	J12_UserRepository userRepository2 = new J12_UserRepository(user2);
	
	J12_UserService service = new J12_UserService(userRepository);
	
	service.run();
	service.stop();
}
}
//카피를 할 때 프로그램 시작점으로 가서 연결이 어떻게 일어나는지 봐야함