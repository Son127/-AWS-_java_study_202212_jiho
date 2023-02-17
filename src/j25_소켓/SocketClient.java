package j25_소켓;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;
import com.google.protobuf.ByteString.Output;

import usermanagrment.dto.RequestDto;

public class SocketClient {


	public static void main(String[] args) {
		try {
										// ip 번호 , 포트번호
			Socket socket = new Socket("127.0.0.1", 9090);
			System.out.println("서버에 접속 성공");
			
			InputStream inputStream = socket.getInputStream();
			InputStreamReader streamReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(streamReader); 
			
//			System.out.println(reader.readLine());
			
			OutputStream outStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outStream, true);
			
			Gson gson = new Gson();
			RequestDto<String> dto = new RequestDto<String>("test","테스트 데이터");
			
			printWriter.println(gson.toJson(dto));
			
			
		} catch (UnknownHostException e) {// ip를 못잡았을때 나오는 오류
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
