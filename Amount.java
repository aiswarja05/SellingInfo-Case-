package Sell;
import java.util.Scanner;
public class Amount {

	public static void main(String[] args) {
		
		// TODO Auto-f4generated method stub
		Shoes s= new Shoes();
		stock b=new stock();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nameyour choice");
		System.out.println("");
		System.out.println("1.Income");
		System.out.println("2.Stock");
		
		int choice = scan.nextInt(); // Read user input 
		switch (choice){
		case 1:
			s.soldAmount_shoes(500);
			s.soldAmount_shoes(50.5);
		    break;
	    case 2:
		b.current_stock(100);
		break;
		}
		
	}

}
