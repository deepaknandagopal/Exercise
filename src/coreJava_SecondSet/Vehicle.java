package coreJava_SecondSet;

public class Vehicle {
	
	private int speed = 0;

	public void start(){
		System.out.println("The Vechile has started ");
	}
	
	public void stop(){
		System.out.println("The Vechile has stopped");
	}
	
	public void turn()
	{
		System.out.println("The Vechile has turing");
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void increaseSpeed()
	{
		int increase = 2;
		setSpeed(this.speed+increase);
	}
	
	public void decreaseSpeed()
	{
		int decrease = 2;
		setSpeed(this.speed-decrease);
	}
}

class Car extends Vehicle{
	
	public void openTrunk()
	{
		System.out.println("Truck is opened");
	}
	
	public void start(){
		System.out.println("The car has started ");
	}
	
	public void stop(){
		System.out.println("The car has stopped");
	}
	
	public void closeTrunk()
	{
		System.out.println("Truck is closed");
	}
	
	@Override
	public void setSpeed(int speed){
		if(speed > 75)
		{
			System.out.println("Speed cannot exceed 75 miles per hours");
		}
		else
		{
			super.setSpeed(speed);
		}
	}
}

class Truck extends Vehicle{
	
	public void start(){
		System.out.println("The Truck has started ");
	}
	
	public void stop(){
		System.out.println("The Truck has stopped");
	}

	public void openTailgate()
	{
		System.out.println("Tailgate is opened");
	}
	
	public void closeTailgate()
	{
		System.out.println("Tailgate is closed");
}
}
