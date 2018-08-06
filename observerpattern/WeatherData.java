package observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float tem;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers = new ArrayList();
	}
	public void registerObject(Observer o) {
		// TODO Auto-generated method stub
			observers.add(o);
		}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0) observers.remove(i);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++)
		{
			Observer observer =(Observer)observers.get(i);
			observer.update(tem, humidity, pressure);
		}
	}
	public void measurementChanged() {
		notifyObserver();
	}
	public void setState(float tem,float humidity,float pressure) {
		this.tem=tem;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementChanged();
	}

}
