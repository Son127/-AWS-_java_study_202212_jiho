package j16_Object;

import java.util.Objects;

// 오브젝트 클래스는 항상 모든 클래스 위
// 모든 클래스들은 오브젝트 클래스를 가진다.
// 생략 되어 있던 것들을 구체적으로 명시하는 순간  생략되어 있던것들은 사라진다.
public class Student extends Object {
	private String name;
	private int age;

	public Student(String name, int age) {
		super(); // objdect 클래스로 타고 간다.
		this.name = name;
		this.age = age;
	}

	@Override // 해시란. 검색과 저장이 아주 빠르게 진행된다.
	public int hashCode() {
		return Objects.hash(name, age); // name,age 값을 조합해서 하나의 해시 코드로 바꾼
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // 두개의 주소가 같으면 무조건 true
			return true;
		}
		if (obj == null) {
			return false;
		}
		// getClass() 생성할때 클래스객체를 가져온다. 생성된 클래스는 get클래스해준다.
		if (!(obj.getClass() == Student.class)) {// 타입의 비교대상을 쓸때는 .Class를 써준다.
			return false;
		}

//		if(!(obj instanceof Student)) { //obj로 들어오는 주소가 sutdent 가 아니면 false
//			 return false; // a -> b -> c b까
//		}

		Student s = (Student) obj;
		boolean result = name.equals(s.name) && age == s.age;
		return result;
	}

}
