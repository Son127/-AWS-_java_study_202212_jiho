package j17_스태틱.싱글톤;

public class KiaMain {
	
	public static void main(String[] args) {
		KIA kia = KIA.getInstance(); //주소를 받아올수있게 만듬
		
		kia.printCompanyName();
	}
}
