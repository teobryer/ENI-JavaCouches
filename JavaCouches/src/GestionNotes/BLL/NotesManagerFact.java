package GestionNotes.BLL;


public class NotesManagerFact {
	public static INotesManager getInstance() {
		return new NotesManagerClassic();
	}
	
public static INotesManager choixManager(boolean gentil) {
		if(gentil) {
			return new NotesManagerTrql();
		}
		else {
			return new NotesManagerClassic();
		}
	}
}
