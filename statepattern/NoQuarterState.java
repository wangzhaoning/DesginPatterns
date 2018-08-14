package statepattern;

public class NoQuarterState implements State{

	GumballMachine gumbalmachine;
	
	public NoQuarterState(GumballMachine gumbalmachine) {
		this.gumbalmachine = gumbalmachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you insert a quarter!");
		gumbalmachine.setState(gumbalmachine.getHasQuarterState());
	}
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("no insert!");
	}
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("no insert!");
	}
	@Override
	public void dispense() {
		System.out.println("no insert!");	
	}
}
