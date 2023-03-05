package exemple1_Factory;

public abstract class Automobile {

	public String modele;
	public String couleur;
	public String puissance;
	public double espace;

	public String afficherCaractéristiques() {
		return "Automobile [modele=" + modele + ", couleur=" + couleur + ", puissance=" + puissance + ", espace="
				+ espace + "]";
	}

}
