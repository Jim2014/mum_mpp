package prob2.lab5.mp;

public class Rectangle implements IArea {

	private double width;
	private double height;
	@Override
	public double computeArea() {		
		return width * height;
	}

}
