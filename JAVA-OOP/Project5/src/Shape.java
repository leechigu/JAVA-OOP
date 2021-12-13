import java.awt.Point;

public abstract class Shape {

	protected Point[] points;
	String type;
	
	public Shape(String type,Point[] points) {
		this.type =type;
		this.points = points;
	
	}
	
	public abstract double calcArea();
	
	public String toString() {
		return type +" area : "+ String.valueOf(calcArea());
	}
	
}
