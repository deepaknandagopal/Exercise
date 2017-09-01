package coreJava_Firstset;

import java.util.Scanner;

/**
 * @author Deepak Kumar Nandagopal
 * 
 * Java Program to display palindrome numbers based on the input given.
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		int i=0;
		while(count<number)
		{
			int reverseNum = 0;
			int temp = i;
			while(temp>0)
			{
				reverseNum = reverseNum * 10;
				reverseNum = reverseNum + temp%10;
				temp = temp/10;
			}
			if(i == reverseNum)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
		in.close();
	}
}
