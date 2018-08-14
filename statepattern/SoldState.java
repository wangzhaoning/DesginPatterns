package statepattern;

public class SoldState implements State{
	GumballMachine gumbalmachine;
	
	public SoldState(GumballMachine gumbalmachine) {
		this.gumbalmachine = gumbalmachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("indentify 25 dollor!");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you already turn turnCrank!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("wait~~");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumbalmachine.releaseBall();
		if(gumbalmachine.getCount()>0) {
			gumbalmachine.setState(gumbalmachine.getNoQuarterState());
		}else {
			System.out.println("Oop,out of gumbals!");
			gumbalmachine.setState(gumbalmachine.getSoldOutState());
		}
		System.out.println("dispense!");
		
	}

}
