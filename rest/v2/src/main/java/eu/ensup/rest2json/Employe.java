package eu.ensup.rest2json;

public class Employe {

	private String nom;
	private String prenom;

	public Employe() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public void poserConges() {
		System.out.println("l'employé " + this.nom + " " + this.prenom + " pose des congés.");
	}

	@Override
	public String toString() {
		return "Employe :nom=" + nom + ", prenom=" + prenom;
	}

}
