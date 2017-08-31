package coreJava_Firstset;
import java.util.Scanner;

/**
 * @author  Deepak Kumar Nandagopal
 * 
 * Java Program to print prime numbers less than the input number given between 1-100 using If statement. 
 */
public class PrimeNumbers {
	
	public static void printPrimeNumbers(int number)
	{
		for(int i=number;i>=2;i--)
		{
			int flag = 0;          
			for(int j=2;j<i;j++)	//For number == 2 condition in for loop does not satisfy so it will directly print the value
			{
				if(i%j==0)
					flag=1;	
			}
			if(flag==0)
			{
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1- 100 to print the prime numbers less than it");
		int number = scan.nextInt();
		printPrimeNumbers(number);
		scan.close();
	}

}
