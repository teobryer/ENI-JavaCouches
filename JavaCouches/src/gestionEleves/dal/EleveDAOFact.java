package gestionEleves.dal;

public class EleveDAOFact {

	public static EleveDAO getInstance() {
		return new EleveDAOImpl();
	}

}
