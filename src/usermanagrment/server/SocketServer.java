package usermanagrment.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.stax.StAXSource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagrment.dto.RequestDto;
import usermanagrment.dto.ResponseDto;
import usermanagrment.entity.User;
import usermanagrment.server.controller.AccountController;

public class SocketServer extends Thread {
	private static List<SocketServer> socketServertList = new ArrayList<>();

	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;

	public SocketServer(Socket socket) {
		this.socket = socket;
		gson = new Gson();
		socketServertList.add(this);
	}

	@Override
	public void run() {
		try {
			recivrRequest();

		} catch (IOException e) {
			System.out.println(socket.getInetAddress() + ":" + socket.getPort() + "클라이언트의 접속이 끊어졌습니다.");

		}

	}

	private void recivrRequest() throws IOException {
		inputStream = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		while (true) {
			String request = reader.readLine(); // readLine- 클라이언트로부터 데이터를 받음 
			if (request == null) {
				throw new ConnectException();
			}
			RequestMapping(request);
		}

	}

	private void RequestMapping(String request) throws IOException {
		RequestDto<?> requestDto = gson.fromJson(request, RequestDto.class);
		String resource = requestDto.getResource();

		switch (resource) {
			
			case "register":
				ResponseDto<?> responseDto =
						AccountController.getInstance().register((String)requestDto.getBody());
				sendResponse(responseDto);
				break;
			default:
				System.out.println("해당 요청은 처리할 수 없습니다.(404)");
				break;
		}

	}
	
	private void sendResponse(ResponseDto<?> responseDto) throws IOException {
		String response = gson.toJson(responseDto);
		outputStream = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(outputStream, true);
		writer.println(response);
		writer.flush();
		
		
	}

}
