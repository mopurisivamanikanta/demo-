package abstraction_pra;

abstract class Shape3D {
	void calculateVolume(){
		
	}
	void caluculateSurfaceArea() {
		
	}

}


class Sphere extends Shape3D{
	
	void calculateVolume() {
		System.out.println("gtr");
	}
	void caluculateSurfaceArea() {
		System.out.println("2r");
	}
}

class Cube extends Shape3D{
	
	void calculateVolume() {
		System.out.println("Gtr");
	}
	void caluculateSurfaceArea() {
		System.out.println("2rr");
	}
	
}


public class Abstraction_1{
	public static void main(String[] args) {
		
		Sphere ab=new Sphere();
		ab.calculateVolume();
		ab.caluculateSurfaceArea();
		
		Cube ba=new Cube();
		ba.calculateVolume();
		ba.caluculateSurfaceArea();	
		
	}
}