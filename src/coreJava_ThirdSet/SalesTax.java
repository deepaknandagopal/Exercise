package coreJava_ThirdSet;

import java.util.Scanner;

public class SalesTax {
	private final static double tax = 8.25;
	
	public static void main(String args[])
	{
		System.out.println("Enter the price of the product");
		Scanner in = new Scanner(System.in);
		double price = Double.parseDouble(in.nextLine());
		double taxofproduct = (price * tax)/100;
		double totatPrice = price + taxofproduct;
		System.out.println("The tax of the product is "+taxofproduct);
		System.out.println("The total price of the product is "+totatPrice);
		in.close();
	}

}
