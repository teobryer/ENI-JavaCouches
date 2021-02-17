package papeterie.ihm.gestionEleve;

import fr.formation.gestionEleves.bo.Eleve;

public class EleveModel {
	private Eleve current = new Eleve();
	private Integer moyenne = 0;
	private String message = "";

	public EleveModel() {
	}

	public EleveModel(Eleve current, Integer moyenne, String message) {
		super();
		this.current = current;
		this.moyenne = moyenne;
		this.message = message;
	}

	public Eleve getCurrent() {
		return current;
	}

	public void setCurrent(Eleve current) {
		this.current = current;
	}

	public Integer getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(Integer moyenne) {
		this.moyenne = moyenne;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EleveModel [current=" + current + ", moyenne=" + moyenne + ", message=" + message + "]";
	}

}
