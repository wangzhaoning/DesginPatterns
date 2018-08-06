package observerpattern;

public class test {
public static void main(String[] args) {
		WeatherData weatherdata=new WeatherData();
		ConctereObject test=new ConctereObject(weatherdata);
		StaticDisplay test1=new StaticDisplay(weatherdata);
		weatherdata.setState(1, 2, 3);
		test.display();
		test1.display();
	}
}
