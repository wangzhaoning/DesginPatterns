package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019年4月29日  
 */
//这是芝士的做法
public class CheesePizza implements Pizza{
	@Override
	public String order() {
		return "i order CheesePizza";
	}
}
