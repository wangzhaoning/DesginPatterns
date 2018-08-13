package Iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;
	public PancakeHouseMenu() {
		menuItems=new ArrayList();
		addItem("pizza","one",19.99);
		addItem("coffee","two",9.99);
		addItem("noodle","three",16);
	}
	private void addItem(String name, String desc, double price) {
		MenuItem menuitem=new MenuItem(name,desc,price);
		menuItems.add(menuitem);
	}
	public Iterator createIterator() {
		
		return  menuItems.iterator();
	}
}
