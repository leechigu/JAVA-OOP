import java.awt.Point;

public class Trapezoid extends Shape{
	
	Trapezoid (String type,Point[] points){
		super(type, points);
		this.type = type;
		this.points = points;
	}
	
	@Override
	public double calcArea() {
		double area =(points[0].getX()-points[3].getX())+(points[1].getX()-points[2].getX())
		*(points[0].getY()-points[1].getY())/2;
		if(area>0)
			return area;
		else
			return -1*area;
	}

}
