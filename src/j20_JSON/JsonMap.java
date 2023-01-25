package j20_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import j20_JSON.builder.User;

public class JsonMap {

	public static void main(String[] args) {
		Gson gson = new Gson();

		gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

		Map<String, Object> user = new HashMap<String, Object>();
		user.put("username", "aaa");
		user.put("password", "12354");

		String userJson = gson.toJson(user);
		System.out.println(user); // map
		System.out.println(userJson); // json으로 변환된것

		Map<String, Object> userMap = gson.fromJson(userJson, Map.class); // json을 맵으로
		User userObj = gson.fromJson(userJson, User.class);
		System.out.println(userMap);
		System.out.println(userObj);

		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("test1", "aaa");
		jsonObject.addProperty("test2", "bbb");
		jsonObject.addProperty("test3", "ccc");
		jsonObject.addProperty("test4", "ddd");
		
		String jsonString = jsonObject.toString();
		System.out.println(jsonString);
	}

}
