package j25_소켓.multisocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import j25_소켓.multisocket.client.Client;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienReicive extends Thread {

	private final Socket socket;

	@Override
	public void run() {
		try {
			InputStream inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			while (true) {
					System.out.println(reader.readLine());
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
