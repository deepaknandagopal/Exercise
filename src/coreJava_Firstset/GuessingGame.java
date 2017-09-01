package coreJava_Firstset;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Deepak Kumar Nandagopal
 * 
 * Guessing game where the system thinks of a number between 1 and 1000.
 * User has to guess and find the number
 * It will give hint saying that "Too High" or "Too low" based on the user input
 */
public class GuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(1000) + 1;
		System.out.println("Guess the Number which I think of between 1 and 1000...");
		Scanner in= new Scanner(System.in);
		int guessedNumber = Integer.parseInt(in.nextLine());
		int guesses = 1;
		
		while(guessedNumber!=number)
		{
			if(guessedNumber > number)
			{
				System.out.println("Too High");
			}
			else
			{
				System.out.println("Too Low");
			}
			System.out.println("Please try again");
			guessedNumber = Integer.parseInt(in.nextLine());
			guesses++;
		}
		if(guessedNumber==number)
		{
			System.out.println("Congratulation you have took "+guesses+" guesses to find the number "+number);
		}
		in.close();
	}

}
