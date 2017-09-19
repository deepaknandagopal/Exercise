package coreJava_SecondSet;

public class CalculatorImplementation implements CalculatorInterface {

	public int add(int a, int b) {
		return a+b;
	}

	public int subtract(int a, int b) {
		return a-b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

	public int divide(int a, int b) {
		int c = 0;
		try{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("The error is"+e.getMessage());
		}
		return c;
	}

	public float squareRoot(float number) {
		return (float) Math.sqrt(number);
	}

	public int sqaureRoot(int number) {
		return (int) Math.sqrt(number);
	}

	public int factorial(int number) {
		int fact = 1;
		for(int i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	

}
