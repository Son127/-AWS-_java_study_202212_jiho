package j13_상속.casting2;

public class Main {

	public static void main(String[] args) {

		Taxi taxi = new Taxi();
		Subway subway = new Subway();

//		Transportation transportation = new Transportation();
//		Taxi t1 = (Taxi) transportation; // Transportation만 생성된 상태에서는 할수없다.
//		
//		Transportation transportation1 = taxi;
//		Subway s1 = (Subway) transportation; //객채가 달라서 다운 캐스팅 안됨
//		Transportation transportation2 = subway;
//		업캐스팅을 해주는 이유는 배열로 묶을 수 있어서

		Transportation[] transportations = new Transportation[6];

		transportations[0] = taxi;
		transportations[1] = subway;
		transportations[2] = taxi;
		transportations[3] = subway;
		transportations[4] = taxi;
		transportations[5] = subway;
//		업캐스팅을 해준 것을 본래의 형태로 돌아갈때만 다운 캐스팅 해줄수있다

//		instanceof는 객체가 어떤 클래스를 상속 받았는지 확인하는데 사용되는 연산자.
		for (int i = 0; i < transportations.length; i++) {
			if (transportations[i] instanceof Taxi) {
				Taxi tx = (Taxi) transportations[i];
			} else if (transportations[i] instanceof Subway) {
				Subway sw = (Subway) transportations[i];
				sw.checkRoute();
			}

			transportations[i].go();
		}

		for (Transportation t : transportations) {
			t.stop();
		}

	}
}
