package factorypattern;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name="ChicagoStyleCheesePizza";
		dough="Extra thick";
		sauce="plus tomato sauce";
		toppings.add("sharedded mozzarella cheese!");
	}
	void cut() {
		System.out.println("cut the pizza into square slices !");
	}
}
