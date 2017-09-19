package coreJava_SecondSet;

abstract class AbstractDemo {
	
	public AbstractDemo()
	{
		System.out.println("AbstractDemo Constructor");
	}
	
	public abstract void details();
}


class EmpDetails extends AbstractDemo{
	
	public EmpDetails()
	{
		System.out.println("EmpDetails Constructor");
	}
	
	public void details(){
		System.out.println("The employee name is: Deepak Kumar Nandagopal");
		System.out.println("The employee bday is: 13th March 1993");
	}
	
}

public class Employee{
	
	public static void main(String args[])
	{
		EmpDetails emp = new EmpDetails();
		System.out.println("Calling details method using EmpDetails Reference Varaible");
		emp.details();
		AbstractDemo abs = emp;
		System.out.println("Calling details method using AbstractDemo Reference Varaible");
		abs.details();
	}
}

