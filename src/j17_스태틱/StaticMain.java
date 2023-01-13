package j17_스태틱;

public class StaticMain {
	
		public static void main(String[] args) {
			
			System.out.println("출력1: " + TestA.getNum());//생성하지 않아도 클래스 명을 찍고 바로 접근 가능하다.
			System.out.println();
			
			TestA.setNum(100);
			System.out.println("출력2: " + TestA.getNum());
		}

}
