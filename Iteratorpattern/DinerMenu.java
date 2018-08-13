package Iteratorpattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems=new MenuItem[MAX_ITEMS];
	addItem("apple","a red",1.2);
	addItem("banana","yellow",1.5);
	addItem("orange","green",2.0);
	}
	void addItem(String name,String desc,double price) {
		MenuItem menu=new MenuItem(name,desc,price);
		if(numberOfItems>MAX_ITEMS)
		{
			System.out.println("full!!!");
		}
		else {
			menuItems[numberOfItems]=menu;
			numberOfItems++;
		}
	}
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
