import java.awt.Point;

public class Rectangle extends Shape{
	
	
	
	
	Rectangle(String type, Point[] points){
		super(type, points);
		this.type = type;
		this.points = points;
	}
	@Override
	public double calcArea() {
		
		double clac = (points[0].getX()-points[1].getX())*(points[0].getY()-points[1].getY());
		if(clac>0)
			return clac;
		else
			return -1*clac;
	}

}
