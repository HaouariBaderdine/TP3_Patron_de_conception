package exemple4_obs;

public class AffichageCount implements Observer {

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		int count = ((Notification) o).countObservers();
		System.out.println("Nbr notifs: " + count);

	}

}
