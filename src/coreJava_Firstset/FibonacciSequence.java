package coreJava_Firstset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Deepak Kumar Nandagopal
 *
 * Program to print the Fibonacci sequence using recursive function calls
 */
public class FibonacciSequence {
	static int num1=0,num2=1,num3=0;
	
	public static void generateSequence(int count)
	{
		if(count>0)
		{
			num3 = num2+num1;
			num1 = num2;
			num2 = num3;	
			System.out.print(" "+num3);
			generateSequence(count-1);
		}		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		System.out.println("Enter the number to generate the fibonacci sequence");
		count = Integer.parseInt(br.readLine());
		if(count == 0)
		{
			System.out.println("0");
		}
		else if(count == 1)
		{
			System.out.println("0 1");
		}
		else
		{
			System.out.print("0 1");
			generateSequence(count-2);
		}
	}

}
