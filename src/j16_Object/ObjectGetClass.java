package j16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {

	public static void main(String[] args) {
		Student student = new Student("김재영", 29);

		System.out.println(student.getClass());// student가 Student클래스로 만들어졌다
		System.out.println(Student.class);// 클래스 정보만 가져온것

		System.out.println(student.getClass().getName());

		Class studentClass = student.getClass();

		String classname = studentClass.getName();

		System.out.println("클래스 이름 : " + classname);

		String simplename = studentClass.getSimpleName(); // 클래스 이름만 출력
		System.out.println("클래스 이름만: " + simplename);
//	Declared 는 프라이빗도 다 들고온다.
		Field[] fields = studentClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println();

		Method[] methods = studentClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}

}
