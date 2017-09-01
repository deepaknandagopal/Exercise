package coreJava_Firstset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Deepak Kumar Nandagopal
 *
 * Program to generate factorial of the given number
 */
public class Factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int factorial = 1;
		System.out.println("Enter the number to generate the factorial");
		number = Integer.parseInt(br.readLine());
		for(int i=number;i>=1;i--){
			factorial = factorial*i;
		}
		System.out.println("The Factorial of the given number is "+factorial);
	}

}
