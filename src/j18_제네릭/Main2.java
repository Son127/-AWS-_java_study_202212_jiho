package j18_제네릭;

public class Main2 {
/*
 * ? 와일드 카드 제약
 * ? extends person : 펄슨을 상속받은 녀석들만 리턴할수있따.(대상 객체 하위)
 * ? super Student :  자기의 상위객체만 리턴이 가능하다 ( 대상 객체 상위)
 * ? == Object랑 같다.
*/ 
	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto) {// <?> 와일드 카드 : 어떠한 자료형도 들어올수있다.
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	} 

	public static void main(String[] args) {
		Main2 main2 = new Main2();

		CMRespDto<String> hello = new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score = new CMRespDto<Integer>(200, "성공", 85);

		
		 main2.reponse(hello);// ? 로 리턴을 하면 객체가 모호해진다.
		 main2.reponse(score);
		 
		System.out.println("hello");
		System.out.println(hello);
		System.out.println("score");
		System.out.println(score);
		// 안녕하세요.

	}

}
