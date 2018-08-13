package Iteratorpattern;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
		DinerMenu dinermenu=new DinerMenu();
		Waitress waitress=new Waitress( pancakeHouseMenu,dinermenu);
		waitress.printMenu();
	}
}
