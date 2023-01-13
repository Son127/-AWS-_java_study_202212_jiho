package j17_스태틱;

import java.time.LocalDateTime;
import java.util.Date;

/*
 * 
 */
public class Car {
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	private  static final String CODE = "KIA-" + NOW_YEAR + "-"; 
	private static int a = 1;
	
	private String serialCode; //KIA-2023-00
	private String modelName;
	
	public Car(String name) {
		serialCode = CODE + String.format("%04d",a) ; // 4자리숫자까지 나타내는데 a를 표현하겟다.
		modelName = name;
		a++;
		this.modelName = name;
	}

	@Override
	public String toString() {
		return "Car [ serialCode = " + serialCode + ", modelName = " + modelName + "]";
	}
	

	

	
	
}
