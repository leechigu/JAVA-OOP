import java.awt.Point;

public class RectangularShapeFactory implements ShapeFactory{
	
	
	public Shape create(String type, Point[] points) {
		Shape shape =null;
		if(type.equals("Rectangle")) {
			shape = new Rectangle("Rectangle",points);
		}
		else if(type.equals("Trapezoid")) {
			shape = new Trapezoid("Trapezoid",points);
		}
		else if(type.equals("Parallelogram")) {
			shape = new Parallelogram("Parallelogram",points);
		}
		return shape;
	}
	
}
