package factorypattern;

public class ChiPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type.equals("chicago"))
			return new ChicagoStyleCheesePizza();
		return null;
	}

}
