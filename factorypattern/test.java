package factorypattern;

public class test {
	public static void main(String[] args) {
		PizzaStore store =new NcPizzaStore();
		PizzaStore store1= new ChiPizzaStore();
		
		Pizza pizza=store.ordPizza("cheese");
		System.out.println("Ethan order a "+pizza.getName());
		Pizza pizza1=store1.ordPizza("chicago");
		System.out.println("wng order a "+pizza1.getName());
	}
	
	
}
