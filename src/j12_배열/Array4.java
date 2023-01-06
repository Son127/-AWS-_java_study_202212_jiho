package j12_배열;

public class Array4 {
	public static void main(String[] args) {
		J12_User[] users = new J12_User[3];
		
		J12_User[] users2 = new J12_User[] { 
				new J12_User("aaa", "1234", "떄얘ㅒㅇ", "A@email.com"),
				new J12_User("bbb", "4567", "ㅃ얘ㅒㅇ", "ㅠ@email.com"),
				new J12_User("ccc", "891011", "ㄲ얘ㅒㅇ", "ㅊㅍ@email.com") };

		J12_User[] users3 = { 
				new J12_User("aaa", "1234", "떄얘ㅒㅇ", "A@email.com"),
				new J12_User("bbb", "4567", "ㅃ얘ㅒㅇ", "ㅠ@email.com"),
				new J12_User("ccc", "891011", "ㄲ얘ㅒㅇ", "ㅊㅍ@email.com") };

		users[0] = new J12_User("aaa", "1234", "떄얘ㅒㅇ", "A@email.com");
		users[1] = new J12_User("bbb", "4567", "ㅃ얘ㅒㅇ", "ㅠ@email.com");
		users[2] = new J12_User("ccc", "891011", "ㄲ얘ㅒㅇ", "ㅊㅍ@email.com");

		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}

	}

}
