package coreJava_SecondSet;

public class DriverInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.turn();
		car.setSpeed(71);
		System.out.println(Integer.toString(car.getSpeed()));
		car.increaseSpeed();
		System.out.println(Integer.toString(car.getSpeed()));
		car.increaseSpeed();
		System.out.println(Integer.toString(car.getSpeed()));
		car.increaseSpeed();
		car.decreaseSpeed();
		System.out.println(Integer.toString(car.getSpeed()));
		car.openTrunk();
		car.closeTrunk();
		
		Truck truck = new Truck();
		truck.start();
		truck.turn();
		truck.setSpeed(65);
		System.out.println(Integer.toString(truck.getSpeed()));
		truck.increaseSpeed();
		System.out.println(Integer.toString(truck.getSpeed()));
		truck.increaseSpeed();
		System.out.println(Integer.toString(truck.getSpeed()));
		truck.decreaseSpeed();
		System.out.println(Integer.toString(truck.getSpeed()));
		truck.openTailgate();
		truck.closeTailgate();

	}
}

class Vehicle {
		
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
	
	public void openTailgate()
	{
		System.out.println("Tailgate is opened");
	}
	
	public void closeTailgate()
	{
		System.out.println("Tailgate is closed");
	}


}

		


