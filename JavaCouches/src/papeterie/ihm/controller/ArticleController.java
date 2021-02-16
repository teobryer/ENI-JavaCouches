package papeterie.ihm.controller;

import papeterie.dal.jdbc.ArticleDAO;
import papeterie.dal.jdbc.DALException;
import papeterie.dal.jdbc.DAOFact;
import papeterie.ihm.model.ArticleModel;

public class ArticleController {

	

    private ArticleController() {
		myModel = new ArticleModel();
	}
	// partie singleton
	
	public ArticleModel getMyModel() {
		return myModel;
	}

	

	private ArticleModel myModel;
		private static ArticleController instance;
		public static ArticleController getInstance() {
			if(instance==null) {
				instance = new ArticleController();
			}
			return instance;
		}
		
		
		
		// partie actions
		private ArticleDAO manager = DAOFact.getArticleDAO();
		
		String message = "";
		
		public void startApp() {
			
		}
		
		public void addArticle() {
			try {
			manager.insert(myModel.generatedArticle());
			}
		catch (DALException e){
			message = e.getMessage();
		}
			
		}
		
		
		
		public String getMessage() {
			return message;
		}
}
