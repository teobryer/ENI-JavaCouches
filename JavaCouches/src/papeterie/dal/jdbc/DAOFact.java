package papeterie.dal.jdbc;

public class DAOFact {
	public static ArticleDAO getArticleDAO() {
		return new ArticleDAOImpl();
	}
	
	
	public static PanierDAO getPanierDAO() {
		return new PanierDAOImpl();
	}
}
