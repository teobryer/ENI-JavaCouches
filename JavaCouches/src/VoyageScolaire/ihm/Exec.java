package VoyageScolaire.ihm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import GeneratorName.GenerateName;
import GeneratorName.GeneratorNameFact;

import VoyageScolaire.bll.IVoyageScolaire;
import VoyageScolaire.bll.VoyageScolaireManagerFact;
import VoyageScolaire.bo.Car;
import VoyageScolaire.bo.Lyceen;
import VoyageScolaire.bo.Passager;
import VoyageScolaire.bo.Professeur;
import calculatrice.bll.CalculManagerFact;
import calculatrice.bll.CalculatriceManager;

public class Exec {

	public static void main(String[] args) {
		
		List<Passager> maListe= GenerateListPassagerValide(20);
		
		List<Passager> maListe2= GenerateListPassagerValide(15);
		
		IVoyageScolaire managerVoyage = VoyageScolaireManagerFact.getInstance();
		
		Car car1 = managerVoyage.saisirUnCar(50);
		Car car2 = managerVoyage.saisirUnCar(38);
		
		try {
			managerVoyage.ajouterPassagers(maListe, car1);
			managerVoyage.ajouterPassagers(maListe2, car2);
			
			managerVoyage.AfficherContenuDeChaqueCar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	private static List<Passager> GenerateListPassagerValide(int nb){
		GenerateName manager = GeneratorNameFact.getInstance();
		ArrayList<Passager> list = new ArrayList<Passager>();
		String[] classes=  new String[]{"S1","S2","S3"};
		for (int i = 0; i < nb; i++) {
			Random rand = new Random(); 
			String classe = classes[rand.nextInt(classes.length)];
			list.add(new Lyceen(manager.GenerateLastName(), manager.GenerateFirstName(),classe));
		}
		String[] matieres=  new String[]{"Français","Maths","Physique"};
		for (int i = 0; i < nb/10+1; i++) {
			Random rand = new Random(); 
			String matiere = matieres[rand.nextInt(matieres.length)];
			list.add(new Professeur(manager.GenerateLastName(), manager.GenerateFirstName(),matiere));
		}
		return list;
		
	}
	
	

}
