package statepattern;

public class SoldOutState implements State {

	GumballMachine gumbalmachine;
	
	public SoldOutState(GumballMachine gumbalmachine) {
		this.gumbalmachine = gumbalmachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("SoldOutState");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("SoldOutState");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("SoldOutState");
	}

	@Override
	public void dispense() {
		
		System.out.println("SoldOutState");
		
	}
}
