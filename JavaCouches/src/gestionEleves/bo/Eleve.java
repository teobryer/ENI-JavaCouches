package gestionEleves.bo;

public class Eleve {
	private Integer idEleve;
	private String nom;
	private String prenom;
	private Integer note;
	private String classe;

	public Eleve() {
	}

	public Eleve(String nom, String prenom, Integer note, String classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
		this.classe = classe;
	}

	public Integer getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(Integer idEleve) {
		this.idEleve = idEleve;
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

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Eleve [idEleve=" + idEleve + ", nom=" + nom + ", prenom=" + prenom + ", note=" + note + ", classe="
				+ classe + "]";
	}

}
