package abstraction_pra;

abstract class Vehicle{
	
	void startEngine() {
		
	}
	void stopEngine() {
		
	}
}

class Car extends Vehicle{
	
	void startEngine() {
		System.out.println("run");
	}
	void stopEngine() {
		System.out.println("stop");
	}
	
}

class Motorcycle extends Vehicle{
	void startEngine() {
		System.out.println("bikerun");
	}
	
	void stopEngine() {
		System.out.println("bikestop");
	}
}

public class Abstraction_2 {

	public static void main(String[] args) {
	
		Car ce=new Car();
		ce.startEngine();
		ce.stopEngine();
		
		Motorcycle ec=new Motorcycle();
		ec.startEngine();
		ec.stopEngine();

	}

}
