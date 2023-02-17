package usermanagrment.server.controller;

import java.util.Map;

import usermanagrment.dto.ResponseDto;
import usermanagrment.entity.User;
import usermanagrment.service.UserService;

public class AccountController {
	
	private UserService userService;
	private static AccountController instance;

	private AccountController () {
		userService = UserService.getInstance();
	}
	
	public static AccountController getInstance() {
		//동기화, 스레드를 사용하면 synchronized를 무조건 써야함
			if(instance == null) {
				instance = new AccountController();
			}
		return instance;
	}
	
	
	public ResponseDto<?> register(String userJson){
		
		Map<String, String> resultMap = userService.register(userJson);
		
		if(resultMap.containsKey("error")) {
			return new ResponseDto<String>("error", resultMap.get("error"));
		}
		
		return new ResponseDto<String>("ok",resultMap.get("ok"));
	}
	
	
}
