package exemple4_observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Notification implements Observable {

	private String content;

	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(0);
	}

	@Override
	public int countObservers() {
		// TODO Auto-generated method stub
		return observers.size();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(null, this);
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		notifyObservers();
	}

}
