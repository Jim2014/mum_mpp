package prob2.lab5.mp;

public class Circle implements IArea {
	public Circle(double radius){
		this.radius=radius;
	}
	private double radius ;
	public double getRadius() {
		return radius;
	}
	private double PI=3.1415926;
	@Override
	public double computeArea() {		
		return PI * radius ;
	}

}
