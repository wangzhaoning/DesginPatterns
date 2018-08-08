package factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
	 String name;
	String dough;
	String  sauce;
	ArrayList toppings =new ArrayList();
	
	void prepare() {
		System.out.println("preapare raw material!");
		for(int i=0;i<toppings.size();i++)
		{
			System.out.println("  "+toppings.get(i));
		}
	}
	void bake() {
		System.out.println("bake the toach!");
	}
	void cut() {
		System.out.println("cut to slices!");
		}
	void box() {
		System.out.println("package the box!");
	}
	
	public String getName() {
		return name;
	}
}
