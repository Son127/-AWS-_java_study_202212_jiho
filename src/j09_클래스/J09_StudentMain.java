package j09_클래스;

/*
 * 스택 : 정적메모리
 * 힙: 동적 메모리
 */
public class J09_StudentMain {

	public static void main(String[] args) {
//		자료형 변수명 = 키워드(new)+ 생성자 (힙메모리) 생성한 메모리 주소를 09_Student(자료형) 변수에 대입
//		키워드(new) 없이 생성자를 쓸 수 없다
//		생성자는 클래스 명과 일치 (형태는 메소드)
//		
//		J09_Student student1 = new J09_Student();
//		J09_Student student2 = new J09_Student();
		
		J09_Student s1 = new J09_Student();
		J09_Student s2 = new J09_Student();
		
		s1.name = "와나다";
		s1.age = 123;
		
		s1. printInfo();
		s2. printInfo();
	}
	
}
