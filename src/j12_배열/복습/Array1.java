package j12_배열.복습;



public class Array1 {
 	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
// 동일한 자료형으로 묶어주기 위해서 배열 사용
		
		int[] nums = new int[5]; //자료형[index] 변수명 = new 자료형[index크기] 
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		int[] nums1 = new int[] {10,20,30}; // 배열의 크기를 생략한 경우
		int[] nums2 =  {10,20,30}; //배열이 선언되고나서 초기화 시에만 (new 자료형) 생략가능
	
		System.out.println(new int[] {10,30,50,1}); // 배열의 주소를 출력
		System.out.println(new int[] {10,30,50,1}[1]); 
		System.out.println(new int[] {10,30,50,1}[2]); //위에 배열이랑 다른 배열이다. 
	
	}

}
