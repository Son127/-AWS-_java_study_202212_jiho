package J15_인터페이스;

public class SmartPhone extends Equipment implements Calculator {

	@Override
	public void powerOn() {
		System.out.println("일반 스마트 폰  전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("일반 스마트 폰 전원을 끕니다.");
	}

	@Override
	public double division(double x, double y) {
		System.out.println("스마트 폰 에서 더하기 실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("스마트 폰 에서 뺴기 실행");
		return x - y;
	}

	@Override
	public double plus(double x, double y) {
		System.out.println("스마트 폰 에서 나누기 실행");
		
		if(x == 0 || y == 0) {
			return ERROR;
		}
		return x / y;
	}
}
