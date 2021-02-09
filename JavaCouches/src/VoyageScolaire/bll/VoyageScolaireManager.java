package VoyageScolaire.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import VoyageScolaire.bo.Car;
import VoyageScolaire.bo.Lyceen;
import VoyageScolaire.bo.Passager;
import VoyageScolaire.bo.Professeur;

public class VoyageScolaireManager implements IVoyageScolaire {

	
	public static List<Car> listeCars = new ArrayList<Car>();
	@Override
	public Car saisirUnCar(Integer nbPlacesMax) {
		Car newCar = new Car(nbPlacesMax);
		listeCars.add(newCar);
		return newCar;
	}

	@Override
	public void ajouterPassagers(List<Passager> passagerAAjouter, Car c) throws Exception {
		List<Passager> newList = c.getListePassagers();
		newList.addAll(passagerAAjouter); 
		
		Integer nbProf = newList.stream().filter((Passager p)-> (p instanceof Professeur)).collect(Collectors.toList()).size();
		Integer nbLyceen = newList.stream().filter((Passager p)-> (p instanceof Lyceen)).collect(Collectors.toList()).size();
		Integer nbProfNecessaire = nbLyceen/10;
		if(nbProf>=nbProfNecessaire) {
			c.setListePassagers(newList);
		}
		else {
			throw new Exception("Pas assez de professeurs pour le nombre d'élèves");
		}

	}

	@Override
	public List<Car> RecupererTousLesCars() {
		// TODO Auto-generated method stub
		return listeCars;
	}
	
	public void AfficherContenuDeChaqueCar() {
		int cpt = 0;
		for (Car car : listeCars) {
			System.out.println("Car numéro "+ cpt );
			for (Passager p : car.getListePassagers()) {
			System.out.println(p.toString());	
			}
		cpt++;
		}
	}

}
