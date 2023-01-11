package j12_배열;



public class Array6 {
		
	public static void main(String[] args) {
		String[] names = {"ddd","FFF","AA"};
		
		for(String name : names) {
			System.out.println(name);
			
		}

		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			names[i] = "QKQKKD";
		}
		int[] nums = {1,2,3,4,5};
		
		for(int i : nums) {
			System.out.println(i);
		}
		
//		      변수  :  무조건 배열 또는 리스트 
//	forEach :	무조건 처음부터 끝까지 하나씩 꺼낸다. / 인덱스 참조를 못한다. 
//	forEach 에 값을 다르게 할려면 인덱스를 써야한다.
	}
}

