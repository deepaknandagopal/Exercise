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





		


