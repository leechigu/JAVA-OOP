import java.awt.Point;

public class TriangularShapeFactory implements ShapeFactory{
	
	public Shape create(String type, Point[] points) {
		Shape shape =null;
		if(type.equals("Triangle")) {
			shape = new Triangle("Triangle",points);
		}
		else if(type.equals("RightTriangle")) {
			shape = new RightTriangle("RightTriangle",points);
		}
		return shape;
		
	}

}
