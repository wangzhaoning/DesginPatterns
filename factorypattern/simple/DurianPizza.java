package factorypattern.simple;

/**
 * @author wangzn
 * @date 2019年4月29日  
 */
//这是榴莲的做法
public class DurianPizza implements Pizza{

	@Override
	public String order() {
		return "i order DurianPizza";
	}
	
}
