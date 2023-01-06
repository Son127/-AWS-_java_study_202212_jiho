package j06_조건;

public class Conditional1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		//1
		if(a > b) {
			System.out.println("a 가 b보다 큽니다.");
			System.out.println("a" + a);
		}else if(a < b) { 
			System.out.println("b 가 a보다 큽니다.");
			}else {
				System.out.println("a 와 b의 값이 같습니다.");
			}
		//2
		if(a > b) System.out.println("a 가 b보다 큽니다.");
		if(a < b) System.out.println("b 가 a보다 큽니다.");
		if(a == b) System.out.println("a 와 b의 값이 같습니다.");
		
		/*
		 *조건은 최대한 줄여야한다.
		 *조건 절 뒤에는 명령절이 들어온다
		 *else 뒤에 조건절이 들어올수 있다
		 *else는 혼자 쓸수없다. if가 항상 있어야한다.
		 *if뒤에 {} 묶어주면 명령을 여러개 쓸수있다. else도 같다
		 */
	}
	
	

}
	