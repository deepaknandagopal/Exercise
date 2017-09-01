package coreJava_Firstset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Deepak Kumar Nandagopal
 *
 *Java Program to print the grade based on the mark entered using if else
 */
public class GradeUsingIfElse {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the grade");
		int grade = 0;
		try {
			grade = Integer.parseInt(br.readLine());
			System.out.println("Grade entered is "+grade);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rating = grade/10;
		if(rating == 10)
		{
			System.out.println("Perfect Score");
		}
		else if(rating == 9)
		{
			System.out.println("Excellent");
		}
		else if(rating == 8)
		{
			System.out.println("Nice Job");
		}
		else if(rating == 7)
		{
			System.out.println("Average");
		}
		else if(rating < 7)
		{
			System.out.println("Below Average");
		}
	}
}
