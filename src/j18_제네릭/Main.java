package j18_제네릭;

public class Main {
//		생성될때 결정이 된다. 생성이 된 후에는 바꿀수없다.
	public static void main(String[] args) {
		TestData<String,Integer> ta = new TestData<String,Integer>("skdif", 100);
		TestData<String,Double> ta2 = new TestData<String,Double>("sdf", 105.54);

		System.out.println(ta);
		System.out.println(ta2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", ta);
		
		System.out.println(cm);
	}

}
