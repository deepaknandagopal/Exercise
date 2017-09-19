package coreJava_SecondSet;

public class VehiclePolymorphism {
	
	public static void main(String args[])
	{
		Car car = new Car();
		Vehicle v = car;
		v.start(); //Should print "The vehicle has started" but itsead it access the method the of the obj assigned rather than its own method. 
					//Virtual method invocation
		v.stop();
	}
}
