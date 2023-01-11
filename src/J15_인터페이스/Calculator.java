package J15_인터페이스;
/*
interface는 무조건  abstract 클래스다.
interface는 생성이 안된다.
interface는  변수는 가질 수 없고 오로지 상수만 가질 수 있다.
어느한 대상을 만드는데 있어서 부속은 전부 인터페이스
*/
public interface Calculator {
//	interface는 오로지 상수만 가질수있어서 파이널을 생략할수있다.
	public int  ERROR = -999999;
	
	public double plus(double x , double y);
	
	public double minus(double x , double y);
	
//	default를 써주어야지만 일반 메소드를 사용할수있다.
	public default double multiplication(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y);
}
