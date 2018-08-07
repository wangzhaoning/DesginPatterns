package descriptionpattern;

public abstract class Beverage {
	String description="no drink!";
	
	public String getDescription()
	{
		return description;
	}
	abstract double Cost();
}
