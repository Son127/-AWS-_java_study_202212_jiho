package simplechat2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import com.google.gson.Gson;
import com.google.protobuf.Message;

import lombok.Data;
import simplechat2.dto.JoinReqDto;
import simplechat2.dto.JoinRespDto;
import simplechat2.dto.MessageReqDto;
import simplechat2.dto.MessageRespDto;
import simplechat2.dto.RequestDto;
import simplechat2.dto.ResponseDto;

@Data
class ConnectedSocket extends Thread {

	private static List<ConnectedSocket> socketList = new ArrayList<>();
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;

	private String username;

	public ConnectedSocket(Socket socket) {
		this.socket = socket;
		gson = new Gson();
		socketList.add(this);
	}

	@Override
	public void run() {
		try {
			inputStream = socket.getInputStream(); // 들어올 문을 열어줌
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				String request = in.readLine(); // requestDto(json형태로 들어옴)
				RequestDto requestDto = gson.fromJson(request, RequestDto.class);

				switch (requestDto.getResource()) {
					case "join": 
						JoinReqDto joinReqDto = gson.fromJson(requestDto.getBody(), JoinReqDto.class);
						username = joinReqDto.getUsername();
						List<String> connectedUsers = new ArrayList<>();
					
						for (ConnectedSocket connectedSocket : socketList) {
							connectedUsers.add(connectedSocket.getUsername());
						}
						JoinRespDto joinRespDto = new JoinRespDto(username + "님이 접속하셨습니다.",connectedUsers);
					
						sendToAll(requestDto.getResource(),"ok", gson.toJson(joinRespDto)) ;
						break;
					case "sendMessage":
						MessageReqDto messageReqDto = gson.fromJson(requestDto.getBody(), MessageReqDto.class);
					
						if(messageReqDto.getToUser().equalsIgnoreCase("all")) {
							String message = messageReqDto.getFromUser() + "[전체]: " + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
						sendToAll(requestDto.getResource(),"ok",gson.toJson(messageRespDto));
						}else {
							String message = messageReqDto.getFromUser() + "[" +  messageReqDto.getToUser() + "]: " + messageReqDto.getMessageValue();
							MessageRespDto messageRespDto = new MessageRespDto(message);
							sendToUser(requestDto.getResource(),"ok",gson.toJson(messageRespDto),messageReqDto.getToUser() );
						
					}
				}
			}

		} catch (IOException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void sendToAll(String resource, String status, String body) throws IOException {
		ResponseDto responseDto = new ResponseDto(resource, status, body);
		for(ConnectedSocket connectedSocket : socketList) {
			OutputStream outputStream = connectedSocket.getSocket().getOutputStream();
			PrintWriter out = new PrintWriter(outputStream,true);
			
			out.println(gson.toJson(responseDto));
		}
		
	}
	
	private void sendToUser(String resource, String status, String body, String toUser) throws IOException {
		ResponseDto responseDto = new  ResponseDto(resource, status, body);
		
		for (ConnectedSocket connectedSocket : socketList) {
			
			if(connectedSocket.getUsername().equals(toUser) || connectedSocket.getUsername().equals(username)) {
				OutputStream outputStream = connectedSocket.getSocket().getOutputStream();
				PrintWriter out = new PrintWriter(outputStream,true);
				
				out.println(gson.toJson(responseDto));
			}
		}
	}
	
	
}

public class ServerApplication {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("====<<< 서버 실행 >>>====");

			while (true) {
				Socket socket = serverSocket.accept(); // 클라이언트의 접속을 기다리는 녀석 // 연결버튼 누를때 까지
				ConnectedSocket connectedSocket = new ConnectedSocket(socket);
				connectedSocket.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("====<<< 서버 종료 >>>====");

		}
	}

}
