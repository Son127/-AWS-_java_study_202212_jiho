package j20_JSON.builder;

public class UserMain {

	public static void main(String[] args) {

//		User user = new User();
		User.UserBuilder userBuilder = new User.UserBuilder(); // User클래스 안에 있는 UserBuilder을 생성

		User user2 = User.builder()
				.username("aaa")
				.password("1234")
				.build();

		System.out.println(user2);

	}

}
