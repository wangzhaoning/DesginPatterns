package singletonpattern;

public class Singleton {
	private static final Singleton singleBean= new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleBean() {
		return singleBean;
	}
	
	public static void say() {
		System.out.println("only create a singleBean!");
	}
	
}
