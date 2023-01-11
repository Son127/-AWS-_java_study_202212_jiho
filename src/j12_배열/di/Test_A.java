package j12_배열.di;

public class Test_A {
//	컴파일시 무조건 생성이 된다. 그래서 생성자 안에서 생성을 해야한다.
//	private Test_B tb = new Test_B(); 
//	매개변수를 통해서 메인에서 a 한테 b를 주는 것
	
	private final Test_B tb; //중간에 셋터를 통해서 값을 바꾸면 안되는 것에는 final을 걸어준다.

	public Test_A(Test_B tb) { //생성자를 통해서 주는 방법 
		this.tb = tb;
	}
	
//	public void setTb(Test_B tb) {//셋터를 통해 주는 법
//		this.tb = tb;
//	}
//	
	public void testA1() {
		System.out.println("테스트 A1 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.tsetB1();
	}
	
	public void testA2() {
		System.out.println("테스트 A2 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		
		tb.tsetB1();
	}
}
