package j17_스태틱;

public class CarMain {
	
		public static void main(String[] args) {
			Car[] cars = new Car[5]; 
			
			cars [0] = new Car("k3");
			cars [1] = new Car("k3");
			cars [2] = new Car("k3");
			cars [3] = new Car("k3");
			cars [4] = new Car("k3");
			
			for(Car c : cars) {
				System.out.println(c);
			}
		}

}
