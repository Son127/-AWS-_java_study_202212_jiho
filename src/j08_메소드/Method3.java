package j08_메소드;

public class Method3 {
	
//	매개변수가 다르면 메소드 이름을 같이 쓸수있다
//	메소드 오버로딩 (오버로드) : 부를때 달라지는것 (return 이랑은 상관이 없다)
//	메소드 오버라이드 : 기존에 잇는것을 재정의 하는것
	
	public static void ov() {
		System.out.println("매개변수없음");
	}
	
	public static void ov(int a) {
		System.out.println("int 매개변수 하나.");
	}
	
	public static void ov(int a, String b) {
		System.out.println("int 먼저 그다음 String");
	}
	
	public static void ov(String a, int b) {
		System.out.println("String 먼저 그다음 int");
		
	}

	public static void main(String[] args) {
		ov();
		ov(10);
		ov(10,"asdf");
		ov("asdf",10);
		System.out.println();
	}

}
