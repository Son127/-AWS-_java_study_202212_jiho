package j21_에외;

public class CustomExceptionMain {
	
	public static void main(String[] args) {

//		throw new IndexOutOfBoundsException("인덱스를 초과함"); // 예외에 메세지를 줄수있다.
		try{
			throw new CustomErrorException("뭔가 문제가 있음");
		}catch (Exception e) {
			// TODO: handle exception
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("프로그램 종료");
	}

}
