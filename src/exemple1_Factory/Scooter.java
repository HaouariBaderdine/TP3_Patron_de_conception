package exemple1_Factory;

public abstract class Scooter {

	public String modele;
	public String couleur;
	public String puissance;

	public String afficherCaractÃ©ristiques() {
		return "Scooter [modele=" + modele + ", couleur=" + couleur + ", puissance=" + puissance + "]";
	}

}
