package GestionNotes.BO;

import java.util.ArrayList;
import java.util.List;

public class Eleve {
	
	String lastName;
	String firstName;
	List<Double> notes;
	String classe;
	
	
	public Eleve(String lastName, String firstName, List<Double> notes, String classe) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.notes = notes;
		this.classe = classe;
	}
	
	public Eleve(String lastName, String firstName, String classe) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.notes = new ArrayList<Double>();
		this.classe = classe;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public List<Double> getNotes() {
		return notes;
	}


	public void setNotes(List<Double> notes) {
		this.notes = notes;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
 
	

}
