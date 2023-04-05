package Assignment3;

abstract class Vehicle {

	int noOfWheels;
//	void Start(int noOfWheel){
//		System.out.println("Vehicle started noOfWheel :" + noOfWheel);
//	}

	
}
class Bike extends Vehicle{
	
//	int maxSpeed;
//	void Start(int maxSpeed){
//		System.out.println("maxSpeedd : "+ maxSpeed);
//	}
	
	//This is a Constructor
	Bike(){
		this.noOfWheels = 2;
	}
	
	
	
}
class Car extends Vehicle{
	
//	double turningRadius;
//	void Start(double turningRadius){
//		System.out.println("turningRadius :"+ turningRadius);
//	}
	
	//Constructor
	Car(){
		this.noOfWheels = 4;
	}
	
}


public class AbstractClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //It is not possible to create an object of the Vehicle class

		//Vehicle newVehicle = new Vehicle();
		
		//To access the abstract class, it must be inherited from another class. Let's convert the Vehicle class we used in the Polymorphism to an abstract class:
//		Bike newBike = new Bike();
//		newBike.Start(20);
//		Car newCar = new Car();
//		newCar.Start(4);
		
		
		
		AbstractClassAssignment ab = new AbstractClassAssignment();
		Vehicle vehicle = null;
	//	vehicle = new Bike();
		vehicle = new Car();
		
		ab.start(vehicle);
		
		
		
	}

	private void start(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("No of wheels strated moving :" + vehicle.noOfWheels);
	}

}
