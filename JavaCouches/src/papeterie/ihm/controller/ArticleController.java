package papeterie.ihm.controller;

import papeterie.dal.jdbc.ArticleDAO;
import papeterie.dal.jdbc.DALException;
import papeterie.dal.jdbc.DAOFact;
import papeterie.ihm.Controller;

import papeterie.ihm.model.ArticleModel;

public class ArticleController extends Controller<ArticleModel>  {

	public ArticleController() {
		myModel = new ArticleModel();
	}
	// partie singleton

	public ArticleModel getMyModel() {
		return myModel;
	}

	private ArticleModel myModel;
	private static ArticleController instance;

	public static ArticleController getInstance() {
		if (instance == null) {
			instance = new ArticleController();
		}
		return instance;
	}

	// partie actions
	private ArticleDAO manager = DAOFact.getArticleDAO();

	String message = "";

	public void startApp() {
		updateAll(myModel);
	}

	public void addArticle() {
		
		myModel = populateAll(myModel);
		try {
			manager.insert(myModel.generatedArticle());
			myModel.
			setMessage("INSERTION REUSSIE MAGGLE!");
		} catch (DALException e) {
			message = e.getMessage();
			myModel.setMessage("PROBLEME LORS DE L'INSERTION MAGGLE :  " + e.getMessage());
		}
		
		updateAll(myModel);

	}

	public String getMessage() {
		return message;
	}
	@Override
	public void action(String action) {
		switch (action) {
		case "START":
			startApp();
			break;
		case "ADD_ARTICLE":
			addArticle();
			break;
		}
		
	}
}
