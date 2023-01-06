package j09_클래스;

public class J09_Student {
	
	String name = "박";
	int age = 312;
	
	//기본생성자
	//할당을  안해도  생성과정에서 자동으로 활당이 된다.(클래스 안에서는  초기화 불필요)
	J09_Student() {
		System.out.println("생성됨");
	}
	void printInfo() {
		System.out.println("이름: " +  name);
		System.out.println("나이: " +  age);
		
	}
}
