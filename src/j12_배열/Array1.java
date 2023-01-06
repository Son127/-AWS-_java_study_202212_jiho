package j12_배열;

public class Array1 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
//		new가 들어가는 순간 참조자료형이다.
//		new는 동적할당이다.
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 10;
		nums[2] = 10;
		nums[3] = 10;
		nums[4] = 10;
		for(int i = 0; i < 5; i++)
		System.out.println(nums[i]);
	}

}
