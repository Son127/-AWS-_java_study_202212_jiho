package j17_스태틱;

/*
 * 스태틱은 공유하는 영역
 * 클래스를 정의하면 공유하는게 딱 하나 생성된다.
 * 생성하지 않아도 
 *스태틱 메소드안에서는 스태틱 멤버변수만 사용가능 (지역변수도 사용가능하다) 
 *
 */

public class TestA {
	
	private static int num;
	
	static void setNum(int num) {
		TestA.num =num;
		
	}
	
	public static int getNum() {
		return num;
	}

}
