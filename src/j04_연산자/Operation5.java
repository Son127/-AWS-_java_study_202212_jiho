package j04_연산자;

public class Operation5 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int result = num1 > num2 ? num1 * -1 : num2 * -1;
		
		System.out.println(result);
		
		int num = 79;
		
		int result2 = num / 90 == 1 ? 90 
				: num / 80 == 1 ? 80 
				: num / 70 == 1 ? 70 : 0; 
		// 콜론 : 을 기준으로 줄바꿈 해주는것이 좋다
		// 명령이 안끝났을때는 들여쓰기를 2번 해준다
		
		System.out.println(result2);
	}

}
