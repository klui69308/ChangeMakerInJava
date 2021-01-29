package kioskChangeCalculator;

import java.util.*;

public class KioskChangeCalculator {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter unit price: ");
		double price = Double.parseDouble(sc.nextLine());
		System.out.print("Enter payment: ");
		double payment = Double.parseDouble(sc.nextLine());
		returnChange(payment, price);

	}
	private static void returnChange(double payment, double price) {
		double change = payment - price;
		double quarters = change / .25;
		double dimes = (change - (int)quarters * .25)/ .1;
		double nickels = (change -  (int) quarters * .25 - (int) dimes * .1)/ .05;
		double pennies = (change - (int) quarters * .25 - (int) dimes * .1 - (int) nickels *.05)/ .01; 
		
		System.out.println("RESULT:");
		System.out.println("Quarters:" + (int) quarters);
		System.out.println("Dimes:" + (int) dimes);
		System.out.println("Nickels:" + (int) nickels);
		System.out.println("Pennies:" + (int) pennies);
	}


}
