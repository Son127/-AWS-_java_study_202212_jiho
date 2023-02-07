package j20_JSON.builder;

import lombok.Builder;
import lombok.Data;

@Data
public class User {

	private String username;
	private String password;
	private String name;
	private String email;

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	public User(String username2, String password2, String name2, String email2) {
		// TODO Auto-generated constructor stub
	}

	@Data
	public static class UserBuilder { // class 내부에 class 생성
		private String username;
		private String password;
		private String name;
		private String email;

		public UserBuilder username(String username) {
			this.username = username;
			return this;
		}
		public UserBuilder password(String password) {
			this.username = password;
			return this;
		}
		public UserBuilder name(String name) {
			this.username = name;
			return this;
		}
		public UserBuilder email(String email) {
			this.username = email;
			return this;
		}

		public User build() {
			return new User(username, password, name, email);
		}
	}

}
