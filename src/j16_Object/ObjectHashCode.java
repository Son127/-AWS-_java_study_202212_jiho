package j16_Object;

public class ObjectHashCode {

	public static void main(String[] args) {
		Student s1 =  new Student("김수현", 21);
		Student s2 =  new Student("김수현", 21);
		SubStudent s3 = new SubStudent("김수현",21);
		
		System.out.println(s1.hashCode());//주소값 //값 비교로 사용
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
	
	}
	
}
