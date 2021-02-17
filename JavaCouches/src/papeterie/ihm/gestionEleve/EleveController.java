package fr.formation.gestionEleves.ihm.gestionEleve;

import fr.formation.gestionEleves.bll.EleveManager;
import fr.formation.gestionEleves.bll.EleveManagerException;
import fr.formation.gestionEleves.bll.EleveManagerFact;
import fr.formation.gestionEleves.ihm.Controller;

public class EleveController extends Controller<EleveModel> {

	EleveManager manager = EleveManagerFact.getInstance();
	EleveModel model = new EleveModel();

	@Override
	public void action(String action) {
		switch (action) {
		case "START":
			startApp();
			break;
		case "ADD_ELEVE":
			addEleve();
			break;
		}
	}
	
	public void startApp() {
		try {
			model.setMoyenne(manager.getMoyenneGenerale());
		} catch (EleveManagerException e) {
			model.setMessage(e.getMessage());
		}
		updateAll(model);
	}

	public void addEleve() {
		model = populateAll(model);
		if ("".equals(model.getMessage())) {
			try {
				manager.addEleve(model.getCurrent());
			} catch (EleveManagerException e) {
				model.setMessage(e.getMessage());
			}
		}
		updateAll(model);
	}



}
