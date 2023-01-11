package j16_Object;

import java.util.Objects;

import j13_상속.casting2.Subway;

public class SubStudent {
	private String name;
	private int age;
	
	public SubStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	
}
