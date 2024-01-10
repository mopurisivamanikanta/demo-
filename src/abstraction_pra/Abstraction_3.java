package abstraction_pra;

abstract class Person{
	void eat() {
		
	}
	void exercise() {
		
	}
}

class Athlete extends Person{
	void eat() {
		System.out.println("egg");
	}
	void exercise() {
		System.out.println("running");
	}
}

class Lazyperson extends Person{
	void eat() {
		System.out.println("oilfood");
	}
	void exercise() {
		System.out.println("sleeping");
	}
}	

public class Abstraction_3 {

	public static void main(String[] args) {
		
		Athlete df=new Athlete();
		df.eat();
		df.exercise();
		
		Lazyperson fd=new Lazyperson();
		fd.eat();
		fd.exercise();

	}

}
