package descriptionpattern;

public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"add one macha!";
	}

	double Cost() {
		// TODO Auto-generated method stub
		return 0.5+beverage.Cost();
	}

}
