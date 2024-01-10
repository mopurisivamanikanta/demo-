package java123;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rt = new Rectangle(33, 44); 

		
		int bth = rt.getBreadth(); 
		int lth = rt.getLength();
		int Area = lth * bth; 
		System.out.println("Area: " +Area); 

		 rt.setBreadth(33); 
		 rt.setLength(99);
		int ln = rt.getLength();
		int br = rt.getBreadth();
		int newArea = ln * br; 
		System.out.println("New area: " +newArea); 
	
	}
}
