package coreJava_ThirdSet;

import java.util.Scanner;

public class SalesTaxModified {
	private final static double tax = 8.25;
	
	public static void main(String args[])
	{
		System.out.println("Enter the no of the product");
		Scanner in = new Scanner(System.in);
		int no_of_product = Integer.parseInt(in.nextLine());
		double price = 0;
		for(int i=0;i<no_of_product;i++)
		{
			price = price + Double.parseDouble(in.nextLine());
		}
		double taxofproducts = (price * tax)/100;
		double totatPrice = price + taxofproducts;
		System.out.println("The tax of the products is "+taxofproducts);
		System.out.println("The total price of the products is "+totatPrice);
		in.close();
	}


}
