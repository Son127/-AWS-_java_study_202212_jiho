package j06_조건;
/*
 *  switch 케이스는 출발 지점을 선택해서 그 밑으로 쭉 실행한다
 *  정지하고 싶으면 break를 걸어준다
 *  default 는 select 안에 찾아갈 case가 없으면 출력
 */
public class Switch1 {

	public static void main(String[] args) {
		
		String select = "B선택";
		
		switch (select) {
			case "A선택" :
				System.out.println("pc(A)를 연결합니다");
				break;
			case "B선택" :
				System.out.println("pc(B)를 연결합니다");
				break;
			case "C선택" :
				System.out.println("pc(C)를 연결합니다");
				break;
			case "D선택" :
				System.out.println("pc(D)를 연결합니다");
				break;
			default:
				System.out.println("else와 같은 역할");
		}
	}
}
