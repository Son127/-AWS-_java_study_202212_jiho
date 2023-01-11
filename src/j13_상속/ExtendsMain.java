package j13_상속;

public class ExtendsMain {
	 
	public static void main(String[] args) {
		KiaCar kiacar = new KiaCar();
		kiacar.setPrice(30000000);
		
		
		System.out.println(kiacar); 

		System.out.println(kiacar.getPrice()); 
		System.out.println(kiacar.discountPrice(20));  //오버라이드 정의를 안하면 car 클래스에서 가져옴
	}

}
//상속 받은 것을 재정의 하면 재정의 한 것이 우선순위가 높다.
//메소드 명과 자료형이 같은게 Override 이다. 새로 만드는 것은 아니다.
//메소드는 메소드 이름 매개변수의 자료형이 중요하다 . 매개변수 이름은 바뀔수있다.