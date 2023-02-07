package j24_람다;
/*
 * 람다는 메소드가 주체 
 * 람다를 사용할때는 앞에(인터페이스 변수 = ) 대상이 있어야한다.
 * 람다를 사용 할 수 있는 인터페이스는 추상메소드 하나만 가지고 있는 인터페이스 
 *
 *문장이 간결해진다
 *익명 클래스랑 동일(일회성)
 *변수를 끌어다 쓸수있어서 자유도가 높다ㅣ
 */
public class Lambda1 {
	
	public static void main(String[] args) {
		
		Instrument instrument = new Instrument() {
			
			@Override
			public String play(String instrument) {
				return instrument + "을(를) 연주합니다.";
			}
		}; // 여기까지 클래스 정의
		
		//람다식으로 표현 (화살표 함수)
		Instrument instrument2 = (String imt) -> { //정의와 생성을 담당
			return imt + "를 연주합니다.";
		};
		
		//매개변수의 자료형을 생략 할 수 있다.
		//매개변수의 이름을 바꿀 수 있다. 
		Instrument instrument3 = (imt) -> { //정의와 생성을 담당
			return imt + "를 연주합니다.";
		};
		
		//매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다. (매개변수가 없거나 두개 이상이면 생략 불가능)
		Instrument instrument4 = imt -> { //정의와 생성을 담당
			return imt + "를 연주합니다.";
		};
		
		//중괄호를 생량 할 수 있는 조건 
		//실행문(구현부)의 명령이 하나여야 한다.
		//이때 리턴 자료형이 정해져 있으면 리턴값으로 사용이 된다.
		Instrument instrument5 = (imt) -> imt + "를 연주합니다."; 

// *메인메소드 안에서 사용하는 지역변수를 람다에서도 사용 가능하다.(전역변수로 사용되고 잇는 변수명은 매게변수명으로 사용 불가능)

		int result = 10 + 12;
		
		Instrument instrument6 = (imt) -> imt + "를 연주합니다." + result; 
		
		

		System.out.println(instrument2.play("aaa")); //인터페이스 안에 잇는 play  메소드를 호출
		String playText = instrument2.play("드럼");
		System.out.println(playText);
		
		System.out.println(instrument6.play("aaa")); 
	}

}
