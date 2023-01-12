package j13_상속.casting2;

public class Subway extends Transportation{
	
	
	public void go() {
		System.out.println("지하철을 타고 출발");
	}
	
	public void stop() {
		System.out.println("지하철을 타고 도착");
	}
	
	public void checkRoute() {
		System.out.println("지하철 노선 확인");
	}
}
