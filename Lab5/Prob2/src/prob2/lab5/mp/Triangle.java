package prob2.lab5.mp;

public class Triangle implements IArea {
    public Triangle(double base,double height)
    {
    	
    }
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	private double base;
	private double height;
	
	@Override
	public double computeArea() {		
		return 0.5*base * height;
	}

}
