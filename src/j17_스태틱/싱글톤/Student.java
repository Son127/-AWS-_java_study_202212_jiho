package j17_스태틱.싱글톤;

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


	@Override
	public String toString() {
		return "Student [CODE=" + CODE + ", studentCode=" + studentCode + ", name=" + name + "]";
	}
	

}
