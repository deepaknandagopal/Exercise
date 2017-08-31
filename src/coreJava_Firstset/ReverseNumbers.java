package coreJava_Firstset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Deepak Kumar Nandagopal
 *
 * Reverse the number using While and do While loop
 */
public class ReverseNumbers {

	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int reversenumber = 0;
		System.out.println("Enter the number to reverse");
		try {
			number = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
//		while(number!=0)
//		{
//			reversenumber = reversenumber * 10;
//			reversenumber = reversenumber + number%10;
//			number = number/10;
//		}
		do
		{
			reversenumber = reversenumber * 10;
			reversenumber = reversenumber + number%10;
			number = number/10;
		}
		while(number!=0);
		
		System.out.println("The Reversed number is "+reversenumber);

	}

}
