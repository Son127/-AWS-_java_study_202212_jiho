package j18_제네릭;
/*
 * 제네릭은 일반 클래스는 사용 불가 래퍼 클래스만 사용 가능함
 * 자료형을 바꿀때 사용
 */

public class TestData<B,T> {// T = type

	private B data1;
	private T data2; // Wrapper Class(래퍼 클래스)

	public TestData(B data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}

}
