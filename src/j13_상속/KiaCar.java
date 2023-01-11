package j13_상속;


public class KiaCar extends Car{ //기아 카 클래스에 extends 붙이겠다 카 클래스를
	
	public KiaCar() {
		super(); // 여기서 Car클래스 호출 super 상위클래스생성자를 의미, 항상 상위에 있어야 한다.
		System.out.println("자식");
	}

	
	
//@Override 부모의 주소에서 결과를 리턴해라
//	부모의 메소드 명은 똑같이 쓰고 값을 재정의 하는것
//		public int discountPrice(int percentage) {
//			return super.discountPrice(percentage);
//		}
	
//	public void test() {
//		KiaCar kc = this; //본인의 주소를 변수로 쓰고 싶을때, 자신의 주소가 매개변수로  들어가야 할 때 
//	}
	
}
