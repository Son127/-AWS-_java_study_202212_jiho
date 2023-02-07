package j01_출력;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {
	private int orderId;
	private String productName;
	private String  consumerName;
	private int price;
	private int stock;
	

	
	public void showOrderInfo() {
		
	}
	
//	public static orderBuilder build(orderBuilder) {
//		return new orderBuilder;
//	}
	
	public static class OrderBuilder{
		
		private int orderId;
		private String productName;
		private String  consumerName;;
		private int price;
		private int stock;
		
		public OrderBuilder orderId(int orderId) {
			this.orderId = orderId;
			return this;
		}
		public OrderBuilder productName(String productName) {
			this.productName = productName;
			return this;
		}
		public OrderBuilder comsumerName(String comsumerName) {
			this.consumerName = comsumerName;
			return this;
		}
		public OrderBuilder price(int price) {
			this.price = price;
			return this;
		}
		public OrderBuilder stock(int stock) {
			this.stock = stock;
			return this;
		}
		public Order build() {
			return new Order(orderId, productName, consumerName, price, price);
		}
		
//		public Order buildl() {
//			return new Order(orderId, orderId, consumerName, price, stock);
//		}
	}
}
