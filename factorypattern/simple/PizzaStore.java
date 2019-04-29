package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019��4��29��  
 */
public class PizzaStore {
	public Pizza produceCheesePizza() {
			return new CheesePizza();
		}
	public Pizza produceDurianPizza() {
		return new DurianPizza();
	}
}
