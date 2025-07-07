package abstractionclassdemo;

public class Square {

	float side;

	public Square() {
		
		side =2.0f;		
	}
	public Square(float side) {
	
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	


}
