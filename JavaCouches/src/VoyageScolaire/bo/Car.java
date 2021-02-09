package VoyageScolaire.bo;

import java.util.ArrayList;
import java.util.List;

public class Car {
private Integer nbPlacesMax;
private List<Passager> listePassagers;

public Car(Integer nbPlacesMax) {
	super();
	this.nbPlacesMax = nbPlacesMax;
	this.listePassagers = new ArrayList<Passager>();
}

public List<Passager> getListePassagers() {
	return listePassagers;
}

public void setListePassagers(List<Passager> listePassagers) {
	this.listePassagers = listePassagers;
}

public Integer getNbPlacesMax() {
	return nbPlacesMax;
}

public void setNbPlacesMax(Integer nbPlacesMax) {
	this.nbPlacesMax = nbPlacesMax;
}

@Override
public String toString() {
	return "Car [nbPlacesMax=" + nbPlacesMax + "]";
}


}
