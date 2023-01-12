package j16_Object;

public class ToString {

	public static void main(String[] args) {

		Student student1 = new Student("김김김", 15);
		Student student2 = new Student("이이이", 13);
		Student student3 = new Student("박박박", 14);
		Student student4 = new Student("정정정", 15);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println();

		System.out.println(student1.toString()); // tostring 변수를 string에 넣어야 할 경우 사용
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

		Object obj = new Object();
		String str = obj.toString();
	
//		String str2 = obj;
//		System.out.println(obj);
//
//		tostring을 써야지만 문자열 변수에 넣을수 있다. 
//		tostring는 String 리턴
//	
//		System.out.println(str);
	}
}
