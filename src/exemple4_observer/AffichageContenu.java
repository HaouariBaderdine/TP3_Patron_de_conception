package exemple4_observer;

public class AffichageContenu implements Observer {

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		String contenu = ((Notification) o).getContent();
		System.out.println("Contenu: " + contenu);
	}

}
