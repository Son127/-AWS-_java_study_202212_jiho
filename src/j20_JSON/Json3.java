package j20_JSON;

import com.google.gson.Gson;

public class Json3 {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		gson.toJson(null); //object를  json으로 바꿈
		gson.fromJson(" ", Object.class); // json을 object로 바꿈
	}

}

// 문자열을 정수로 변환시켜 연산
//		System.out.println(Integer.valueOf("100") + 50);
//		System.out.println(Integer.parseInt ("100") + 50);