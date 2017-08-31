package coreJava_Firstset;

import java.util.Scanner;

/**
 * @author  Deepak Kumar Nandagopal
 * 
 * Java Program to get a option from user(1-Add, 2-Subtract, 3-Multiply, 4-Divide) 
 * and two numbers to perform the basic calculator operation.
 */
public class BasicCalculatorUsingSwitch {
	
	public static void add(int number1, int number2){
		System.out.println(number1+number2);
	}
	public static void sub(int number1, int number2){
		System.out.println(number1-number2);
	}

	public static void mul(int number1, int number2){
		System.out.println(number1*number2);
	}

	public static void div(int number1, int number2){
		System.out.println(number1/number2);
	}

	public static void main(String[] args) {
		System.out.println(" 1-Add, 2-Subtract, 3-Multiply, 4-Divide");
		Scanner in = new Scanner(System.in);
		int choice = Integer.parseInt(in.next());
		System.out.println("Please enter the two numbers");
		int num1 = Integer.parseInt(in.next());
		int num2 = Integer.parseInt(in.next());
		switch(choice){
		case 1:
			add(num1,num2);
			break;
		case 2:
			sub(num1,num2);
			break;
		case 3:
			mul(num1,num2);
			break;
		case 4:
			div(num1,num2);
			break;
		default:
			System.out.println("Invalid Entry");
		}
		in.close();
	}

}
