package coreJava_SecondSet;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		CalculatorImplementation calc = new CalculatorImplementation();
		System.out.println("Please enter a option to continue from 'a' - 'g' to continue");
		Scanner in = new Scanner(System.in);
		char caseId = in.nextLine().charAt(0);
		int x=0,y=0;
		switch (caseId)
		{
		case 'a':
			x = Integer.parseInt(in.nextLine());
			y = Integer.parseInt(in.nextLine());
			System.out.println("Addition of "+x+" and "+y+" is "+calc.add(x, y));
			break;
		case 'b':
			x = Integer.parseInt(in.nextLine());
			y = Integer.parseInt(in.nextLine());
			System.out.println("Subraction of "+x+" and "+y+" is "+calc.subtract(x, y));
			break;
		case 'c':
			x = Integer.parseInt(in.nextLine());
			y = Integer.parseInt(in.nextLine());
			System.out.println("Multiplication of "+x+" and "+y+" is "+calc.multiply(x, y));
			break;
		case 'd':
			x = Integer.parseInt(in.nextLine());
			y = Integer.parseInt(in.nextLine());
			System.out.println("Division of "+x+" and "+y+" is "+calc.divide(x, y));
			break;
		case 'e':
			Float z = Float.parseFloat(in.nextLine());
			System.out.println(calc.squareRoot(z));
			break;
		case 'f':
			x = Integer.parseInt(in.nextLine());
			System.out.println(calc.squareRoot(x));
			break;
		case 'g':
			x =  Integer.parseInt(in.nextLine());
			System.out.println(calc.factorial(x));
			break;
		default:
			System.out.println("Please Try again");
			break;	
		}
		in.close();

	}

}
