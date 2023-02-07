package j26_스레드;

public class ThreadTest {

	public static void main(String[] args) {

		LoopThread loopThread1 = new LoopThread("a");
		LoopThread loopThread2 = new LoopThread("b");
		LoopThread loopThread3 = new LoopThread("c");
		LoopThread loopThread4 = new LoopThread("d");

		loopThread1.setPriority(1);
		loopThread2.setPriority(3);
		loopThread3.setPriority(2);
		loopThread4.setPriority(1);
		System.out.println(loopThread1.getPriority());
		System.out.println(loopThread2.getPriority());
		System.out.println(loopThread3.getPriority());
		System.out.println(loopThread4.getPriority());

		loopThread1.start(); // start 호출되면 스레드가 실행된다.
		loopThread2.start();
		loopThread3.start();
		loopThread4.start();

		/*스레드
		 * 스레드의 우선순위는 모두 같다 숫자가 클수록 우선순위가 높다
		 */
	}
}
