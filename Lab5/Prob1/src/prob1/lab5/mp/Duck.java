package prob1.lab5.mp;

public abstract class Duck {

	private IFyBehavior flyBehavior;
	private IQuackBehavior quackBeavior;
    public Duck(IFyBehavior fBehavior,IQuackBehavior qBehavior)
    {
    	this.flyBehavior=fBehavior;
    	this.quackBeavior=qBehavior;
    }
	
	public void quack() {
		quackBeavior.quack();

	}


	public void fly() {
		flyBehavior.fly();

	}
	public void swim(){
		System.out.println("  swimming");
	};
	abstract public void display();

}
