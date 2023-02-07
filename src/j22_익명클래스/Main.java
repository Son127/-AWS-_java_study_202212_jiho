package j22_익명클래스;

public class Main {

	public static void main(String[] args) {
		
		Calculator c1 = new Addition();
		System.out.println(c1.calc(10, 200));
// ///////////////////////////////////////
		
		Calculator c2 = new Calculator() { // 익명클래스 (인터페이스를 구현한 클래스) 1회성.
			@Override
			public int calc(int x, int y) {// 임시적으로 클래스 구
				return x - y;
			}
		}; // 메소드 구현
		System.out.println(c2.calc(123, 420));
		
		
		Calculator c3 = (x,y) -> x * y; //위에 익명클래스를 한줄로 줄인것 (람다식)
		System.out.println(c3.calc(13, 10));

	}

}
