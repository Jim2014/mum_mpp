package prob1.lab5.mp;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super((IFyBehavior) new FlyWithWings(), (IQuackBehavior)new Quack());
	}

	@Override
	public void display() {
		System.out.println("  diplay");

	}

}
