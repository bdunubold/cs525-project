package framework.observer;

public interface Observable {

	void notifyAllObservers(Object object);

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

}