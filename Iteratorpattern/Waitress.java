package Iteratorpattern;
import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu,Menu dinerMenu)
	{
		this.pancakeHouseMenu=pancakeHouseMenu;
		this.dinerMenu=dinerMenu;
	}
	public void printMenu() {
		Iterator pancakeIterator =pancakeHouseMenu.createIterator();
		Iterator dinerIterator=dinerMenu.createIterator();
		System.out.println("--------breakfast----------");
		printMenu(pancakeIterator);
		System.out.println("--------lunch----------");
		printMenu(dinerIterator);
	}
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext())
		{
			MenuItem menuitem =(MenuItem)iterator.next();
			System.out.print(menuitem.name+", ");
			System.out.print(menuitem.desc+", ");
			System.out.print(menuitem.price+".");
		}
	}
}
