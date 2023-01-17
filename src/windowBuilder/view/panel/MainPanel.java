package windowBuilder.view.panel;

import java.awt.CardLayout;

import lombok.Data;

@Data
public class MainPanel extends InitPanel {// 어떠한 객체에서 전부다 접근이 가능한 객체여야한다.

	private static final long serialVersionUID = 1L; // 직렬화에 사용

	private CardLayout mainCard;
	private static MainPanel instance;

	public static MainPanel getInstance() {
		if (instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}

	public MainPanel() {
		mainCard = new CardLayout();
		setLayout(mainCard);

	}

	public void init() {

		LoginPanel loginpanel = new LoginPanel();
		add(loginpanel, "loginPanel");

		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
	}
}