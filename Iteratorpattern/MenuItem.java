package Iteratorpattern;

public class MenuItem {
	String name;
	String desc;
	double price;
	public MenuItem(String name,String desc,double price) {
		this.name=name;
		this.desc=desc;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public double getPrice() {
		return price;
	}
}
