package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019��4��29��  
 */
public class NewPizza implements Pizza{

	@Override
	public String order() {
		return "Please look forward to this product!";
	}

}
