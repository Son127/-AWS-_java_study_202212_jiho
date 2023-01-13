package j17_스태틱;

public class StudentMain {
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		students[0] = new Student("이현수");
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");
		
		teachers[0] = new Teacher("1");
		teachers[1] = new Teacher("2");
		teachers[2] = new Teacher("3");
		teachers[3] = new Teacher("4");
		teachers[4] = new Teacher("5");
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			System.out.println(teachers[i]);
		}
		int  j = 0;
		for(Student s : students) { //포이치 : for(클래스 변수선언 : 배열변수) students배열에 들어있는 값을 꺼내서 s 변수에 대입.
			System.out.println(s);  // 단순히 하나의 객채를 꺼내쓰기는 좋지만  어떠한 객채와 맞추어서  쓰기에는  부적합하다.
			System.out.println(teachers[j]); 
			j++;
		}
	
		System.out.println(Student.getAutoIncrement());
		
		
	}

}
