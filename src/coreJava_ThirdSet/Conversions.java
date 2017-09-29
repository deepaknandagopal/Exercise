package coreJava_ThirdSet;

import java.util.Scanner;

public class Conversions {
	
	static Scanner in = new Scanner(System.in);
	
	public static void choice(int choice)
	{
		
		double num = Double.parseDouble(in.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Tnches to centimeter : "+2.54*num);
			break;
		case 2:
			System.out.println("Centimeter to Inches : "+ num/2.54);
			break;
		case 3:
			System.out.println("grams to kilograms : "+num/1000);
			break;
		case 4:
			System.out.println("Kilograms to grams : "+num*1000);
			break;
		case 5:
			System.out.println("pounds to kilograms : "+num/2.20);
			break;
		case 6:
			System.out.println("Kilograms to pounds : "+num*2.20);
			break;
		default:
			System.out.println("Please try again");
			break;
		}
		in.close();
	}

	public static void main(String[] args) {
	
		
		System.out.println("1. Convert Inches to centimeter \n"
				+ "2. Conver the centimeter to Inches \n"
				+ "3. Comvert the grams to kilograms \n"
				+ "4. Convert the kilograms to grams \n"
				+ "5. Convert the pounds to kilogram \n"
				+ "6. Convert the kilograms to pound\n"
				+ "\nEnter the choice to perform the operation");
		choice(Integer.parseInt(in.nextLine()));
	}

}
