import java.awt.Point;

public class Parallelogram extends Shape{
	
	
	Parallelogram(String type,Point[] points){
		super(type, points);
		this.type = type;
		this.points = points;
	}
	
	
	@Override
	public double calcArea() {
		double area =(points[0].getX()-points[3].getX())*(points[0].getY()-points[1].getY());
		if(area>0)
			return area;
		else
			return -1*area;
	}


}
