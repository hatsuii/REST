package eu.ensup.rest3jj.domaine;

public class Track {

	private String titre;
	private String auteur;

	public Track() {

	}

	public Track(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Track [titre=" + titre + ", auteur=" + auteur + "]";
	}

}
