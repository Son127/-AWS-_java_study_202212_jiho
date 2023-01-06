package j03_형변환;

public class casting02 {

	public static void main(String[] args) {
		char char_a = 'a';
		int num = char_a;// 업캐스팅은 앞에 명시를 하지 않아도 자동으로 변환
		
		
		char char_b = (char) (num + 1) ;// 다운캐스팅을 할때에는 앞에 무조건 명시를 해야한다.
		
		System.out.println('a' + 1);
		System.out.println(char_b);
	}

}
