package GestionNotes.DAL;

public class DAOFact {
	public static EleveDAO getEleveDAO() {
		return new EleveDAOImpl();
	}
}
