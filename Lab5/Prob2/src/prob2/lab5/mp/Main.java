package prob2.lab5.mp;

public class Main {

	public static void main(String[] args) {
		IArea[] areas={
			new Rectangle(2,3),new Triangle(4, 5),new Circle(3)	
		};
		double sumArea=0.0;
		for(IArea a:areas)
		{
			sumArea+=a.computeArea();
		}
		System.out.println("Sum of Areas = "+sumArea);

	}

}
