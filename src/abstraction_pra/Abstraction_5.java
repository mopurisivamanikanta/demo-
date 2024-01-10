package abstraction_pra;

abstract class Shape2D{
	void draw(){
		
	}
	void size() {
		
	}
}

class Rectangle extends Shape2D{
	void draw() {
		System.out.println("drawing");
	}
	void size() {
		System.out.println("calculate");
	}
}

class Circle extends Shape2D{
	void draw() {
		System.out.println("round");
	}
	void size() {
		System.out.println("cal");
	}
}


public class Abstraction_5 {

	public static void main(String[] args) {
		
		Rectangle jk=new Rectangle();
		jk.draw();
		jk.size();
		
		Circle kj=new Circle();
		kj.draw();
		kj.size();

	}

}
