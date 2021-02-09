package VoyageScolaire.bo;

public class Lyceen extends Passager {

	
	private String classe;
	public Lyceen(String nom, String prenom, String classe) {
		super(nom, prenom);
		this.classe = classe;
	
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	@Override
	public String toString() {
		return prenom + " " +  nom + " en " + classe ;
	}
	

	
}
