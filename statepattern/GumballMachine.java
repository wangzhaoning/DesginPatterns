package statepattern;

public class GumballMachine implements State{
	State soldState;
	State hasQuarterState;
	State noQuarterState;
	State soldOutState;
	
	State state=soldOutState;
	int count;
	
	public GumballMachine(int number) {
		soldState=new SoldState(this);
		hasQuarterState=new HasQuarterState(this);
		noQuarterState=new NoQuarterState(this);
		soldOutState=new SoldOutState(this);
		this.count=number;
		if(number>0)
			state=noQuarterState;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		state.insertQuarter();
	}
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		state.ejectQuarter();
	}
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		state.turnCrank();
	}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		state.dispense();
	}
	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state=state;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
	public void releaseBall() {
		System.out.println("a gumball comes rolling out...");
		if(count!=0)
			count=count-1;
	}
	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}
	
}
