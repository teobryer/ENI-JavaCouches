package gestionEleves.bll;

import java.util.ArrayList;
import java.util.List;

import gestionEleves.bo.Eleve;
import gestionEleves.dal.EleveDAO;
import gestionEleves.dal.EleveDAOException;
import gestionEleves.dal.EleveDAOFact;

class EleveManagerImpl implements EleveManager {
	private EleveDAO dao = EleveDAOFact.getInstance();

	@Override
	public void addEleve(Eleve eleve) throws EleveManagerException {
		// contrainte de la note entre 0 et 20
		if (eleve.getNote() < 0 || eleve.getNote() > 20) {
			throw new EleveManagerException("Note non conformes");
		}

		// contrainte de l'absence d'homonyme
		try {
			for (Eleve e : dao.getAll()) {
				if (eleve.getNom().equals(e.getNom()) && eleve.getPrenom().equals(e.getPrenom())) {
					throw new EleveManagerException("Eleve déjà présent");
				}
			}
		} catch (EleveDAOException e) {
			throw new EleveManagerException(e.getMessage());
		}

		try {
			dao.insert(eleve);
		} catch (EleveDAOException e) {
			throw new EleveManagerException(e.getMessage());
		}

	}

	@Override
	public Integer getMoyenneGenerale() throws EleveManagerException {
		Integer somme = 0;
		List<Eleve> lstEleves;
		try {
			lstEleves = dao.getAll();
		} catch (EleveDAOException e) {
			throw new EleveManagerException(e.getMessage());
		}

		for (Eleve eleve : lstEleves) {
			somme += eleve.getNote();
		}
		return somme / lstEleves.size();
	}

	@Override
	public Integer getMoyenne(String classe) throws EleveManagerException {
		Integer somme = 0;
		Integer cpt = 0;
		List<Eleve> lstEleves;
		try {
			lstEleves = dao.getAll();
		} catch (EleveDAOException e) {
			throw new EleveManagerException(e.getMessage());
		}
		for (Eleve eleve : lstEleves) {
			if (classe.equals(eleve.getClasse())) {
				somme += eleve.getNote();
				cpt++;
			}
		}
		return somme / cpt;
	}

}
