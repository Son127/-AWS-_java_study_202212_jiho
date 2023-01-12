package j16_Object;

class Test{ //패키지 안에서만 참조해서 사용가능 
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "객체 생성");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
	}
	
}
/*
 * 소멸시킬때 사용,강제로 사용불가능,
 * 가비지컬렉터가 소멸을 했을 때 실행되는 메소드다.
 * 소멸되면 안되는?게 잇을대 사용
 */
public class ObjectFinalize {

	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			test = new Test(i);
			
			test = null;
			
			System.gc();//가비지컬렉터(강제로 호출가능) 메모리의 상황을 보고 그때그때 동작한다.
		}
		
	}//안에 데이터까지 같이 복사하면 깊은 복사 ?

}
