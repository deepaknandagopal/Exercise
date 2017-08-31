package coreJava_Firstset;

import java.util.Scanner;

/**
 * @author Deepak Kumar Nandagopal
 * 
 * Program to catch the error if any other format is given for the Integer 
 * using NumberFormatException and displaying the error using getMessage
 * 
 */
public class NumberExceptionCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try{
			int a = Integer.parseInt(in.next());
			int b = Integer.parseInt(in.next());
			System.out.println(a+b);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		in.close();
		
	}

}
