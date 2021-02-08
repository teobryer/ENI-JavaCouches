package GestionNotes.BLL;

import java.util.ArrayList;
import java.util.List;

import GestionNotes.BO.Eleve;

public class NotesManagerTrql implements INotesManager{

	@Override
	public void AjouterEleveNote(Eleve eleve, Double note) {
		if ( note + 5 <= 20) {
		eleve.getNotes().add(note+5);
		}
		else {
			eleve.getNotes().add(20.0);
		}
		
		
	}

	@Override
	public Double CalculMoyenneGenerale(Eleve eleve) {
		Double cpt = 0.0;
		for( Double n : eleve.getNotes() ){
			cpt+= n;
		}
	
		return cpt/ ( eleve.getNotes().size());
	}

	

	@Override
	public Eleve MeilleurEleve(List<Eleve> l) {
		Eleve best = l.get(0);
		for( Eleve e : l) {
			if(CalculMoyenneGenerale(e)> CalculMoyenneGenerale(best)) {
				best = e;
			}
		}
		return null;
	}

	@Override
	public List<Double> CalculMoyenneParClasse(List<Eleve> l) {
		List<String> classes =new ArrayList<String>();
		
		for( Eleve e : l ) {
			if (!classes.contains(e.getClasse())) {
				classes.add(e.getClasse());
			}
		}
		
		List<Double> moyenneParClasse = new ArrayList<Double>();
		for ( String s : classes) {
			Double tot = 0.0 ;
			int cpt =0;
			for ( Eleve e : l ) {
				if(e.getClasse() == s) {
				cpt++;
				tot+= CalculMoyenneGenerale(e);
				}
			}
			moyenneParClasse.add(tot/cpt);
		}
		return moyenneParClasse;
	}

}