package strategypattern;

public class Duck {
	public  QuackBehavior quackbehavior;
	public FlyBehavior flybehavior;
	public void performQuack() {
		quackbehavior.quack();
	}
	public void performFly() {
		flybehavior.fly();
	}
	public void SetQuack(QuackBehavior qb)
	{
		this.quackbehavior=qb;
	}
	public void SetFly(FlyBehavior fy)
	{
		this.flybehavior=fy;
	}
}
