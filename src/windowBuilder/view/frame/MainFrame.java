package windowBuilder.view.frame;

import javax.swing.JFrame;

import windowBuilder.view.panel.MainPanel;

public class MainFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public MainFrame() { // 생성자

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);// (x , y , 넓이, 높이)

		MainPanel mainPanel = MainPanel.getInstance();
		mainPanel.init();
		setContentPane(mainPanel);
	
	}
}
