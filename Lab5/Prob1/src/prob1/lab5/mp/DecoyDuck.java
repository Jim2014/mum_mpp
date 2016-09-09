package prob1.lab5.mp;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super((IFyBehavior) new CannotFly(), (IQuackBehavior)new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("  diplaying");

	}

}
