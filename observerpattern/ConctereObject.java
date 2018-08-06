package observerpattern;

public class ConctereObject implements Observer,DisplayElement{
	private float tem;
	private float humidity;
	private Subject weatherData;
	public ConctereObject(Subject weatherData)
	{
		this.weatherData=weatherData;
		weatherData.registerObject(this);
	}
	@Override
	public void update(float tem,float humidity,float pressure) {
		// TODO Auto-generated method stub
		this.tem=tem;
		this.humidity=humidity;
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + tem + "F degrees and "+ humidity +"% humidity");
		// TODO Auto-generated method stub
	}
}
