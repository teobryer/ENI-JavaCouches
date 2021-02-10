package papeterie.dal.jdbc;

public class DAOFact {
	public static ArticleDAO getEleveDAO() {
		return new ArticleDAOImpl();
	}
}
