package usermanagrment.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.xml.transform.stax.StAXSource;

import com.google.gson.JsonObject;

import usermanagrment.service.UserService;

public class UserManagementFrame extends JFrame {
	private List<JTextField> loginFields;
	private List<JTextField> registerFields;
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameTextField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameTextField;
	private JTextField registerEmailTextField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserManagementFrame() {

		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setForeground(new Color(0, 0, 0));
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);

		JPanel loginPanel = new JPanel();

		loginPanel.setForeground(new Color(0, 0, 0));
		loginPanel.setBackground(new Color(255, 255, 255));

		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);

		JLabel logoText = new JLabel("User Management");
		logoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(12, 46, 360, 55);
		loginPanel.add(logoText);

		JLabel loginText = new JLabel("Login");
		loginText.setFont(new Font("D2Coding", Font.BOLD, 20));
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setBounds(12, 93, 350, 43);
		loginPanel.add(loginText);

		usernameField = new JTextField();
		usernameField.setBounds(12, 185, 360, 27);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(12, 249, 360, 27);
		loginPanel.add(passwordField);

		JLabel usernameLabel = new JLabel("Username of email");
		usernameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		usernameLabel.setBounds(12, 160, 111, 15);
		loginPanel.add(usernameLabel);

		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		passwordLabel.setBounds(12, 224, 111, 15);
		loginPanel.add(passwordLabel);

		JButton loginButton = new JButton("Login");

		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject loginUser = new JsonObject();
				loginUser.addProperty("usernameAndEamil",usernameField.getText());
				loginUser.addProperty("password",passwordField.getText());
//				System.out.println(loginUser.toString());

				UserService service = UserService.getInstance();

				Map<String, String> response = service.authotize(loginUser.toString());

				if (response.containsKey("error")) {
					JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 16));
		loginButton.setBounds(12, 296, 360, 43);
		loginPanel.add(loginButton);

		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setBounds(45, 349, 185, 27);
		loginPanel.add(signupDesc);

		JLabel signupLink = new JLabel("sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override // 익명클래스
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel"); // show 보여주다(메인패널에서, 레지스터패널)
				clearFields(loginFields);
			}
		});
		signupLink.setHorizontalAlignment(SwingConstants.LEFT);
		signupLink.setForeground(new Color(0, 0, 255));
		signupLink.setBounds(242, 355, 93, 15);
		loginPanel.add(signupLink);

		JLabel forgotpasswordLink = new JLabel("Forgot your password?");
		forgotpasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotpasswordLink.setForeground(Color.BLUE);
		forgotpasswordLink.setBounds(55, 386, 280, 15);
		loginPanel.add(forgotpasswordLink);

		JPanel registrePanel = new JPanel();
		registrePanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registrePanel, "registerPanel");
		registrePanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("sign in");
		lblNewLabel.addMouseListener(new MouseAdapter() { // Adpter패턴
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel"); // 로그인패널로 돌아가기
				clearFields(registerFields);
			}
		});
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(299, 431, 73, 20);
		registrePanel.add(lblNewLabel);

		JLabel registerLogoText = new JLabel("User Management");
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerLogoText.setBounds(12, 46, 360, 55);
		registrePanel.add(registerLogoText);

		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerText.setBounds(12, 93, 350, 43);
		registrePanel.add(registerText);

		JLabel registerUsernameLabel = new JLabel("username");
		registerUsernameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerUsernameLabel.setBounds(12, 146, 111, 15);
		registrePanel.add(registerUsernameLabel);

		registerUsernameTextField = new JTextField();
		registerUsernameTextField.setColumns(10);
		registerUsernameTextField.setBounds(12, 159, 360, 27);
		registrePanel.add(registerUsernameTextField);

		JLabel reaisterPasswordLabel = new JLabel("password");
		reaisterPasswordLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		reaisterPasswordLabel.setBounds(12, 210, 111, 15);
		registrePanel.add(reaisterPasswordLabel);

		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(12, 222, 360, 27);
		registrePanel.add(registerPasswordField);

		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerNameLabel.setBounds(12, 272, 111, 15);
		registrePanel.add(registerNameLabel);

		registerNameTextField = new JTextField();
		registerNameTextField.setColumns(10);
		registerNameTextField.setBounds(12, 285, 360, 27);
		registrePanel.add(registerNameTextField);

		JLabel registerEamilLabel = new JLabel("email");
		registerEamilLabel.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerEamilLabel.setBounds(12, 334, 111, 15);
		registrePanel.add(registerEamilLabel);

		registerEmailTextField = new JTextField();
		registerEmailTextField.setColumns(10);
		registerEmailTextField.setBounds(12, 348, 360, 27);
		registrePanel.add(registerEmailTextField);

		JButton registreBtn = new JButton("Registre");
		registreBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameTextField.getText());
				userJson.addProperty("password",registerPasswordField.getText());
				userJson.addProperty("name", registerNameTextField.getText());
				userJson.addProperty("email", registerEmailTextField.getText());

				UserService userService = UserService.getInstance();

				Map<String, String> response = userService.register(userJson.toString());
				// key값안에 들어있는지
				if (response.containsKey("error")) {
					JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				mainCard.show(mainPanel, "loginPanel");
				clearFields(registerFields);
			}
		});
		registreBtn.setFont(new Font("D2Coding", Font.BOLD, 16));
		registreBtn.setBackground(Color.WHITE);
		registreBtn.setBounds(12, 385, 360, 43);
		registrePanel.add(registreBtn);

		loginFields.add(usernameField);
		loginFields.add(passwordField);

		registerFields.add(registerUsernameTextField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameTextField);
		registerFields.add(registerEmailTextField);
	}

	private void clearFields(List<JTextField> textFields) {
		for (JTextField field : textFields) {
			if (field.getText().isEmpty()) {
				continue;
			}
			field.setText("");
		}
	}

}
