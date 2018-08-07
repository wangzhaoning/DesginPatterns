package descriptionpattern;

public class test {
	public static void main(String[] args) {
		Beverage test1=new HouseBlend();
		test1=new Mocha(test1);
		test1=new Milk(test1);
		System.out.println(test1.getDescription()+" "+"$"+test1.Cost());
}
}
