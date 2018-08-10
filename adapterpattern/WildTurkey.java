package adapterpattern;

public class WildTurkey implements Turkey{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i'm wildturkey, i wanna fly!!");
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("i'm wildTurkey,i don't quack...");
	}

}
