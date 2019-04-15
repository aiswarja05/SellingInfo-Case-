package Sell;

public class stock {
	private int stock=1000;
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void current_stock(int s) {
		stock=stock-s;
		System.out.println("Current stock " +s);
	}

}
