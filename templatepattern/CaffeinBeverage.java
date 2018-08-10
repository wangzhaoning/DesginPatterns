package templatepattern;

public abstract class CaffeinBeverage {
	final void perpare() {
		 boil();
		 brew();
		 pour();
		 addCondiments();
		 hook();
	}

	 void hook() {
		// TODO Auto-generated method stub
		
	}

	abstract void addCondiments();

	private void pour() {
		// TODO Auto-generated method stub
		System.out.println("pour in cup!");
	}

	abstract void brew();

	private void boil() {
		// TODO Auto-generated method stub
		System.out.println("boil the water!");
	}
	
}
