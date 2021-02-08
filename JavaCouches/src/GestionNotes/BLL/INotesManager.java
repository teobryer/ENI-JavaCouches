package GestionNotes.BLL;

import java.util.List;

import GestionNotes.BO.Eleve;


public interface INotesManager {

	
	/**
	 * 
	 * @author Téo
	 */
	
	/**
	 * 
	 * @param eleve Éleve à qui ajouter une note
	 * @param note Note à attribuer à l'élève
	 */
	public void AjouterEleveNote(Eleve eleve, Double note);
	
	/**
	 * 
	 * @param eleve Éleve dont on veut calculer la moyenne générale
	 * @return
	 */
	
	public Double CalculMoyenneGenerale(Eleve eleve);
	
	/**
	 * 
	 * @param l Liste des tous les élèves toutes classes confondues afin de calculer une moyenne par classe
	 * @return
	 */
	
	public List<Double> CalculMoyenneParClasse(List<Eleve> l);
	
	/**
	 * 
	 * @param l Liste parmi laquel on veut récupérer l'élève avec la meilleure moyenne générale
	 * @return
	 */
	
	public Eleve MeilleurEleve(List<Eleve> l);
	
	
}
