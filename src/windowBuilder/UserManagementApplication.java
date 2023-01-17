package windowBuilder;

import java.awt.EventQueue;

import windowBuilder.view.frame.MainFrame;

public class UserManagementApplication {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		};
		//run메소드를 호출
		EventQueue.invokeLater(runnable);
	}

	/**
	 * Create the frame.
	 */
	
		
	
//		JPanel panel = new JPanel();
//		mainPanel.add(panel, "panelKey");

}
