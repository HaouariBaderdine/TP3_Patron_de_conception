package exemple4_observer;

import java.util.Observer;

@SuppressWarnings("deprecation")
public interface Observable {

	public void addObserver(Observer o);

	public void deleteObserver(Observer o);

	public int countObservers();

	public void notifyObservers();
}
