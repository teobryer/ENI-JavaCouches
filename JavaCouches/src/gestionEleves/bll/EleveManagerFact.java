package gestionEleves.bll;

public class EleveManagerFact {
	
	private EleveManagerFact() {
	}
	
	public static EleveManager getInstance() {
		return new EleveManagerImpl();
	}
}
