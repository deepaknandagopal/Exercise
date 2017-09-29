package coreJava_ThirdSet;

import java.util.Scanner;

public class EmployeePay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of the hours worked in a week");
		double no_of_hours = Double.parseDouble(in.nextLine());
		System.out.println("Enter the base rate");
		double base_rate = Double.parseDouble(in.nextLine());
		double total_pay = 0;
		if(base_rate < 8)
		{
			System.out.println("Warning the minimum wage is not met according to the state law");
		}
		if(no_of_hours >40)
		{
			System.out.println("Warning the employee has worked more than 40 hours");
			total_pay = (base_rate * 40) + (base_rate/2 *(no_of_hours-40));
		}
		else
		{
			total_pay = base_rate * no_of_hours;
		}
		System.out.println("The total pay due is "+total_pay);
		
	}

}
