package adapterpattern;

public class test {
	public static void main(String[] args) {
		MariaDuck duck=new MariaDuck();
		WildTurkey turkey=new WildTurkey();
		Duck turkeyadapter=new TurkeyAdapter(turkey);
		
		System.out.println("the turkey say..");
		turkey.gobble();
		turkey.fly();	
		System.out.println("test duck...");
		testDuck(duck);
		testDuck(turkeyadapter);
		//testDuck(turkey);
	}
	static void testDuck(Duck duck)
	{
		duck.fly();
		duck.quack();
	}
}
