package statepattern;

public class HasQuarterState implements State {
	GumballMachine gumbalmachine;
	public  HasQuarterState(GumballMachine gumbalmachine) {
		this.gumbalmachine = gumbalmachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("no insert!");
	}
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("HasQuarterState,ejectQuarter");
		gumbalmachine.setState(gumbalmachine.getNoQuarterState());
	}
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		gumbalmachine.setState(gumbalmachine.getSoldState());
	}
	@Override
	public void dispense() {
		System.out.println("no insert!");	
	}

}
