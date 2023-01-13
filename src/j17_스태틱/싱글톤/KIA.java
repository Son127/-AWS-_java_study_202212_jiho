package j17_스태틱.싱글톤;
/*
 * 하나만 존재해야하기에 생성자가 private 이다
 * 밖에서 생성이 불가능하다.
 * static이라서 어디서든지 사용이 가능핟.
 * 싱글톤은 무조건 자기자신이다.
 */
public class KIA {
	
	private static KIA instance = null;
	
	private KIA() {}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}

}
