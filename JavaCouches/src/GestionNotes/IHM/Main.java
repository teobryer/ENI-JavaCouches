package GestionNotes.IHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import GestionNotes.BLL.INotesManager;
import GestionNotes.BLL.NotesManagerFact;
import GestionNotes.BO.Eleve;

public class Main {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Bonjour");
		System.out.println("Choix du mode de sévérité :  0 normal / 1 plus gentil ");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int choice =Integer.parseInt(in.readLine());
		INotesManager manager;
		if(choice ==1) {
			 manager = NotesManagerFact.choixManager(true);
		}
		else {
			manager = NotesManagerFact.choixManager(false);
		}

		
		Eleve eleve1 =  new Eleve("Doe", "John", "6A");
		Eleve eleve2 =  new Eleve("Delarue", "Luc", "6A");
		Eleve eleve3 =  new Eleve("Patrick", "John", "6B");
		Eleve eleve4 =  new Eleve("Dutertre", "Laurent", "6B");
		Eleve eleve5 =  new Eleve("Lou", "Marie", "6C");
		Eleve eleve6 =  new Eleve("Titouan", "Durant", "6C");
		Eleve eleve7 =  new Eleve("Ali", "Marine", "6C");
		
		
		List<Eleve> eleves = new ArrayList<Eleve>();
		
		eleves.add(eleve1);
		eleves.add(eleve2);
		eleves.add(eleve3);
		eleves.add(eleve4);
		eleves.add(eleve5);
		eleves.add(eleve6);
		eleves.add(eleve7);
		
		for (Eleve e : eleves) {
			for( int i =0; i< 10; i ++) {
				manager.AjouterEleveNote(e, 0 + (double)(Math.random() * ((20 - 0) + 1)));
			}
		}
		
		
		for (Eleve e : eleves) {
			System.out.println(e.getFirstName() +" " + e.getLastName()+" : "+ manager.CalculMoyenneGenerale(e));
		}
	
	
		
		
		
		

	}

}
