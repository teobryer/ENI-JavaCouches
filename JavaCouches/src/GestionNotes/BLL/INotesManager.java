package GestionNotes.BLL;

import java.util.List;

import GestionNotes.BO.Eleve;


public interface INotesManager {

	
	/**
	 * 
	 * @author T�o
	 */
	
	/**
	 * 
	 * @param eleve �leve � qui ajouter une note
	 * @param note Note � attribuer � l'�l�ve
	 */
	public void AjouterEleveNote(Eleve eleve, Double note);
	
	/**
	 * 
	 * @param eleve �leve dont on veut calculer la moyenne g�n�rale
	 * @return
	 */
	
	public Double CalculMoyenneGenerale(Eleve eleve);
	
	/**
	 * 
	 * @param l Liste des tous les �l�ves toutes classes confondues afin de calculer une moyenne par classe
	 * @return
	 */
	
	public List<Double> CalculMoyenneParClasse(List<Eleve> l);
	
	/**
	 * 
	 * @param l Liste parmi laquel on veut r�cup�rer l'�l�ve avec la meilleure moyenne g�n�rale
	 * @return
	 */
	
	public Eleve MeilleurEleve(List<Eleve> l);
	
	
}
