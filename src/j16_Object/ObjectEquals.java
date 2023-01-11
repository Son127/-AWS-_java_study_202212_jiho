package j16_Object;

public class ObjectEquals {

	public static void main(String[] args) {
		String name1 = "김준일"; //리터럴 : 정해진 값(소스코드의 고정된 값)
		String name2 = "김준일";
		String name3 = new String("김준일");
		
		System.out.println(name1);
		System.out.println(name2);
	
		System.out.println(name1 == name2); //주소비교 같은 주소의 값을 비교해서 true
		System.out.println(name1.equals(name3)); //안에 들어잇는 값을 비교하는것
		
////////////////////////////////////////////////////////////////////
		
		Student s1 = new Student("김우링", 0);
		Student s2 = new Student("김우링", 0);
	   	SubStudent s3 = new SubStudent("김우링", 0);
		
		System.out.println(s1.equals(s1));
		
//		System.out.println(s1 == s2); //s1 ,s2 생성을 각자 따로 해서 false
//		System.out.println(s1.equals(s2)); // this = s1  s2 =(obj)
//		    public boolean equals(Object obj) {
//        return (this == obj);
   
	}

}
