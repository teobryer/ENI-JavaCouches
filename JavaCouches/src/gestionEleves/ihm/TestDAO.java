package gestionEleves.ihm;

import gestionEleves.bo.Eleve;
import gestionEleves.dal.EleveDAO;
import gestionEleves.dal.EleveDAOException;
import gestionEleves.dal.EleveDAOFact;

public class TestDAO {

	public static void main(String[] args) throws EleveDAOException {
		EleveDAO dao = EleveDAOFact.getInstance();
		Eleve e =new Eleve("Cérien","Jean",15,"DL");
		System.out.println(e);
		e = dao.insert(e);
		System.out.println(e);

		System.out.println(dao.getAll());
		

	}

}
