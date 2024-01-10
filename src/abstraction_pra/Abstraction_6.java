package abstraction_pra;

abstract class Bird{
	void fly() {
		
	}
	void makeSound() {
		
	}
}

class Eagle extends Bird{
	void fly() {
		System.out.println("flyyyyy");
	}
	void makeSound() {
		System.out.println("echhh");
	}
}

class Hawk extends Bird {
	void fly() {
		System.out.println("uyy");
	}
	void makeSound() {
		System.out.println("aqqss");
	}
}

public class Abstraction_6 {

	public static void main(String[] args) {
		
		Eagle zx=new Eagle();
		zx.fly();
		zx.makeSound();
		
		Hawk xz=new Hawk();
		xz.fly();
		xz.makeSound();

	}

}
