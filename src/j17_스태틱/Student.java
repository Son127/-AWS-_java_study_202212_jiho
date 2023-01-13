package j17_스태틱;

public class Student {
	
	private final int CODE = 20230000; 
	private static int ai = 1; // auto_increment
//	private static int ai = 20230000; // auto_increment

	private int studentCode;
	private String name;
	
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 Ai: " + ai);
//		System.out.println("학생이름: " + name); //name 변수는 생성된 다음에 쓸수있는것 . 생성이 되지 않아도 사용가능한 static 메소드에서는 사용불가하다
		return ai;
	}


	@Override
	public String toString() {
		return "Student [ studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	

}
