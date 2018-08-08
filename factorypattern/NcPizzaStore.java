package factorypattern;

public class NcPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new MyStyleCheesePizza();
		return null;
	}

}
