package J15_인터페이스;

/* implements 사용하겠다. Calculator를
 * 상속은 단일 상속이다. 확장은 하나의 클래스만 가능
 * 인터페이스는 여러개의 도구를 사용할수있다.
 */
public class GeneralCalculator extends Equipment implements Calculator {

	@Override
	public void powerOn() {
		System.out.println("계산기 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}

	@Override
	public double plus(double x, double y) {
		System.out.println("일반 계산기에서 더하기 실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("일반 계산기에서 빼기 실행");
		return x - y;
	}

	@Override
	public double division(double x, double y) {
		if(x == 0 || y == 0) {
			return ERROR;
		}
		
		return x / y;
	}

}
