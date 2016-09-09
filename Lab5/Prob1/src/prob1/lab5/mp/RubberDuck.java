package prob1.lab5.mp;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super((IFyBehavior) new CannotFly(), (IQuackBehavior)new Squeak());
	}
	@Override
	public void display() {
		System.out.println("  diplaying");

	}

}
