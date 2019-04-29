package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019Äê4ÔÂ29ÈÕ  
 */
public class StoreTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore=new  PizzaStore();
		Pizza pizzaTest1=pizzaStore.produceCheesePizza();
		Pizza pizzaTest2=pizzaStore.produceDurianPizza();
		System.out.println(pizzaTest1.order());
		System.out.println(pizzaTest2.order());
	}
}
