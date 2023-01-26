package usermanagrment.repository;

import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import usermanagrment.entity.User;

public class UserRepositoryArratList { //db 유저관련 정보 저장소


	private static UserRepositoryArratList instance;
	private List<User> userDataList;

	public static UserRepositoryArratList getInstance() {
		if (instance == null) {
			instance = new UserRepositoryArratList();
		}
		return instance;
	}

	private UserRepositoryArratList() {
		userDataList = new ArrayList<>();
		userDataList.add(User.builder()
				.username("aaaa")
				.password(BCrypt.hashpw("1234",BCrypt.gensalt()))
				.name("손지호")
				.email("asd@gmail.com")
				.build());
	}

	public void saveUser(User user) {
		userDataList.add(user);
	}

	public User findUserByUsername(String username) {
		User user = null;

		for (User u : userDataList) {
			if (u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		return user;
	}

	public User findUserByEamil(String email) {
		User user = null;

		for (User u : userDataList) {
			if (u.getEmail().equals(email)) {
				user = u;
				break;
			}
		}
		return user;
	}

}