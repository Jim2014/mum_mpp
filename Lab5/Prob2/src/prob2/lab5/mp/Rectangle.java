package prob2.lab5.mp;

public class Rectangle implements IArea {
	public Rectangle(double width,double height){
		this.height=height;
		this.width=width;
	}
	private double width;
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	private double height;
	@Override
	public double computeArea() {		
		return width * height;
	}

}
