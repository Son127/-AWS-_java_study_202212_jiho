package j14_추상;

public class Taxi extends Transportation{
//@ 시작하는 문법을 어노테이션이라 한다.
//	@는 상속받아서 재정의 된거라는 표시
	
	
	@Override
	public void go() {
		System.out.println("택시를 타고 출발");
	}
	
	@Override
	public void stop() {
		System.out.println("택시를 타고 도착");
	}
	
	public void checkTaxiNumber() {
		System.out.println("택시 번호 확인");
	}
	
}
