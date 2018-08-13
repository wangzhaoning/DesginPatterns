package Iteratorpattern;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator{
	MenuItem[] menuitem;
	int pos=0;
	public DinerMenuIterator(MenuItem[] menuitem) {
		this.menuitem=menuitem;
	}

	public boolean hasNext() {
		if(pos>=menuitem.length||menuitem[pos]==null)
		return false;
		return true;
	}

 
	public Object next() {
		MenuItem item=menuitem[pos];
		pos++;
		return item;
	}

	public void remove() {
		if(pos<=0)
		{
			throw new IllegalStateException
			("don't remove the laset");
		}
			if(menuitem[pos-1]!=null)
			{
				for(int i=pos-1;i<(menuitem.length-1);i++) {
					menuitem[i]=menuitem[i+1];
				}
				menuitem[menuitem.length-1]=null;
			}
		}
	}
