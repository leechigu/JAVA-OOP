import java.awt.Point;

public interface ShapeFactory {

	public Shape create(String type, Point[] points);
	
}
