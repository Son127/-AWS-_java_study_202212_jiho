package j12_배열;

/*
 * 클린코드 : 메소드이름을 보고 어떤 수행을 하는지 알아야한다.
 * 클래스에 맞는 메소드들만 가지고 있어야한다.
 * 결합도는 낮아야하고 응집도는 높아야한다. 
 */

public class Array5 {
	
	public static void transferArray(int[] oldArrayy, int[] newArray) {
		for(int i = 0; i < oldArrayy.length; i++) {
			newArray[i] = oldArrayy[i];
		}
	}

	public static int[] addArrayLength(int[] array) {
		int[] newArray = new int[array.length + 1];
		transferArray(array, newArray);
		return newArray;
	}
	
	public static int[] addData(int[] array, int data) {
		int[] newArray = addArrayLength(array);
		newArray[array.length] = data;
		return newArray;
	}
	
	
	public static void main(String[] args) {
		int[] nums = new int[0];
		
		
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		nums = addData(nums, 4);
		nums = addData(nums, 5);
		nums = addData(nums, 6);
		
		for(int i = 0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}

}
