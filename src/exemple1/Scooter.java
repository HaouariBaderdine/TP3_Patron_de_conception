package exemple1;

public abstract class Scooter {

	public String modele;
	public String couleur;
	public String puissance;

	public String afficherCaractéristiques() {
		return "Scooter [modele=" + modele + ", couleur=" + couleur + ", puissance=" + puissance + "]";
	}

}
