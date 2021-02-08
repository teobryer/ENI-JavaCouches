package GestionNotes.BLL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import GestionNotes.BO.Eleve;

public class NotesManagerClassic implements INotesManager {

	@Override
	public void AjouterEleveNote(Eleve eleve, Double note) {
		if (note  <= 20 && note >=0) {
			eleve.getNotes().add(note);
		} else if(note > 20) {
			eleve.getNotes().add(20.0);
		}
		else if(note  < 0) {
			eleve.getNotes().add(0.0);
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
		
	List<Eleve> eleves = l.stream().sorted((o1, o2)->o1.getClasse().
            compareTo(o2.getClasse())).
            collect(Collectors.toList());
			
			double tot =0.0;
			int cpt= 0;
			String olderClasse = eleves.get(0).getClasse();
			ArrayList<Double> moyenneParClasse = new ArrayList<Double>();
			for ( Eleve e : eleves){
				
				if (!e.getClasse().equals(olderClasse)) {
					olderClasse =e.getClasse();
					moyenneParClasse.add(tot/cpt);
					
					tot = 0.0;
					cpt=0;
				}
				
				tot+= CalculMoyenneGenerale(e);
				cpt++;
				}
			
			moyenneParClasse.add(tot/cpt);
			
			return moyenneParClasse;
		}
		
	

}
