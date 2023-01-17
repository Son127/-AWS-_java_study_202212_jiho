package j21_에외;

public class CustomErrorException extends RuntimeException {// 예외를 커스텀 할때 런타임을 상속 받는다.
	
	public CustomErrorException() {
		System.out.println("내가 만든 예외");
	}

	public CustomErrorException(String message) {
		super(message);
	}
}
