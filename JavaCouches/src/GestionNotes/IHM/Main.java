package GestionNotes.IHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import GeneratorName.GenerateName;
import GeneratorName.GeneratorNameFact;
import GestionNotes.BLL.INotesManager;
import GestionNotes.BLL.NotesManagerFact;
import GestionNotes.BO.Eleve;
import GestionNotes.DAL.DAOFact;
import GestionNotes.DAL.EleveDALException;
import GestionNotes.DAL.EleveDAO;

public class Main {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
	
	
	  EleveDAO daoEleve = DAOFact.getEleveDAO();
	  
	 GenerateName generator = GeneratorNameFact.getInstance();
	 
	 ArrayList<Double> l = new ArrayList<Double>();
	 l.add(5.5);
	 l.add(5.5);
	 l.add(15.5);
	 l.add(20.0);
	 l.add(18.5);
	 
	  try {
		  for (int i = 0; i < 20; i++) {
			  daoEleve.insert(new Eleve(generator.GenerateLastName(),generator.GenerateFirstName(),l, "2A" ));
		}
		
	} catch (EleveDALException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	  
	  try {
		for (Eleve eleve : daoEleve.getAll()) {
			System.out.println(eleve.toString());
		}
	} catch (EleveDALException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		

	}
	
	public void test1() throws Exception, Exception {
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
		Eleve eleve2 =  new Eleve("Delarue", "Luc", "6B");
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
		
		System.out.println(manager.CalculMoyenneParClasse(eleves));
	}

}
