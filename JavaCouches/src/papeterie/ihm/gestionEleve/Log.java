package papeterie.ihm.gestionEleve;

import fr.formation.gestionEleves.ihm.ObserverController;

public class Log implements ObserverController<EleveModel>{

	public Log(EleveController controller) {
		controller.addObserver(this);
	}

	@Override
	public void fromModel(EleveModel model) {
		System.out.println(model);
	}

	@Override
	public EleveModel populateModel(EleveModel model) {
		return model;
	}

}
