package j25_소켓.multisocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer extends Thread {

	public static List<SocketServer> clientList = new ArrayList<>();
	
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private static int  autoIncrement = 1;
	private String name;

	public SocketServer(Socket socket) {
		this.socket = socket;
		name = "user" + autoIncrement++;
		
		clientList.add(this);
	}

	@Override
	public void run() {
		System.out.println("[연결된 클라이언트  정보]");
		System.out.println("IP: " + socket.getInetAddress()); // 실제 클라이언트 ip주소를 가져옴

		try {
			inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			outputStream = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			
			//브로드캐스팅 - 모든클라이언트에게 동시에 데이터를 보낼 때 사용
			sendToAll (name + " 님이 접속 하셨습니다.");
			
			while(true) {
				String message = reader.readLine();//메세지가 들어올때 까지 기다림
				if ( message == null) { // readerLine은 null 값이 있을수가 없ㄷ
					break;
				}
				sendToAll(message);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private  void sendToAll(String message) throws IOException {
		for(SocketServer socketServer : clientList) {
			outputStream = socketServer.socket.getOutputStream();
			PrintWriter writer =  new PrintWriter(outputStream, true);
			writer.println(name + " : " + message);
			
			
		}
	}

}


