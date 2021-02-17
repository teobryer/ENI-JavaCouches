package papeterie.ihm.view;

import papeterie.ihm.Controller;
import papeterie.ihm.ObserverController;
import papeterie.ihm.model.ArticleModel;

public class Log implements ObserverController<ArticleModel> {

	private Controller<ArticleModel> controller;
	
	public Log(Controller<ArticleModel> controller) {
		this.controller = controller;
		this.controller.addObserver(this);
	}
	@Override
	public void fromModel(ArticleModel model) {
		System.out.println(model);
		
	}

	@Override
	public ArticleModel populateModel(ArticleModel model) {
		// TODO Auto-generated method stub
		return model;
	}

}
