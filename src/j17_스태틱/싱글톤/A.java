package j17_스태틱.싱글톤;

public class A {
	
	private static A instance = null;
	Student[] students;
	
	private A() {
		 students = new Student[3];
	}
	private String aName;


	public static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return; // break는 반복만 멈춰 준다. return은 메소드를 멈춘다 . 
			}
		}
		
		System.out.println("더 이상 학생을 추가 할 수 없습니다.");
	}
	public void showStudents() {
	for (Student student : students) {
		System.out.println(student);
	}
	System.out.println();
}



//	private Student[] students;
//	
//	public A() {
//		students = new Student[3];
//	}
//	
//	public void addStudent(Student student) {
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] == null) {
//				students[i] = student;
//				return; // break는 반복만 멈춰 준다. return은 메소드를 멈춘다 . 
//			}
//		}
//		
//		System.out.println("더 이상 학생을 추가 할 수 없습니다.");
//	}
//	
//	public void showStudents() {
//		for (Student student : students) {
//			System.out.println(student);
//		}
//		System.out.println();
//	}
}
