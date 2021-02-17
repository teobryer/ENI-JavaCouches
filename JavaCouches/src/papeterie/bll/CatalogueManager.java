package papeterie.bll;

import java.util.List;

import papeterie.bo.Article;
import papeterie.bo.Ramette;
import papeterie.bo.Stylo;
import papeterie.dal.jdbc.ArticleDAO;
import papeterie.dal.jdbc.DALException;
import papeterie.dal.jdbc.DAOFact;



/**
 * @author Eni Ecole
 * 
 */
public class CatalogueManager {
	
	private static ArticleDAO daoArticles;

	public CatalogueManager() throws BLLException{
			//Instancier le Data Access Object
		 	daoArticles =DAOFact.getArticleDAO();
	}
	
	
	public List<Article> getCatalogue() throws BLLException{
		List<Article> articles=null;
		try {
			articles = daoArticles.selectAll();
		} catch (DALException e) {
			e.printStackTrace();
			throw new BLLException("Erreur récupération catalogue", e);
		}
		
		return articles;
	}

	
	/**
	 * Ajout d'un article au catalogue
	 * @param newArticle
	 * @return index du nouvel article dans le catalogue
	 * @throws BLLException 
	 */
	public void addArticle(Article newArticle) throws BLLException {
		if(newArticle.getIdArticle()!=null){
			throw new BLLException("Article deja existant.");
		}
		try {
			validerArticle(newArticle);
			daoArticles.insert(newArticle);
		} catch (DALException e) {
			throw new BLLException("Echec addArticle", e);
		}
	}

	/**
	 * updateArticle : Modifier un article du catalogue
	 * @param article
	 * @throws BLLException
	 */
	public void updateArticle(Article article) throws BLLException{
		try {
			validerArticle(article);
			daoArticles.update(article);
			
		} catch (DALException e) {
			throw new BLLException("Echec updateArticle-article:"+article, e);
		}
	}
	
	
	
	
	/**
	 * Supprimer un article du catalogue
	 * @param index
	 * @throws BLLException
	 */
	public void removeArticle(Article article) throws BLLException{
		try {
			daoArticles.delete(article.getIdArticle());
		} catch (DALException e) {
			throw new BLLException("Echec de la suppression de l'article - ", e);
		}
		
	}
	
	/**
	 * Valider les données d'un article
	 * @param a
	 * @throws BLLException
	 */
	public void validerArticle(Article a) throws BLLException
	{
		boolean valide = true;
		StringBuffer sb = new StringBuffer();
		
		if(a==null){
			throw new BLLException("Article null");
		}
		//Les attributs des articles sont obligatoires
		if(a.getReference()==null || a.getReference().trim().length()==0){
			sb.append("La reference article est obligatoire.\n");
			valide = false;
		}
		if(a.getMarque()==null || a.getMarque().trim().length()==0){
			sb.append("La marque  est obligatoire.\n");
			valide = false;
		}
		if(a.getDesignation()==null || a.getDesignation().trim().length()==0){
			sb.append("La designation  est obligatoire.\n");
			valide = false;
		}
		if(a instanceof Ramette && ((Ramette)a).getGrammage()<=0){
			sb.append("Le grammage doit avoir une valeur positive.\n");
			valide = false;
		}
		if(a instanceof Stylo ){
			Stylo s = (Stylo) a;
			if(s.getCouleur()==null || s.getCouleur().trim().length()==0){
				sb.append("La couleur pour un stylo  est obligatoire.\n");
				valide = false;
			}
		}
		
		if(!valide){
			throw new BLLException(sb.toString());
		}

	}
	
	

}
