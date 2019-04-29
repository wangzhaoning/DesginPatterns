package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019Äê4ÔÂ29ÈÕ  
 */
public class PizzaStore {
	public Pizza produceCheesePizza() {
			return new CheesePizza();
		}
	public Pizza produceDurianPizza() {
		return new DurianPizza();
	}
}
