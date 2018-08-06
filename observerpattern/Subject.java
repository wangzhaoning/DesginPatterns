package observerpattern;

public interface Subject {
	void registerObject(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
