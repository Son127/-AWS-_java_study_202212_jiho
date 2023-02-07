package j25_소켓.multisocket.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import j25_소켓.multisocket.ClienReicive;

public class Client {
	
	public static String name;
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",9090);
			System.out.println("서버에 접속함?");
			
			ClienReicive clienReicive = new ClienReicive(socket);
			clienReicive.start();
			
			ClientSend clientSend = new ClientSend(socket);
			clientSend.start();
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
