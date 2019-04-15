package Sell;

public class Shoes extends Product {
	double income=0;
	public void soldAmount_shoes(double d) {
		income = income + d;  
		System.out.println("Income "+income);
		
		
	}
	public void soldAmount_shoes(float sold) {
		income = income + sold;  
		System.out.println("Income "+income);
		
	}

}
