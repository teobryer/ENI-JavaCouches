package VoyageScolaire.bo;

public class Professeur extends Passager {
	private String matiere;
	
	public Professeur(String nom, String prenom, String mat) {
		super(nom, prenom);
		this.matiere = mat;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return prenom + " " +  nom + " professeur de  " + matiere ;
	}

	
	
	
}
