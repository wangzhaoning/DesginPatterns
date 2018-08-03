package strategypattern;

public class MiniDuckTest {
	public static void main(String[] args) {
		Duck duck =new MallardDuck();
		duck.SetQuack(new MuteQuack());
		duck.SetFly(new FlyRocket());
		duck.performQuack();
		duck.performFly();
	}
}
