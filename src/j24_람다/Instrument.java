package j24_람다;

@FunctionalInterface //함수형 인터페이스 - 람다용
public interface Instrument {

	public String play(String instrument);
	// 디폴트 메소드는 상관이 없다.
	public default void tast() {
		System.out.println("테스트");
	}
}
