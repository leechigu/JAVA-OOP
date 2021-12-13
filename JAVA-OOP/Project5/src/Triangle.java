import java.awt.Point;

public class Triangle extends Shape{
	
	
	Triangle(String type,Point[] points){
		super(type,points);
		this.type = type;
		this.points = points;
	}
	@Override
	public double calcArea() {
		double area = (points[0].getY()-points[1].getY())*(points[1].getX()-points[2].getX())/2;
		if(area>0)
			return area;
		else
			return -1*area;
	}
	
}
