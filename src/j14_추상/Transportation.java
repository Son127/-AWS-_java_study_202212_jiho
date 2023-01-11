package j14_추상;
//클래스 안에 추상메소드가 하나라도 있으면 클래스명 앞에 abstract
//추상 클래스는 생성이 안된다.
//생성이 되지는 않지만 생성은 가능하다.
public abstract class Transportation {

	// 메소드에서 중괄호가 없다는 것은 실행 할 명령이 없다 구현되어있지 않다
    //추상메소드 : 안에 구현은 하지않고 설계만 하는것 
	public abstract void go();
	
	public abstract void stop();
}
