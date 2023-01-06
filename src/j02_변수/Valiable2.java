package j02_변수;

public class Valiable2 {

	public static void main(String[] args) {
		char firstName1 = '와'; // '' = 한글자  ""=문자열
		char firstName2 = '엉';
		
		char alphabetA='A';
		
		System.out.println("앞"+firstName1 + firstName2);
		System.out.println("알파벳 A =" + alphabetA);
		
		System.out.println(alphabetA + 'B');
		System.out.println(alphabetA );
		System.out.println("\uAC00");//유니코드 '가'
		System.out.println(firstName1 + 0);
	}

}
