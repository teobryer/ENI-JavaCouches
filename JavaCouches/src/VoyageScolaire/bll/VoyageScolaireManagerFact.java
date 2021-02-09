package VoyageScolaire.bll;



public class VoyageScolaireManagerFact {
	
	public static IVoyageScolaire getInstance() {
		return new VoyageScolaireManager();
	}

}
