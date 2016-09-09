package prob1.lab5.mp;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		super((IFyBehavior) new FlyWithWings(), (IQuackBehavior)new Quack());
	}
	@Override
	public void display() {
		System.out.println("  diplaying");

	}

}
