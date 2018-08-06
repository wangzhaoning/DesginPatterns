package observerpattern;

public class StaticDisplay	implements Observer,DisplayElement {
	private float tem;
	private float humidity;
	private float pressure;
	Subject weatherdata;
	public StaticDisplay(Subject weatherdata) {
		this.weatherdata=weatherdata;
		weatherdata.registerObject(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("now!pressure is "+pressure+" ~`");
	}

	@Override
	public void update(float tem, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.tem=tem;
		this.humidity=humidity;
		this.pressure=pressure;
	}
}
