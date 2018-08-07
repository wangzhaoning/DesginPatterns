package descriptionpattern;

public class Milk extends CondimentDecorator{

	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage=beverage;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"add one milk!";
	}

	double Cost() {
		// TODO Auto-generated method stub
		return 0.5+beverage.Cost();
	}

}
