package j08_메소드;
/*
 * 매개변수는 1개일수도 여러개일수도 없을수도잇따.
 * void는 반환이 없다.
 * 호이스팅 : 코드를 위에서부터 아래로 분석을 먼저한다.
 * 클래스는 메소드를 정의하는게 1번 메인에서 실행하는게 2번 
 * JAva는 함수를 위에서 선언해도 메인문 아래에 선언해도 상관없다.
 * 반환은 여러개를 할수없다.
 * 
 * java에서는 일반 함수가 없다. 전부 메소드
 * 클래스안에서 정의한 함수는 메소드, 클래스 밖에서 정의한 함수는 일반 함수 , 펑션 이라 부른다.
 */
public class Method2 {
	
	//매개변수: x, 반환 : x
	public static void method1() {
		System.out.println("단순실행");
}
	//매개변수: int하나입력 , 반환은 없음
	public static void method2(int num) {
		System.out.println("num: " + num);
	}
	//매개변수: int두개 입력, 반환x
	public static void method3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println();
	}
	//반환하는거에 형식을 잡아줘야한다
	public static String method4() {
		return "데이터 반환";
	}
	
	public static String method5(int age) {
		return age + "살";
	}
	
	public static void main(String[] args) {
		method1(); // 함수 호출
		method2(100);
		method3(200, 300);
		System.out.println(method4());
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		System.out.println();
		
		System.out.println(method5(30));
	}

}
