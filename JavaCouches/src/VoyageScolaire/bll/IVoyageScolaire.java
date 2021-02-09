package VoyageScolaire.bll;

import java.util.List;

import VoyageScolaire.bo.Car;
import VoyageScolaire.bo.Passager;

public interface IVoyageScolaire {

	public Car saisirUnCar(Integer nbPlacesMax);
	
	public void ajouterPassagers(List<Passager> passagerAAjouter, Car c) throws Exception;
	
	public List<Car> RecupererTousLesCars();
	
	public void AfficherContenuDeChaqueCar();
	
	
}
