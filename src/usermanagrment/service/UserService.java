package usermanagrment.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.relation.Role;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagrment.entity.RoleDtl;
import usermanagrment.entity.User;
import usermanagrment.repository.UserRepository;
import usermanagrment.repository.UserRepositoryArratList;

public class UserService {

	private final UserRepository userRepository;
	private Gson gson;

	private static UserService instance;

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	private UserService() {
		userRepository = UserRepository.getIntance();
		gson = new GsonBuilder().setPrettyPrinting().create();
	}

	public Map<String, String> register(String userJson) {
		// respons : 응답
		Map<String, String> response = new HashMap<>();

		Map<String, String> userMap = gson.fromJson(userJson, Map.class);

		for (Entry<String, String> userEntry : userMap.entrySet()) { // Map에는 하나의 key와 value를 묶어서 Entry라 한다.
			if (userEntry.getValue().isBlank()) {// isBlank는 공백을 허용 안함
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		User user = gson.fromJson(userJson, User.class);
		System.out.println("서비스에 넘어옴! user  객체로 변환");
		System.out.println(user);
		// 중복확인
		if (duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름 입니다.");
			return response;
		}
		if (duplicatedEmail(user.getEmail())) {
			response.put("error", "이미 사용중인 이메일 입니다.");
			return response;
		}
//		String pw = BCrypt.hashpw("1234", BCrypt.gensalt());
//		System.out.println(pw);
//		System.out.println(BCrypt.checkpw("1234",pw)); 
//		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));

		userRepository.saveUser(user);
		
		System.out.println("암호화 후 ");
		System.out.println(user);
		
		RoleDtl	roleDtl = RoleDtl.builder()
				.roleId(3)
				.userId(user.getUserId())
				.build();
				
		userRepository.saveRoleDtl(roleDtl);
		
		response.put("ok", "회원가입 성공");

		return response;

	}

	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) != null;
	}

	private boolean duplicatedEmail(String email) {
		return userRepository.findUserByEmail(email) != null;
	}

	public Map<String, String> authotize(String loginUserJSon) {
		Map<String, String> loginUser = gson.fromJson(loginUserJSon, Map.class);
		Map<String, String> response = new HashMap<>();

		for (Entry<String, String> entry : loginUser.entrySet()) {
			if (entry.getValue().isBlank()) {
				response.put("error", entry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		String usernameAndEmail = loginUser.get("usernameAndEamil");
		User user = userRepository.findUserByUsername(usernameAndEmail);

		if (user == null) {
			
			user = userRepository.findUserByEmail(usernameAndEmail);
			
			
			if (user == null) {
				response.put("error", "사용자 정보를 확인해주세요");
				return response;
			}
		}
		if (!BCrypt.checkpw(loginUser.get("password"), user.getPassword())) {
			response.put("error", "사용자 정보를 확인해주세요");
			return response;
		}

		response.put("ok", user.getName() + "님 환영합니다.");
		return response;
	}
}

//	private boolean isBlank(User user) {
//		
//	}
