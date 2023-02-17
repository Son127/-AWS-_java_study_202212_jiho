package usermanagrment.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import j25_소켓.multisocket.SocketServer;


public class UserManagmentServerApplication implements Runnable {

	private final static int PORT = 9090;
	private ServerSocket serverSocket;

	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("서버실행");
			socketConnection();
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				System.out.println("서버를 종료합니다.");
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private void  socketConnection() throws IOException {
		while(true) {
			Socket socket = serverSocket.accept(); //소켓 연결 기다림
			SocketServer socketServer = new SocketServer(socket); //스레드
			socketServer.start();
			
		}
	}

	public static void main(String[] args) {

		UserManagmentServerApplication application = new UserManagmentServerApplication();
		application.run();
	}

}
