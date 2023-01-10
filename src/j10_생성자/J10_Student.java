package j10_생성자;
//리턴값이 주소값이다 . 
public class J10_Student {
//	클래스가 가지는 변수(참조변수 ,래퍼런스변수,멤버변수)
	String name;
	int age;
//	클래스는 멤버변수와 매게변수를 구분
	J10_Student(){
		System.out.println("기본 생성자 호출");
	}
	
	J10_Student(int age){
		System.out.println("학생의 나이: " + age);
	}
	J10_Student(String name){
		System.out.println("학생의 이름: " + name);
	}
//	this.name == s1.new ~~ 
	J10_Student(String name,int age){
		this.name = name;
		this.age = age;
	}
//	printInfo : 멤버변수가 가지고 있는 값을 출력해준다.
	void printInfo() {
		System.out.println("학생이름: " + name);
		System.out.println("학생나이: " + age);
	}
	

}
