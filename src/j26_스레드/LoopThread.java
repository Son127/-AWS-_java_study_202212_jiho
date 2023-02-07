package j26_스레드;

public class LoopThread extends Thread {
	
	private String theradName;
	
	public LoopThread(String theradName) {
		this.theradName = theradName;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(theradName + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
