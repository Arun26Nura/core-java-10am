package com.besant.core.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
			Vehicle bike= new Bike();
			Car car= new Car();
			Vehicle tataCar= new Tata();
			bike.drive();
			returnVehicle("bike");
			Vehicle vehicle= new Vehicle();
			System.out.println(vehicle.color);
			System.out.println(tataCar.color);
			
			car.stop();
			tataCar.stop();
	
	}
	
	public static Vehicle returnVehicle(String name) {
		if(name.equals("bike")) {
			return new Bike();
		}
		else {
			return new Car();
		}
	}

}
