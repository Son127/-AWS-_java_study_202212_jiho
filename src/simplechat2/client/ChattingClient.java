package simplechat2.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import lombok.Data;
import lombok.Getter;
import simplechat2.dto.JoinReqDto;
import simplechat2.dto.MessageReqDto;
import simplechat2.dto.RequestDto;

@Getter
public class ChattingClient extends JFrame {
	private static ChattingClient instance;

	public static ChattingClient getInstance() {
		if (instance == null) {
			instance = new ChattingClient();
		}
		return instance;
	}

	private Gson gson;
	private Socket socket;
	private String username;

	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JTextField messageInput;
	private JList<String> userList;
	private DefaultListModel<String> userListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = ChattingClient.getInstance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ChattingClient() {
		gson = new Gson();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ipInput = new JTextField();
		ipInput.setText("127.0.0.1");
		ipInput.setBounds(337, 11, 97, 32);
		contentPane.add(ipInput);
		ipInput.setColumns(10);

		JButton connectButton = new JButton("??????");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null; // ????????? ????????? ?????? ?????? ?????????
				int port = 0; // ????????? ????????? ?????? ?????? ?????????

				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());


				try {

					socket = new Socket(ip, port); // client ??? server?????? serverSocket.accept(); ?????? ?????? ???
					connectButton.setEnabled(false);
					connectButton.removeMouseListener(this);

					JOptionPane.showMessageDialog(null,
							socket.getInetAddress().toString().replaceAll("/", "") + "?????? ??????", "????????????",
							JOptionPane.INFORMATION_MESSAGE);

					ClientRecive clientRecive = new ClientRecive(socket);
					clientRecive.start();
					

					username = JOptionPane.showInputDialog(null, "????????? ????????? ????????? ?????????.", "????????????",
							JOptionPane.INFORMATION_MESSAGE);
					JoinReqDto joinReqDto = new JoinReqDto(username);
					String joinReqDtoJson = gson.toJson(joinReqDto);
					RequestDto requestDto = new RequestDto("join", joinReqDtoJson);
					String requestDtoJson = gson.toJson(requestDto);

					OutputStream outputStream = socket.getOutputStream();
					PrintWriter out = new PrintWriter(outputStream, true);
					out.println(requestDtoJson);

					
					
				} catch (ConnectException e1) {
					connectButton.setEnabled(true); 
					JOptionPane.showMessageDialog(null, "?????? ?????? ??????", "????????????", JOptionPane.ERROR_MESSAGE);
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		connectButton.setBounds(501, 10, 65, 33);
		contentPane.add(connectButton);

		portInput = new JTextField();
		portInput.setText("9090");
		portInput.setBounds(446, 11, 43, 32);
		contentPane.add(portInput);
		portInput.setColumns(10);

		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(12, 10, 313, 358);
		contentPane.add(contentScroll);

		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);

		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(337, 53, 222, 315);
		contentPane.add(userListScroll);

		userListModel = new DefaultListModel<>();
		userList = new JList<String>(userListModel);
		userListScroll.setViewportView(userList);

		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(12, 378, 488, 23);
		contentPane.add(messageScroll);

		messageInput = new JTextField();
		messageInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!messageInput.getText().isBlank()) {
						sendMessage();
					}

				}

			}
		});
		messageScroll.setViewportView(messageInput);

		JButton sendButton = new JButton("??????");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!messageInput.getText().isBlank()) {
					sendMessage();
				}
			}
		});
		sendButton.setBounds(505, 378, 61, 23);
		contentPane.add(sendButton);
	}

	private void sendRequest(String resource, String body) {
		OutputStream outputStream;
		try {
			outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);

			RequestDto requestDto = new RequestDto(resource, body);

			out.println(gson.toJson(requestDto));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void sendMessage() {

		if (!messageInput.getText().isBlank()) {

			String toUser = userList.getSelectedIndex() == 0 ? "all" : userList.getSelectedValue();
			
			MessageReqDto messageReqDto = new MessageReqDto(toUser, username, messageInput.getText());

			sendRequest("sendMessage", gson.toJson(messageReqDto));
			messageInput.setText("");
		}
	}

}